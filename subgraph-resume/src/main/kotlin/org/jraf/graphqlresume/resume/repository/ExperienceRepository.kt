package org.jraf.graphqlresume.resume.repository

import org.jraf.graphqlresume.resume.model.Experience
import org.jraf.graphqlresume.resume.model.ExperienceItem
import org.jraf.graphqlresume.resume.model.Language
import org.jraf.graphqlresume.resume.model.Organization
import org.jraf.graphqlresume.resume.model.Period
import org.jraf.graphqlresume.resume.model.PeriodEndDate
import org.jraf.graphqlresume.resume.model.PeriodStartDate

object ExperienceRepository {
  private val englishExperience = listOf(
    Experience(
      period = Period(
        start = PeriodStartDate("Oct. 2021"),
        end = PeriodEndDate(null),
      ),
      jobTitle = "Staff Engineer, Android",
      organization = Organization(
        id = "en.apollo",
      ),
      items = listOf(
        ExperienceItem(
          descriptionPlain = "New features and maintenance on the open source project Apollo Kotlin, a GraphQL client library for Android and Kotlin.",
          descriptionHtml = "New features and maintenance on the open source project <a href=\"https://github.com/apollographql/apollo-kotlin\" target=\"_blank\">Apollo Kotlin</a>, a GraphQL client library used by major Android apps (Netflix, X, Reddit, GitHub, …).",
        ),
        ExperienceItem("Focus on the caching features and performance."),
        ExperienceItem(
          descriptionPlain = "Development of a plugin for Android Studio / IntelliJ.",
          descriptionHtml = "Development of a <a href=\"https://plugins.jetbrains.com/plugin/20645-apollo-graphql\" target=\"_blank\">plugin</a> for Android Studio / IntelliJ.",
        ),
        ExperienceItem("Team of 2 developers, with contributions from the community."),
      ),
      environment = listOf(
        "GraphQL",
        "Kotlin Multiplatform",
        "Gradle",
        "Code generation",
        "Coroutines",
        "SQLDelight",
        "Android Studio / IntelliJ",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2018"),
        end = PeriodEndDate("2021"),
      ),
      jobTitle = "Android Expert",
      organization = Organization(
        id = "en.qonto",
      ),
      items = listOf(
        ExperienceItem(
          descriptionPlain = "New features and maintenance on the Qonto banking app.",
          descriptionHtml = "New features and maintenance on the <a href=\"https://play.google.com/store/apps/details?id=eu.qonto.qonto\" target=\"_blank\">Qonto</a> banking app.",
        ),
        ExperienceItem(
          descriptionPlain = "Strong focus on architecture; core modules and services; keeping the codebase maintainable, clean and modern; team best practices and documentation; newcomer training; tooling; R&D; etc.",
          descriptionHtml = "Strong focus on architecture; core modules and services; keeping the codebase maintainable, clean and modern; team best practices and documentation; newcomer training; tooling; R&amp;D; etc.",
        ),
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

    Experience(
      period = Period(
        start = PeriodStartDate("2017"),
        end = PeriodEndDate("2018"),
      ),
      jobTitle = "Android Developer",
      organization = Organization(
        id = "en.less",
      ),
      items = listOf(
        ExperienceItem("Development of the LESS app, a peer-to-peer ridesharing service."),
        ExperienceItem("Started from scratch with another Android developer, and worked from the inception to the publication on the Play Store, and on the maintenance / new features of the app."),
        ExperienceItem("Implemented turn by turn navigation / GPS (incl. voice instructions) features."),
        ExperienceItem("Strong focus on real time messaging aspects (PubNub, FCM.)"),
      ),
      environment = listOf(
        "Android",
        "Java",
        "Kotlin",
        "Arch components (ViewModel, Room)",
        "RxJava",
        "Databinding",
        "Dagger",
        "Firebase",
        "Mapbox",
        "PubNub",
        "FCM",
        "JSON",
        "Github",
        "Android Studio",
        "Gradle",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2016"),
        end = PeriodEndDate("2017"),
      ),
      jobTitle = "Android Developer",
      organization = Organization(
        id = "en.blackpills",
      ),
      items = listOf(
        ExperienceItem(
          descriptionPlain = "Development of the Blackpills app, a browser and player for original mini series meant for mobile consumption.",
          descriptionHtml = "Development of the <a href=\"https://play.google.com/store/apps/details?id=com.blackpills\" target=\"_blank\">Blackpills</a> app, a browser and player for original mini series meant for mobile consumption.",
        ),
        ExperienceItem("Started from scratch with 2 other Android developers (full Kotlin)."),
        ExperienceItem("Strong focus on the UI/UX."),
        ExperienceItem("Worked on payment, ads, offline mode (video download), and more."),
      ),
      environment = listOf(
        "Android",
        "Kotlin",
        "ExoPlayer",
        "HLS",
        "Swagger",
        "JSON",
        "Gitlab",
        "Android Studio",
        "Gradle",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2012"),
        end = PeriodEndDate("2016"),
      ),
      jobTitle = "Lead Android Developer",
      organization = Organization(
        id = "en.familyandco",
      ),
      items = listOf(
        ExperienceItem(
          descriptionPlain = "Development on the FamilyWall app, which helps users organize, communicate and share contents within their family.",
          descriptionHtml = "Development on the <a href=\"https://play.google.com/store/apps/details?id=com.familywall\" target=\"_blank\">FamilyWall</a> app, which helps users organize, communicate and share contents within their family.",
        ),
        ExperienceItem("Strong focus on the UI/UX."),
        ExperienceItem("Implemented a full-featured calendar with month and next events views."),
        ExperienceItem("Customized the software for customers (branding, integration.)"),
      ),
      environment = listOf(
        "Android",
        "Java",
        "Custom UI components",
        "C2DM/GCM",
        "In-app purchase",
        "Maps API",
        "Google Play Services",
        "Content Provider",
        "JSON",
        "Git",
        "Jenkins",
        "Android Studio",
        "Gradle",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2011"),
        end = PeriodEndDate("2012"),
      ),
      jobTitle = "Lead Android Developer",
      organization = Organization(
        id = "en.plizy",
      ),
      items = listOf(
        ExperienceItem(
          descriptionPlain = "Development of the Plizy app for tablets, a video aggregator / player.",
          descriptionHtml = "Development of the <a href=\"https://www.droid-life.com/2012/02/23/plizy-released-for-android-tablets-videos-from-all-over-the-web-in-one-convenient-location/\" target=\"_blank\">Plizy</a> app for tablets, a video aggregator / player.",

          ),
        ExperienceItem("Started from scratch and was responsible for the project from the inception to the publication on the Play Store."),
        ExperienceItem("Developed a video player using a VideoView or a WebView depending on the provider (YouTube, Vimeo, Dailymotion, etc.)"),
        ExperienceItem("Designed and implemented an image caching mechanism for the thumbnails."),
      ),
      environment = listOf(
        "Android",
        "Java",
        "Animations",
        "VideoView",
        "WebView",
        "Content Provider",
        "Facebook",
        "Twitter",
        "JSON",
        "Git",
        "Jenkins",
        "Eclipse",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2008"),
        end = PeriodEndDate("2011"),
      ),
      jobTitle = "Android and Backend Developer",
      organization = Organization(
        id = "en.voxmobili",
      ),
      items = listOf(
        ExperienceItem("Development on the Phonebook 2.0 app for Android, a synchronized and social address book."),
        ExperienceItem("Designed and implemented a generic engine that integrates with social networks (Twitter, Facebook, LinkedIn, MySpace, etc.) and managed developers implementing connectors using this engine."),
        ExperienceItem("Implemented presence / chat features using the RCS protocol."),
      ),
      environment = listOf(
        "Android",
        "Java",
        "J2EE",
        "Javascript",
        "Ajax",
        "JSON",
        "SOAP",
        "SyncML",
        "Oracle",
        "Tomcat",
        "Subversion",
        "Eclipse",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2006"),
        end = PeriodEndDate("2008"),
      ),
      jobTitle = "Java Developer",
      organization = Organization(
        id = "en.oalia",
      ),
      items = emptyList(),
      environment = emptyList(),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2003"),
        end = PeriodEndDate("2006"),
      ),
      jobTitle = "Java Developer",
      organization = Organization(
        id = "en.pegasis",
      ),
      items = emptyList(),
      environment = emptyList(),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2001"),
        end = PeriodEndDate("2003"),
      ),
      jobTitle = "Java Developer",
      organization = Organization(
        id = "en.icom",
      ),
      items = emptyList(),
      environment = emptyList(),
    ),
  )

  private val frenchExperience = listOf(
    Experience(
      period = Period(
        start = PeriodStartDate("Oct. 2021"),
        end = PeriodEndDate(null),
      ),
      jobTitle = "Staff Engineer, Android",
      organization = Organization(
        id = "fr.apollo",
      ),
      items = listOf(
        ExperienceItem(
          descriptionPlain = "Nouvelles fonctionnalités et maintenance sur le projet open source Apollo Kotlin, une librarie client GraphQL pour Android et Kotlin.",
          descriptionHtml = "Nouvelles fonctionnalités et maintenance sur le projet open source <a href=\"https://github.com/apollographql/apollo-kotlin\" target=\"_blank\">Apollo Kotlin</a>, une librairie client GraphQL utilisée par des applis Android majeures (Netflix, X, Reddit, Deezer, …).",
        ),
        ExperienceItem("Focus sur les fonctionnalités de cache et la performance."),
        ExperienceItem(
          descriptionPlain = "Développement d'un plugin pour Android Studio / IntelliJ.",
          descriptionHtml = "Développement d'un <a href=\"https://plugins.jetbrains.com/plugin/20645-apollo-graphql\" target=\"_blank\">plugin</a> pour Android Studio / IntelliJ.",
        ),
        ExperienceItem("Équipe de 2 développeurs, avec des contributions de la communauté."),
      ),
      environment = listOf(
        "GraphQL",
        "Kotlin Multiplatform",
        "Gradle",
        "Génération de code",
        "Coroutines",
        "SQLDelight",
        "Android Studio / IntelliJ",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2018"),
        end = PeriodEndDate("2021"),
      ),
      jobTitle = "Expert Android",
      organization = Organization(
        id = "fr.qonto",
      ),
      items = listOf(
        ExperienceItem(
          descriptionPlain = "Nouvelles fonctionnalités et maintenance sur l'appli bancaire Qonto.",
          descriptionHtml = "Nouvelles fonctionnalités et maintenance sur l'appli bancaire <a href=\"https://play.google.com/store/apps/details?id=eu.qonto.qonto\" target=\"_blank\">Qonto</a>.",
        ),
        ExperienceItem(
          descriptionPlain = "Concentration sur l'architecture ; le socle, les modules et services core ; garder la codebase maintenable, propre et moderne ; bonnes pratiques de l'équipe et documentation ; formation des nouvelles recrues ; outillage ; R&D; etc.",
          descriptionHtml = "Concentration sur l'architecture ; le socle, les modules et services core ; garder la codebase maintenable, propre et moderne ; bonnes pratiques de l'équipe et documentation ; formation des nouvelles recrues ; outillage ; R&amp;D; etc.",
        ),
        ExperienceItem("Équipe ayant évolué de 3 à 10 développeurs."),
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

    Experience(
      period = Period(
        start = PeriodStartDate("2017"),
        end = PeriodEndDate("2018"),
      ),
      jobTitle = "Développeur Android",
      organization = Organization(
        id = "fr.less",
      ),
      items = listOf(
        ExperienceItem("Développement de l'appli LESS, un service de covoiturage urbain instantané."),
        ExperienceItem("Responsabilité du projet avec un autre développeur, de la mise en place jusqu'à la publication sur le Play Store puis sur la maintenance / nouvelles fonctionnalités."),
        ExperienceItem("Implémentation d'un GPS / système de navigation turn by turn (y compris instructions vocales)."),
        ExperienceItem("Aspect communication temps réel très important (PubNub, FCM)."),
      ),
      environment = listOf(
        "Android",
        "Java",
        "Kotlin",
        "Arch components (ViewModel, Room)",
        "RxJava",
        "Databinding",
        "Dagger",
        "Firebase",
        "Mapbox",
        "PubNub",
        "FCM",
        "JSON",
        "Github",
        "Android Studio",
        "Gradle",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2016"),
        end = PeriodEndDate("2017"),
      ),
      jobTitle = "Développeur Android",
      organization = Organization(
        id = "fr.blackpills",
      ),
      items = listOf(
        ExperienceItem(
          descriptionPlain = "Développement de l'appli Blackpills, permettant de découvrir et visionner des mini séries originales à consommer sur mobile.",
          descriptionHtml = "Développement de l'appli <a href=\"https://play.google.com/store/apps/details?id=com.blackpills\" target=\"_blank\">Blackpills</a>, permettant de découvrir et visionner des mini séries originales à consommer sur mobile.",
        ),
        ExperienceItem("Démarrage du projet avec 2 autres développeurs (100% Kotlin)."),
        ExperienceItem("Aspect UI/UX très important."),
        ExperienceItem("Mise en place du paiement, publicité, mode hors ligne (téléchargement de vidéos), et plus."),
      ),
      environment = listOf(
        "Android",
        "Kotlin",
        "ExoPlayer",
        "HLS",
        "Swagger",
        "JSON",
        "Gitlab",
        "Android Studio",
        "Gradle",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2012"),
        end = PeriodEndDate("2016"),
      ),
      jobTitle = "Lead Développeur Android",
      organization = Organization(
        id = "fr.familyandco",
      ),
      items = listOf(
        ExperienceItem(
          descriptionPlain = "Développement sur l'appli FamilyWall qui aide à s'organiser, communiquer et partager en famille.",
          descriptionHtml = "Développement sur l'appli <a href=\"https://play.google.com/store/apps/details?id=com.familywall\" target=\"_blank\">FamilyWall</a> qui aide à s'organiser, communiquer et partager en famille.",
        ),
        ExperienceItem("Aspect UI/UX très important."),
        ExperienceItem("Réalisation d'un calendrier complet avec vues \"mois\" et \"prochains évènements\"."),
        ExperienceItem("Customisations pour les clients (branding, intégration)."),
      ),
      environment = listOf(
        "Android",
        "Java",
        "Composants UI custom",
        "C2DM/GCM",
        "In-app purchase",
        "Maps API",
        "Google Play Services",
        "Content Provider",
        "JSON",
        "Git",
        "Jenkins",
        "Android Studio",
        "Gradle",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2011"),
        end = PeriodEndDate("2012"),
      ),
      jobTitle = "Lead Développeur Android",
      organization = Organization(
        id = "fr.plizy",
      ),
      items = listOf(
        ExperienceItem(
          descriptionPlain = "Développement de l'appli Plizy pour tablettes, un agrégateur personnalisé et player vidéo.",
          descriptionHtml = "Développement de l'appli <a href=\"https://www.droid-life.com/2012/02/23/plizy-released-for-android-tablets-videos-from-all-over-the-web-in-one-convenient-location/\" target=\"_blank\">Plizy</a> pour tablettes, un agrégateur personnalisé et player vidéo.",
        ),
        ExperienceItem("Mise en place et responsabilité du projet de la création jusqu'à la publication sur le Play Store."),
        ExperienceItem("Player vidéo utilisant une VideoView ou une WebView selon le provider (YouTube, Vimeo, Dailymotion, etc.)."),
        ExperienceItem("Implémentation d'un mécanisme de cache d'images pour les thumbnails."),
      ),
      environment = listOf(
        "Android",
        "Java",
        "Animations",
        "VideoView",
        "WebView",
        "Content Provider",
        "Facebook",
        "Twitter",
        "JSON",
        "Git",
        "Jenkins",
        "Eclipse",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2008"),
        end = PeriodEndDate("2011"),
      ),
      jobTitle = "Développeur Android et Backend",
      organization = Organization(
        id = "fr.voxmobili",
      ),
      items = listOf(
        ExperienceItem("Développement sur l'appli Phonebook 2.0 pour Android, un carnet d'adresses synchronisé et social."),
        ExperienceItem("Conception et réalisation d'un moteur générique s'intégrant avec divers réseaux sociaux (Twitter, Facebook, LinkedIn, MySpace, etc.) et encadrement de développeurs réalisant des connecteurs pour ce moteur."),
        ExperienceItem("Fonctionnalités de présence / chat avec le protocole RCS."),
      ),
      environment = listOf(
        "Android",
        "Java",
        "J2EE",
        "Javascript",
        "Ajax",
        "JSON",
        "SOAP",
        "SyncML",
        "Oracle",
        "Tomcat",
        "Subversion",
        "Eclipse",
      ),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2006"),
        end = PeriodEndDate("2008"),
      ),
      jobTitle = "Développeur Java",
      organization = Organization(
        id = "fr.oalia",
      ),
      items = emptyList(),
      environment = emptyList(),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2003"),
        end = PeriodEndDate("2006"),
      ),
      jobTitle = "Développeur Java",
      organization = Organization(
        id = "fr.pegasis",
      ),
      items = emptyList(),
      environment = emptyList(),
    ),

    Experience(
      period = Period(
        start = PeriodStartDate("2001"),
        end = PeriodEndDate("2003"),
      ),
      jobTitle = "Développeur Java",
      organization = Organization(
        id = "fr.icom",
      ),
      items = emptyList(),
      environment = emptyList(),
    ),
  )

  fun getExperience(language: Language): List<Experience> {
    return when (language) {
      Language.EN -> englishExperience
      Language.FR -> frenchExperience
    }
  }
}
