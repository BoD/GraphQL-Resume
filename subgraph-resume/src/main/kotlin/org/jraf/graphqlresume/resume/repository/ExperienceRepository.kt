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
        start = PeriodStartDate("Sep. 2018"),
        end = PeriodEndDate(null),
      ),
      jobTitle = "Android Expert",
      organization = Organization(
        id = "en.qonto",
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
        ExperienceItem("Setup an MVVM architecture using Arch components."),
        ExperienceItem("Implemented turn by turn navigation / GPS (incl. voice instructions) features."),
        ExperienceItem("Strong focus on real time messaging aspects (PubNub, FCM.)"),
        ExperienceItem("At BlaBlaCar: new features and maintenance on the BlaBlaCar Daily app."),
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
        ExperienceItem("Development of the Blackpills app, a browser and player for original mini series meant for mobile consumption."),
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
        ExperienceItem("Development on the FamilyWall app, which helps users organize, communicate and share contents within their family."),
        ExperienceItem("Strong focus on the UI/UX."),
        ExperienceItem("Implemented a full-featured calendar with month and next events views."),
        ExperienceItem("Communication with the REST/JSON API."),
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
        ExperienceItem("Development of the Plizy app for tablets, a video aggregator / player."),
        ExperienceItem("Started from scratch and was responsible for the project from the inception to the publication on the Play Store."),
        ExperienceItem("Communication with the REST/JSON API."),
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
        ExperienceItem("Server-side development on the PIM product (synchronized address book, calendar, tasks, pictures / videos, etc.)"),
        ExperienceItem("Customized the software for customers: T-Mobile, Bouygues Telecom, Orange, Telstra."),
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
      items = listOf(
        ExperienceItem("Maintained and enhanced the in-house Framework."),
        ExperienceItem("Development on the OSRM / OSPM v3 and v4 products (spend management software.)"),
        ExperienceItem("Designed and implemented the Supplier Portal module (remote application communicating using Web Services.)"),
      ),
      environment = listOf(
        "Java",
        "J2EE",
        "Hibernate",
        "Turbine",
        "Velocity",
        "Ajax",
        "SOAP",
        "Axis",
        "Oracle",
        "Tomcat",
        "Weblogic",
        "Subversion",
        "Maven",
        "Eclipse",
      ),
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
      items = listOf(
        ExperienceItem("Development on web applications (internet/intranet) for customers: France Télécom, l'Apec, Casino, Le Mémorial de la Shoah, Planète TP."),
        ExperienceItem("Used Pegasis' internal framework (MVC2 model) and Délia CMS."),
      ),
      environment = listOf(
        "Java",
        "J2EE (JSP/Servlets/Taglibs)",
        "Tiles",
        "SQL",
        "Oracle",
        "CVS",
        "Tomcat",
        "Ant",
        "IntelliJ",
        "Eclipse",
      ),
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
      items = listOf(
        ExperienceItem("Development on the web and Swing applications."),
        ExperienceItem("Ported a scripting language interpreter to Java."),
      ),
      environment = listOf(
        "Java",
        "JSP/Servlets",
        "Applets",
        "Swing",
        "Java web start",
        "JavaCC",
        "XML",
        "LDAP",
        "SSL",
        "Visual SourceSafe",
        "Ant",
        "IntelliJ",
      ),
    ),
  )

  private val frenchExperience = listOf(
    Experience(
      period = Period(
        start = PeriodStartDate("Sep. 2018"),
        end = PeriodEndDate(null),
      ),
      jobTitle = "Expert Android",
      organization = Organization(
        id = "fr.qonto",
      ),
      items = listOf(
        ExperienceItem("Nouvelles fonctionnalités et maintenance sur l'appli bancaire Qonto."),
        ExperienceItem("Concentration sur l'architecture ; le socle, les modules et services core ; garder la codebase maintenable, propre et moderne ; bonne pratiques de l'équipe et documentation ; formation des nouvelles recrues ; outillage ; R&D; etc."),
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
        ExperienceItem("Mise en place d'une architecture MVVM utilisant Arch components."),
        ExperienceItem("Implémentation d'un GPS / système de navigation turn by turn (y compris instructions vocales)."),
        ExperienceItem("Aspect communication temps réel très important (PubNub, FCM)."),
        ExperienceItem("Chez BlaBlaCar : nouvelles fonctionnalités et maintenance sur l'appli BlaBlaCar Daily."),
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
        ExperienceItem("Développement de l'appli Blackpills, permettant de découvrir et visionner des mini séries originales à consommer sur mobile."),
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
        ExperienceItem("Développement sur l'appli FamilyWall qui aide à s'organiser, communiquer et partager en famille."),
        ExperienceItem("Aspect UI/UX très important."),
        ExperienceItem("Réalisation d'un calendrier complet avec vues \"mois\" et \"prochains évènements\"."),
        ExperienceItem("Communication avec l'API REST/JSON."),
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
        ExperienceItem("Développement de l'appli Plizy pour tablettes, un agrégateur personnalisé et player vidéo."),
        ExperienceItem("Mise en place et responsabilité du projet de la création jusqu'à la publication sur le Play Store."),
        ExperienceItem("Communication avec l'API REST/JSON."),
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
        ExperienceItem("Développement côté serveur sur le produit PIM (carnet d'adresses, calendrier, tâches, photos / vidéos, etc. synchronisés)."),
        ExperienceItem("Customisations pour les clients : T-Mobile, Bouygues Telecom, Orange, Telstra."),
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
      items = listOf(
        ExperienceItem("Maintenance et évolutions sur le Framework interne."),
        ExperienceItem("Développement sur les produits OSRM / OSPM v3 et v4, des progiciels de gestion d’achats."),
        ExperienceItem("Conception et développement du module Portail Fournisseur (application distante communiquant en Web Services)."),
      ),
      environment = listOf(
        "Java",
        "J2EE",
        "Hibernate",
        "Turbine",
        "Velocity",
        "Ajax",
        "SOAP",
        "Axis",
        "Oracle",
        "Tomcat",
        "Weblogic",
        "Subversion",
        "Maven",
        "Eclipse",
      ),
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
      items = listOf(
        ExperienceItem("Développement d'applications Web (internet/intranet) pour les clients : France Télécom, l'Apec, Casino, Le Mémorial de la Shoah, Planète TP."),
        ExperienceItem("Utilisation du framework interne Pegasis (Modèle MVC2) et de l'outil de gestion de contenu Délia."),
      ),
      environment = listOf(
        "Java",
        "J2EE (JSP/Servlets/Taglibs)",
        "Tiles",
        "SQL",
        "Oracle",
        "CVS",
        "Tomcat",
        "Ant",
        "IntelliJ",
        "Eclipse",
      ),
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
      items = listOf(
        ExperienceItem("Développement sur les applications web et Swing."),
        ExperienceItem("Portage en Java d'un interpréteur d'un langage de scripting."),
      ),
      environment = listOf(
        "Java",
        "JSP/Servlets",
        "Applets",
        "Swing",
        "Java web start",
        "JavaCC",
        "XML",
        "LDAP",
        "SSL",
        "Visual SourceSafe",
        "Ant",
        "IntelliJ",
      ),
    ),
  )

  fun getExperience(language: Language): List<Experience> {
    return when (language) {
      Language.EN -> englishExperience
      Language.FR -> frenchExperience
    }
  }
}
