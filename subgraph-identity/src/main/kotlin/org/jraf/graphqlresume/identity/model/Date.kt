package org.jraf.graphqlresume.identity.model

import graphql.schema.Coercing

import graphql.schema.GraphQLScalarType
import java.text.SimpleDateFormat
import java.util.Date as JavaDate

private val dateFormat = SimpleDateFormat("yyyy-MM-dd")

val Date: GraphQLScalarType = GraphQLScalarType.newScalar()
  .name("Date")
  .coercing(object : Coercing<Any?, Any?> {
    override fun parseValue(input: Any): Any {
      throw UnsupportedOperationException()
    }

    override fun parseLiteral(input: Any): Any {
      throw UnsupportedOperationException()
    }

    override fun serialize(dataFetcherResult: Any): Any {
      val javaDate = dataFetcherResult as JavaDate
      return dateFormat.format(javaDate)
    }
  })
  .build()
