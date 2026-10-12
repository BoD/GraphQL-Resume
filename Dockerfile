FROM eclipse-temurin:25
LABEL maintainer="BoD <BoD@JRAF.org>"
WORKDIR /app

# Copy the jar files for each subgraph project
COPY subgraph-resume/build/install/subgraph-resume subgraph-resume/build/install/subgraph-resume/
COPY subgraph-organizations/build/install/subgraph-organizations subgraph-organizations/build/install/subgraph-organizations/

# Copy the supergraph / router project
COPY supergraph supergraph/

# Copy the GraphQL schemas for each subgraph project
COPY subgraph-resume/src/main/resources/graphql/resume.graphqls subgraph-resume/src/main/resources/graphql/resume.graphqls
COPY subgraph-organizations/src/main/resources/graphql/organizations.graphqls subgraph-organizations/src/main/resources/graphql/organizations.graphqls

# Install rover
RUN apt-get update && apt-get install -y curl
RUN curl -sSL https://rover.apollo.dev/nix/latest | sh

# Install the router
RUN curl -sSL https://router.apollo.dev/download/nix/latest | sh
RUN mv /app/router /app/supergraph/router

# Download OpenTelemetry Java agent
RUN curl -L -O https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar

EXPOSE 4000

ENV MALLOC_ARENA_MAX=4

# Set up OpenTelemetry Java agent
ENV JAVA_TOOL_OPTIONS=-javaagent:/app/opentelemetry-javaagent.jar
ENV OTEL_SERVICE_NAME=graphql-resume

ENTRYPOINT ["/bin/bash", "-c", "cd supergraph && ./go.sh"]
