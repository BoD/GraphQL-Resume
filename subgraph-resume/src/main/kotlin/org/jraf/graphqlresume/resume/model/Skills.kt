package org.jraf.graphqlresume.resume.model

data class SkillItem(val description: String)

data class SkillCategory(val name: String, val items: List<SkillItem>)

