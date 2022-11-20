package org.jraf.graphqlresume.experience.model

data class PeriodStartDate(val date: String)

data class PeriodEndDate(val date: String?)

data class Period(val start: PeriodStartDate, val end: PeriodEndDate)

data class Organization(
  val name: String,
  val description: String,
  val location: String,
  val website: String?,
  val moreInfo: String? = null,
)

data class ExperienceItem(val description: String)

data class Experience(
  val period: Period,
  val jobTitle: String,
  val organization: Organization,
  val items: List<ExperienceItem>,
  val environment: List<String>,
)

data class Resume(
  val experience: List<Experience>,
)
