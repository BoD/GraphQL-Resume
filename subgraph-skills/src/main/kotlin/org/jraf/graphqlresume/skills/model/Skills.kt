package org.jraf.graphqlresume.skills.model

data class SkillItem(val description: String)

data class SkillCategory(val name: String, val items: List<SkillItem>)

data class MiscItem(
  val description: String,
  val links: List<String> = emptyList(),
)


data class Resume(
  val skills: List<SkillCategory>,
  val misc: List<MiscItem>,
)
