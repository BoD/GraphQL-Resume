package org.jraf.graphqlresume.education.repository

import org.jraf.graphqlresume.education.model.EducationEntry
import org.jraf.graphqlresume.education.model.Institution
import org.jraf.graphqlresume.education.model.Language
import org.jraf.graphqlresume.education.model.Period
import org.jraf.graphqlresume.education.model.PeriodEndDate
import org.jraf.graphqlresume.education.model.PeriodStartDate
import org.jraf.graphqlresume.education.model.Resume
import org.jraf.graphqlresume.education.model.Year

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

  private val englishResume = Resume(
    education = englishEducationEntries,
  )

  private val frenchResume = Resume(
    education = frenchEducationEntries,
  )

  fun getResume(language: Language): Resume {
    return when (language) {
      Language.EN -> englishResume
      Language.FR -> frenchResume
    }
  }
}
