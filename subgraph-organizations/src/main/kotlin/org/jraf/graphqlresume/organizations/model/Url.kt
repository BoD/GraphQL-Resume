package org.jraf.graphqlresume.organizations.model

import graphql.schema.Coercing

import graphql.schema.GraphQLScalarType

val Url: GraphQLScalarType = GraphQLScalarType.newScalar()
  .name("Url")
  .coercing(object : Coercing<Any?, Any?> {
    override fun parseValue(input: Any): Any {
      throw UnsupportedOperationException()
    }

    override fun parseLiteral(input: Any): Any {
      throw UnsupportedOperationException()
    }

    override fun serialize(dataFetcherResult: Any): Any {
      return dataFetcherResult as String
    }
  })
  .build()
