package org.jraf.graphqlresume.resume.model

import graphql.schema.DataFetchingEnvironment

data class MiscItem(
  val descriptionPlain: String,
  val descriptionHtml: String = descriptionPlain,
  val links: List<String> = emptyList(),
) {
  fun getDescription(e: DataFetchingEnvironment): String {
    return when (TextFormat.valueOf(e.getArgument("format"))) {
      TextFormat.PLAIN_TEXT -> descriptionPlain
      TextFormat.HTML -> descriptionHtml
    }
  }
}
