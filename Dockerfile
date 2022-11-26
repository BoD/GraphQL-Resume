FROM openjdk:17.0.2-slim
LABEL maintainer="BoD <BoD@JRAF.org>"
WORKDIR /app

# Copy the jar files for each subgraph project
COPY subgraph-education/build/install/subgraph-education subgraph-education/build/install/subgraph-education/
COPY subgraph-experience/build/install/subgraph-experience subgraph-experience/build/install/subgraph-experience/
COPY subgraph-identity/build/install/subgraph-identity subgraph-identity/build/install/subgraph-identity/
COPY subgraph-organizations/build/install/subgraph-organizations subgraph-organizations/build/install/subgraph-organizations/
COPY subgraph-skills/build/install/subgraph-skills subgraph-skills/build/install/subgraph-skills/

# Copy the supergraph / router project
COPY supergraph supergraph/

# Copy the GraphQL schemas for each subgraph project
COPY subgraph-education/src/main/resources/graphql/education.graphqls subgraph-education/src/main/resources/graphql/education.graphqls
COPY subgraph-experience/src/main/resources/graphql/experience.graphqls subgraph-experience/src/main/resources/graphql/experience.graphqls
COPY subgraph-identity/src/main/resources/graphql/identity.graphqls subgraph-identity/src/main/resources/graphql/identity.graphqls
COPY subgraph-organizations/src/main/resources/graphql/organizations.graphqls subgraph-organizations/src/main/resources/graphql/organizations.graphqls
COPY subgraph-skills/src/main/resources/graphql/skills.graphqls subgraph-skills/src/main/resources/graphql/skills.graphqls

# Install rover
RUN apt-get update && apt-get install -y curl
RUN curl -sSL https://rover.apollo.dev/nix/latest | sh

# Install the router
RUN curl -sSL https://router.apollo.dev/download/nix/latest | sh
RUN mv /app/router /app/supergraph/router

EXPOSE 4000

ENTRYPOINT ["/bin/bash", "-c", "cd supergraph && ./go.sh"]
