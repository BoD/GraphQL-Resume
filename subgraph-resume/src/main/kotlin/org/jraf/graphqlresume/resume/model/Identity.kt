package org.jraf.graphqlresume.resume.model

import java.util.Date

data class Identity(
  val firstName: String,
  val lastName: String,
  val birthDate: Date,
  val age: Int,
  val nationality: Nationality,
  val email: String,
  val phoneNumber: PhoneNumber,
  val address: Address,
)

data class Address(
  val addressLines: List<String>,
)

enum class Nationality {
  FRANCE
}

data class PhoneNumber(
  val countryCode: Int?,
  val number: String,
)
