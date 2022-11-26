# GraphQL Resume

Because why not?

## Docker

To push:

```shell
JAVA_HOME=`/usr/libexec/java_home -v 17` gw dockerBuild
docker push bodlulu/graphql-resume
```

To use:

```shell
docker run -p 4000:4000 bodlulu/graphql-resume
```
