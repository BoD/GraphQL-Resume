package org.jraf.graphqlresume.resume.model

import graphql.schema.DataFetchingEnvironment

data class PeriodStartDate(val date: String)

data class PeriodEndDate(val date: String?)

data class Organization(
  val id: String,
)

data class ExperienceItem(
  val descriptionPlain: String,
  val descriptionHtml: String = descriptionPlain,
) {
  fun getDescription(e: DataFetchingEnvironment): String {
    return when (TextFormat.valueOf(e.getArgument<String>("format") ?: TextFormat.PLAIN_TEXT.name)) {
      TextFormat.PLAIN_TEXT -> descriptionPlain
      TextFormat.HTML -> descriptionHtml
    }
  }
}

data class Experience(
  val period: Period,
  val jobTitle: String,
  val organization: Organization,
  val items: List<ExperienceItem>,
  val environment: List<String>,
)
