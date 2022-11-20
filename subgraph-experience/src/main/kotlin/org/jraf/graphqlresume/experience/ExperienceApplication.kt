package org.jraf.graphqlresume.experience

import org.jraf.graphqlresume.experience.model.Language
import org.jraf.graphqlresume.experience.model.Resume
import org.jraf.graphqlresume.experience.model.Url
import org.jraf.graphqlresume.experience.repository.ExperienceRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.execution.RuntimeWiringConfigurer
import org.springframework.stereotype.Controller

@SpringBootApplication
class ExperienceApplication

@Controller
class IdentityController {
  @QueryMapping
  fun resume(@Argument language: Language): Resume {
    return ExperienceRepository.getResume(language)
  }
}

@Controller
class GraphQlConfig {
  @Bean
  fun runtimeWiringConfigurer(): RuntimeWiringConfigurer {
    return RuntimeWiringConfigurer { builder ->
      builder
        .scalar(Url)
    }
  }
}


fun main(args: Array<String>) {
  runApplication<ExperienceApplication>(*args)
}
