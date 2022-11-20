package org.jraf.graphqlresume.education.model

data class PeriodStartDate(val date: String)

data class PeriodEndDate(val date: String?)

interface PeriodOrYear

data class Period(val start: PeriodStartDate, val end: PeriodEndDate) : PeriodOrYear

data class Year(val year: String) : PeriodOrYear


data class Institution(val name: String, val location: String, val website: String)

data class EducationEntry(val periodOrYear: PeriodOrYear, val degree: String, val institution: Institution?, val moreInfo: String)

data class Resume(
  val education: List<EducationEntry>,
)
