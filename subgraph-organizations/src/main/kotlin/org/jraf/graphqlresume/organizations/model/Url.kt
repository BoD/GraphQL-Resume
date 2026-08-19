package org.jraf.graphqlresume.organizations.model

import graphql.GraphQLContext
import graphql.execution.CoercedVariables
import graphql.language.Value
import graphql.schema.Coercing
import graphql.schema.GraphQLScalarType
import java.util.Locale

val Url: GraphQLScalarType = GraphQLScalarType.newScalar()
  .name("Url")
  .coercing(object : Coercing<Any?, Any?> {
    override fun parseValue(input: Any, graphQLContext: GraphQLContext, locale: Locale): Any {
      throw UnsupportedOperationException()
    }

    override fun parseLiteral(
      input: Value<*>,
      variables: CoercedVariables,
      graphQLContext: GraphQLContext,
      locale: Locale,
    ): Any {
      throw UnsupportedOperationException()
    }

    override fun serialize(dataFetcherResult: Any, graphQLContext: GraphQLContext, locale: Locale): Any {
      return dataFetcherResult as String
    }
  })
  .build()
