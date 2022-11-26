package org.jraf.graphqlresume.resume.model

data class PeriodStartDate(val date: String)

data class PeriodEndDate(val date: String?)

data class Organization(
  val id: String,
)

data class ExperienceItem(val description: String)

data class Experience(
  val period: Period,
  val jobTitle: String,
  val organization: Organization,
  val items: List<ExperienceItem>,
  val environment: List<String>,
)

