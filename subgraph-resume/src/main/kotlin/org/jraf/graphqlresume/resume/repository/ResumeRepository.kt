package org.jraf.graphqlresume.resume.repository

import org.jraf.graphqlresume.resume.model.Language
import org.jraf.graphqlresume.resume.model.Resume

object ResumeRepository {
  private val englishResume = Resume(
    title = "Software Engineer",
    identity = IdentityRepository.getIdentity(Language.EN),
    experience = ExperienceRepository.getExperience(Language.EN),
    education = EducationRepository.getEducation(Language.EN),
    skills = SkillsRepository.getSkills(Language.EN),
    misc = MiscRepository.getMisc(Language.EN),
  )

  private val frenchResume = Resume(
    title = "Ingénieur Logiciel",
    identity = IdentityRepository.getIdentity(Language.FR),
    experience = ExperienceRepository.getExperience(Language.FR),
    education = EducationRepository.getEducation(Language.FR),
    skills = SkillsRepository.getSkills(Language.FR),
    misc = MiscRepository.getMisc(Language.FR),
  )

  fun getResume(language: Language): Resume {
    return when (language) {
      Language.EN -> englishResume
      Language.FR -> frenchResume
    }
  }
}
