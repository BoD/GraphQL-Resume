package org.jraf.graphqlresume.resume.repository

import org.jraf.graphqlresume.resume.model.EducationEntry
import org.jraf.graphqlresume.resume.model.Institution
import org.jraf.graphqlresume.resume.model.Language
import org.jraf.graphqlresume.resume.model.Period
import org.jraf.graphqlresume.resume.model.PeriodEndDate
import org.jraf.graphqlresume.resume.model.PeriodStartDate
import org.jraf.graphqlresume.resume.model.Year

object EducationRepository {
  private val englishEducationEntries = listOf(
    EducationEntry(
      periodOrYear = Period(
        start = PeriodStartDate("1998"),
        end = PeriodEndDate("2001"),
      ),
      degree = "Computer science",
      institution = Institution(
        name = "EPITA (Ecole Pour l'Informatique et les Techniques Avancées)",
        location = "Paris, France",
        website = "http://www.epita.fr/",
      ),
      moreInfo = "Information Systems / Software Engineering option",
    ),
    EducationEntry(
      periodOrYear = Period(
        start = PeriodStartDate("1996"),
        end = PeriodEndDate("1998"),
      ),
      degree = "D.U.T. informatique (Diplôme Universitaire Technologique)",
      institution = Institution(
        name = "I.U.T. of Vélizy",
        location = "France",
        website = "http://www.uvsq.fr/",
      ),
      moreInfo = "Software Engineering option",
    ),
    EducationEntry(
      periodOrYear = Year("1996"),
      degree = "Baccalauréat",
      institution = null,
      moreInfo = "Science series, Mathematics option",
    ),
  )

  private val frenchEducationEntries = listOf(
    EducationEntry(
      periodOrYear = Period(
        start = PeriodStartDate("1998"),
        end = PeriodEndDate("2001"),
      ),
      degree = "Ingénierie informatique",
      institution = Institution(
        name = "EPITA (Ecole Pour l'Informatique et les Techniques Avancées)",
        location = "Paris",
        website = "http://www.epita.fr/",
      ),
      moreInfo = "Spécialité Systèmes d'Information / Génie Logiciel",
    ),
    EducationEntry(
      periodOrYear = Period(
        start = PeriodStartDate("1996"),
        end = PeriodEndDate("1998"),
      ),
      degree = "Diplôme Universitaire Technologique informatique",
      institution = Institution(
        name = "I.U.T. de Vélizy",
        location = "Vélizy",
        website = "http://www.uvsq.fr/",
      ),
      moreInfo = "Option Génie Informatique",
    ),
    EducationEntry(
      periodOrYear = Year("1996"),
      degree = "Baccalauréat général",
      institution = null,
      moreInfo = "Série Scientifique, option Mathématiques",
    ),
  )

  fun getEducation(language: Language): List<EducationEntry> {
    return when (language) {
      Language.EN -> englishEducationEntries
      Language.FR -> frenchEducationEntries
    }
  }

}
