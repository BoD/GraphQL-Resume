package org.jraf.graphqlresume.organizations.repository

import org.jraf.graphqlresume.organizations.model.Organization

object OrganizationsRepository {
  private val organizations = listOf(
    Organization(
      id = "en.apollo",
      name = "Apollo GraphQL",
      description = "software publisher",
      website = "https://apollographql.com/",
      location = "San Francisco, USA",
    ),
    Organization(
      id = "en.qonto",
      name = "Qonto",
      description = "neobank",
      website = "https://qonto.com/",
      location = "Paris, France",
    ),
    Organization(
      id = "en.less",
      name = "LESS",
      description = "software publisher",
      website = "https://www.blablacar.com/",
      location = "Paris, France",
      moreInfoPlain = "now part of BlaBlaCar",
      moreInfoHtml = "now part of <a href=\"https://www.blablacar.com/\">BlaBlaCar</a>",
    ),
    Organization(
      id = "en.blackpills",
      name = "Blackpills",
      description = "media company",
      website = "https://www.blackpills.com/",
      location = "Paris, France",
    ),
    Organization(
      id = "en.familyandco",
      name = "Family And Co.",
      description = "software publisher",
      website = "https://www.familywall.com/index.html?noautologin",
      location = "Paris, France",
      moreInfoPlain = "as freelance",
    ),
    Organization(
      id = "en.plizy",
      name = "Plizy",
      description = "software publisher",
      location = "Paris, France",
    ),
    Organization(
      id = "en.voxmobili",
      name = "Vox Mobili",
      description = "software publisher",
      website = "http://www.voxmobili.com/",
      location = "Paris, France",
    ),
    Organization(
      id = "en.oalia",
      name = "Oalia",
      description = "software publisher",
      website = "http://www.oalia.com/",
      location = "Suresnes, France",
    ),

    Organization(
      id = "en.pegasis",
      name = "Pegasis",
      description = "IT services and software publisher",
      website = "http://www.pegasis.fr/",
      location = "Paris, France",
    ),

    Organization(
      id = "en.icom",
      name = "Icom Informatique",
      description = "software publisher",
      website = "http://www.quotium.com/",
      location = "Charenton, France",
    ),

    Organization(
      id = "fr.apollo",
      name = "Apollo GraphQL",
      description = "éditeur de logiciels",
      website = "https://apollographql.com/",
      location = "San Francisco, USA",
    ),
    Organization(
      id = "fr.qonto",
      name = "Qonto",
      description = "néobanque",
      website = "https://qonto.com/",
      location = "Paris",
    ),

    Organization(
      id = "fr.less",
      name = "LESS",
      description = "éditeur de logiciels",
      website = "https://www.less.com/",
      location = "Paris",
      moreInfoPlain = "acquis par BlaBlaCar",
      moreInfoHtml = "acquis par <a href=\"https://www.blablacar.com/\">BlaBlaCar</a>",
    ),

    Organization(
      id = "fr.blackpills",
      name = "Blackpills",
      description = "société de médias",
      website = "https://www.blackpills.com/",
      location = "Paris",
    ),

    Organization(
      id = "fr.familyandco",
      name = "Family And Co.",
      description = "éditeur de logiciels",
      website = "https://www.familywall.com/index.html?noautologin",
      location = "Paris",
      moreInfoPlain = "en tant que freelance",
    ),

    Organization(
      id = "fr.plizy",
      name = "Plizy",
      description = "éditeur de logiciels",
      website = "http://www.droid-life.com/2012/02/23/plizy-released-for-android-tablets-videos-from-all-over-the-web-in-one-convenient-location/",
      location = "Paris",
    ),

    Organization(
      id = "fr.voxmobili",
      name = "Vox Mobili",
      description = "éditeur de logiciels",
      website = "http://www.voxmobili.com/",
      location = "Paris",
    ),

    Organization(
      id = "fr.oalia",
      name = "Oalia",
      description = "éditeur de logiciels",
      website = "http://www.oalia.com/",
      location = "Suresnes",
    ),

    Organization(
      id = "fr.pegasis",
      name = "Pegasis",
      description = "SSII et éditeur de logiciels",
      website = "http://www.pegasis.fr/",
      location = "Paris",
    ),

    Organization(
      id = "fr.icom",
      name = "Icom Informatique",
      description = "éditeur de logiciels",
      website = "http://www.quotium.com/",
      location = "Charenton",
    ),
  )

  fun getOrganization(id: String): Organization? = organizations.find { it.id == id }
}
