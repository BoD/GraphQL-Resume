package org.jraf.graphqlresume.resume.model

import graphql.schema.DataFetchingEnvironment

interface PeriodOrYear

data class Period(val start: PeriodStartDate, val end: PeriodEndDate) : PeriodOrYear

data class Year(val year: String) : PeriodOrYear


data class Institution(val name: String, val location: String, val website: String)

data class EducationEntry(
  val periodOrYear: PeriodOrYear,
  val degree: String,
  val institution: Institution?,
  val moreInfoPlain: String?,
  val moreInfoHtml: String? = moreInfoPlain,
) {
  fun getMoreInfo(e: DataFetchingEnvironment): String? {
    return when (TextFormat.valueOf(e.getArgument("format"))) {
      TextFormat.PLAIN_TEXT -> moreInfoPlain
      TextFormat.HTML -> moreInfoHtml
    }
  }
}

