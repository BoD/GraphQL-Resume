package org.jraf.graphqlresume.resume.repository

import org.jraf.graphqlresume.resume.model.Language
import org.jraf.graphqlresume.resume.model.MiscItem

object MiscRepository {
  private val englishMisc = listOf(
    MiscItem(
      descriptionPlain = "Reading (science, science-fiction), cinema, music (bass guitar), geocaching.",
    ),
    MiscItem(
      descriptionPlain = "A few hobby Android apps (Play Store) and pet projects (GitHub).",
      descriptionHtml = "A few hobby Android apps <a href=\"https://play.google.com/store/apps/developer?id=BoD\">(Play Store)</a> and pet projects <a href=\"https://github.com/BoD?tab=repositories&type=source\">(GitHub)</a>.",
      links = listOf(
        "https://play.google.com/store/apps/developer?id=BoD",
        "https://github.com/BoD?tab=repositories&type=source",
      ),
    ),
  )

  private val frenchMisc = listOf(
    MiscItem(
      descriptionPlain = "Lectures (science, science-fiction), cinéma, musique (guitare basse), geocaching.",
    ),
    MiscItem(
      descriptionPlain = "Quelques applis Android \"hobby\" (Play Store) et projets persos (GitHub).",
      descriptionHtml = "Quelques applis Android \"hobby\" <a href=\"https://play.google.com/store/apps/developer?id=BoD\">(Play Store)</a> et projets persos <a href=\"https://github.com/BoD?tab=repositories&type=source\">(GitHub)</a>.",
      links = listOf(
        "https://play.google.com/store/apps/developer?id=BoD",
        "https://github.com/BoD?tab=repositories&type=source",
      ),
    ),
  )

  fun getMisc(language: Language): List<MiscItem> {
    return when (language) {
      Language.EN -> englishMisc
      Language.FR -> frenchMisc
    }
  }
}
