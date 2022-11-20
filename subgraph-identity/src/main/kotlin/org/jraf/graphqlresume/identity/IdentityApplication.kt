package org.jraf.graphqlresume.identity

import org.jraf.graphqlresume.identity.model.Date
import org.jraf.graphqlresume.identity.model.Email
import org.jraf.graphqlresume.identity.model.Language
import org.jraf.graphqlresume.identity.model.Meta
import org.jraf.graphqlresume.identity.model.Resume
import org.jraf.graphqlresume.identity.repository.IdentityRepository
import org.jraf.graphqlresume.identity.repository.MetaRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.execution.RuntimeWiringConfigurer
import org.springframework.stereotype.Controller

@SpringBootApplication
class IdentityApplication

@Controller
class IdentityController {
  @QueryMapping
  fun resume(@Argument language: Language): Resume {
    return IdentityRepository.getResume(language)
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
        .scalar(Email)
        .scalar(Date)
    }
  }
}


fun main(args: Array<String>) {
  runApplication<IdentityApplication>(*args)
}
