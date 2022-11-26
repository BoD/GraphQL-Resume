package org.jraf.graphqlresume.organizations.model

data class Organization(
  val id: String,
  val name: String,
  val description: String,
  val location: String,
  val website: String? = null,
  val moreInfo: String? = null,
)
