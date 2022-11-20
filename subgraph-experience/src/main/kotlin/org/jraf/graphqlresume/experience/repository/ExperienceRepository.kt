package org.jraf.graphqlresume.experience.repository

import org.jraf.graphqlresume.experience.model.Experience
import org.jraf.graphqlresume.experience.model.ExperienceItem
import org.jraf.graphqlresume.experience.model.Language
import org.jraf.graphqlresume.experience.model.Organization
import org.jraf.graphqlresume.experience.model.Period
import org.jraf.graphqlresume.experience.model.PeriodEndDate
import org.jraf.graphqlresume.experience.model.PeriodStartDate

object ExperienceRepository {
  private val englishExperience = listOf(
    /*
        <period from="Sep. 2018" to="NOW">
          <item>Android Expert at <a xmlns="http://www.w3.org/1999/xhtml" href="https://qonto.com/" target="_blank">Qonto</a> <span xmlns="http://www.w3.org/1999/xhtml" class="company-details">(neobank, Paris, France)</span></item>
          <item>New features and maintenance on the <a xmlns="http://www.w3.org/1999/xhtml" href="https://play.google.com/store/apps/details?id=eu.qonto.qonto" target="_blank">Qonto</a> banking app.</item>
          <item>Strong focus on architecture; core modules and services; keeping the codebase maintainable, clean and modern; team best practices and documentation; newcomer training; tooling; R&amp;D; etc.</item>
          <item>Team grew from 3 to 10 developers.</item>
          <environment>Android, Kotlin, MVVM / Clean Architecture, Realm, Databinding, Coroutines, Dagger, JSON, Gitlab, Android Studio, Gradle.</environment>
        </period>
    */
    Experience(
      period = Period(
        start = PeriodStartDate("Sep. 2018"),
        end = PeriodEndDate(null),
      ),
      jobTitle = "Android Expert",
      organization = Organization(
        name = "Qonto",
        description = "neobank",
        website = "https://qonto.com/",
        location = "Paris, France",
      ),
      items = listOf(
        ExperienceItem("New features and maintenance on the Qonto banking app."),
        ExperienceItem("Strong focus on architecture; core modules and services; keeping the codebase maintainable, clean and modern; team best practices and documentation; newcomer training; tooling; R&D; etc."),
        ExperienceItem("Team grew from 3 to 10 developers."),
      ),
      environment = listOf(
        "Android",
        "Kotlin",
        "MVVM / Clean Architecture",
        "Realm",
        "Databinding",
        "Coroutines",
        "Dagger",
        "JSON",
        "Gitlab",
        "Android Studio",
        "Gradle",
      ),
    ),
  )

  private val frenchExperience = englishExperience

  fun getExperience(language: Language): List<Experience> {
    return when (language) {
      Language.EN -> englishExperience
      Language.FR -> frenchExperience
    }
  }
}
