# Install rover if not present
if [ ! -f $HOME/.rover/bin/rover ]; then
  echo "Installing rover"
  curl -sSL https://rover.apollo.dev/nix/latest | sh
fi

# Generate super graph
echo "# GENERATED FILE - DO NOT EDIT" > resume-supergraph.graphqls
$HOME/.rover/bin/rover supergraph compose --config ./resume-supergraph-rover-config.yaml --elv2-license=accept >> resume-supergraph.graphqls

# Install the router if not present
if [ ! -f router ]; then
    echo "Installing router"
    curl -sSL https://router.apollo.dev/download/nix/latest | sh
fi

# Push the subgraph schemas to Apollo Studio
yes | $HOME/.rover/bin/rover subgraph publish $APOLLO_GRAPH_REF --name resume --schema ../subgraph-resume/src/main/resources/graphql/resume.graphqls
yes | $HOME/.rover/bin/rover subgraph publish $APOLLO_GRAPH_REF --name organizations --schema ../subgraph-organizations/src/main/resources/graphql/organizations.graphqls

# Run the subgraphs in background
../subgraph-resume/build/install/subgraph-resume/bin/subgraph-resume &
sleep 5
../subgraph-organizations/build/install/subgraph-organizations/bin/subgraph-organizations &
sleep 5


# Run the router
# Pass --supergraph to not use Apollo Studio, like so:
# ./router --log trace --dev --config router.yaml --supergraph resume-supergraph.graphqls
# To use Apollo Studio instead, you need to set the following environment variables:
# APOLLO_KEY=<your key>
# APOLLO_GRAPH_REF=<your graph ref>
./router --log trace --dev --config router.yaml
