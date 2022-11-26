package org.jraf.graphqlresume.resume.repository

import org.jraf.graphqlresume.resume.model.Language
import org.jraf.graphqlresume.resume.model.Resume

object ResumeRepository {
  private val englishResume = Resume(
    education = EducationRepository.getEducation(Language.EN),
    experience = ExperienceRepository.getExperience(Language.EN),
    identity = IdentityRepository.getIdentity(Language.EN),
    skills = SkillsRepository.getSkills(Language.EN),
    misc = SkillsRepository.getMisc(Language.EN),
  )

  private val frenchResume = Resume(
    education = EducationRepository.getEducation(Language.FR),
    experience = ExperienceRepository.getExperience(Language.FR),
    identity = IdentityRepository.getIdentity(Language.FR),
    skills = SkillsRepository.getSkills(Language.FR),
    misc = SkillsRepository.getMisc(Language.FR),
  )

  fun getResume(language: Language): Resume {
    return when (language) {
      Language.EN -> englishResume
      Language.FR -> frenchResume
    }
  }
}
