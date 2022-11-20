package org.jraf.graphqlresume.identity.model

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
