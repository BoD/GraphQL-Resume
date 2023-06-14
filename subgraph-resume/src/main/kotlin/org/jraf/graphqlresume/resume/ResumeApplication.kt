package org.jraf.graphqlresume.resume

import com.apollographql.federation.graphqljava.Federation
import com.apollographql.federation.graphqljava.tracing.FederatedTracingInstrumentation
import org.jraf.graphqlresume.resume.model.Date
import org.jraf.graphqlresume.resume.model.Email
import org.jraf.graphqlresume.resume.model.Language
import org.jraf.graphqlresume.resume.model.Meta
import org.jraf.graphqlresume.resume.model.Resume
import org.jraf.graphqlresume.resume.model.Url
import org.jraf.graphqlresume.resume.repository.MetaRepository
import org.jraf.graphqlresume.resume.repository.ResumeRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.execution.RuntimeWiringConfigurer
import org.springframework.stereotype.Controller

@SpringBootApplication
class ResumeApplication

@Controller
class ResumeController {
  @QueryMapping
  fun resume(@Argument language: Language): Resume {
    return ResumeRepository.getResume(language)
  }

  @QueryMapping
  fun meta(): Meta {
    return MetaRepository.getMeta()
  }
}

@Controller
class GraphQlConfig {
  @Bean
  fun runtimeWiringConfigurer(): RuntimeWiringConfigurer {
    return RuntimeWiringConfigurer { builder ->
      builder
        .scalar(Url)
        .scalar(Date)
        .scalar(Email)
    }
  }

  @Bean
  fun federationTransform(): GraphQlSourceBuilderCustomizer {
    return GraphQlSourceBuilderCustomizer { builder ->
      builder.schemaFactory { registry, wiring ->
        Federation.transform(registry, wiring)
          .fetchEntities { null }
          .resolveEntityType { null }
          .build()
      }
        // Enable field level tracing
        // See https://www.apollographq.com/docs/router/configuration/apollo-telemetry/
        .instrumentation(listOf(FederatedTracingInstrumentation()))
    }
  }
}

fun main(args: Array<String>) {
  runApplication<ResumeApplication>(*args)
}
