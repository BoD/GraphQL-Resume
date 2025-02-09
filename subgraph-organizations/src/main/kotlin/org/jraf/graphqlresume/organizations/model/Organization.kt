package org.jraf.graphqlresume.organizations.model

import graphql.schema.DataFetchingEnvironment

data class Organization(
  val id: String,
  val name: String,
  val description: String,
  val location: String,
  val website: String? = null,
  val moreInfoPlain: String? = null,
  val moreInfoHtml: String? = moreInfoPlain,
) {
  fun getMoreInfo(e: DataFetchingEnvironment): String? {
    return when (TextFormat.valueOf(e.getArgument("format"))) {
      TextFormat.PLAIN_TEXT -> moreInfoPlain
      TextFormat.HTML -> moreInfoHtml
    }
  }
}
