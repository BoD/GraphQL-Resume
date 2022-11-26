package org.jraf.graphqlresume.resume.model

data class Resume(
  val experience: List<Experience>,
  val education: List<EducationEntry>,
  val identity: Identity,
  val skills: List<SkillCategory>,
  val misc: List<MiscItem>,
)
