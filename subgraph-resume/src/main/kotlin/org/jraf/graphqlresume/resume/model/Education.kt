package org.jraf.graphqlresume.resume.model

interface PeriodOrYear

data class Period(val start: PeriodStartDate, val end: PeriodEndDate) : PeriodOrYear

data class Year(val year: String) : PeriodOrYear


data class Institution(val name: String, val location: String, val website: String)

data class EducationEntry(val periodOrYear: PeriodOrYear, val degree: String, val institution: Institution?, val moreInfo: String)

