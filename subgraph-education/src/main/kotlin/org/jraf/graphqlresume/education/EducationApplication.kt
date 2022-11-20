package org.jraf.graphqlresume.education

import org.jraf.graphqlresume.education.model.Language
import org.jraf.graphqlresume.education.model.Resume
import org.jraf.graphqlresume.education.model.Url
import org.jraf.graphqlresume.education.repository.EducationRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.execution.RuntimeWiringConfigurer
import org.springframework.stereotype.Controller

@SpringBootApplication
class EducationApplication

@Controller
class ExperienceController {
  @QueryMapping
  fun resume(@Argument language: Language): Resume {
    return EducationRepository.getResume(language)
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
  runApplication<EducationApplication>(*args)
}
