# GraphQL Resume

Because why not?

## Docker

To push:

```shell
gw dockerBuild && docker push bodlulu/graphql-resume
```

To use:

```shell
docker run -p 4000:4000 -e APOLLO_KEY=<your key> -e APOLLO_GRAPH_REF=<your graph ref> bodlulu/graphql-resume
```

## Dependency updates

```shell
./gradlew refreshVersionsCatalog
```
