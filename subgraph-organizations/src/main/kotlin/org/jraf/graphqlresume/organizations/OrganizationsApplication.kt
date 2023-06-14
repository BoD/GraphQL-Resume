package org.jraf.graphqlresume.organizations

import com.apollographql.federation.graphqljava.Federation
import com.apollographql.federation.graphqljava._Entity
import com.apollographql.federation.graphqljava.tracing.FederatedTracingInstrumentation
import graphql.schema.DataFetcher
import graphql.schema.TypeResolver
import org.jraf.graphqlresume.organizations.model.Organization
import org.jraf.graphqlresume.organizations.model.Url
import org.jraf.graphqlresume.organizations.repository.OrganizationsRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.graphql.execution.RuntimeWiringConfigurer
import org.springframework.stereotype.Controller

@SpringBootApplication
class OrganizationsApplication

@Controller
class GraphQlConfig {
  @Bean
  fun runtimeWiringConfigurer(): RuntimeWiringConfigurer {
    return RuntimeWiringConfigurer { builder ->
      builder
        .scalar(Url)
    }
  }

  @Bean
  fun federationTransform(): GraphQlSourceBuilderCustomizer {
    val entityDataFetcher: DataFetcher<*> = DataFetcher { env ->
      val representations: List<Map<String, Any>> = env.getArgument(_Entity.argumentName)
      representations.map { representation ->
        if (representation["__typename"] == "Organization") {
          OrganizationsRepository.getOrganization(representation["id"] as String)
        } else {
          null
        }
      }
    }
    val entityTypeResolver = TypeResolver { env ->
      val src = env.getObject<Any>()
      if (src is Organization) {
        env.schema.getObjectType("Organization")
      } else {
        null
      }
    }
    return GraphQlSourceBuilderCustomizer { builder ->
      builder.schemaFactory { registry, wiring ->
        Federation.transform(registry, wiring)
          .fetchEntities(entityDataFetcher)
          .resolveEntityType(entityTypeResolver)
          .build()
      }
        // Enable field level tracing
        // See https://www.apollographql.com/docs/router/configuration/apollo-telemetry/
        .instrumentation(listOf(FederatedTracingInstrumentation()))
    }
  }
}


fun main(args: Array<String>) {
  runApplication<OrganizationsApplication>(*args)
}
