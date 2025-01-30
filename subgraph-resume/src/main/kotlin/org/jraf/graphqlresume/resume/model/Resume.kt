package org.jraf.graphqlresume.resume.model

data class Resume(
  val identity: Identity,
  val experience: List<Experience>,
  val education: List<EducationEntry>,
  val skills: List<SkillCategory>,
  val misc: List<MiscItem>,
)
