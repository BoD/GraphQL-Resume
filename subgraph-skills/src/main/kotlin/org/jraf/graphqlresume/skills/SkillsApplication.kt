package org.jraf.graphqlresume.skills

import org.jraf.graphqlresume.skills.model.Language
import org.jraf.graphqlresume.skills.model.Resume
import org.jraf.graphqlresume.skills.model.Url
import org.jraf.graphqlresume.skills.repository.SkillsRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.execution.RuntimeWiringConfigurer
import org.springframework.stereotype.Controller

@SpringBootApplication
class SkillsApplication

@Controller
class SkillsController {
  @QueryMapping
  fun resume(@Argument language: Language): Resume {
    return SkillsRepository.getResume(language)
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
  runApplication<SkillsApplication>(*args)
}
