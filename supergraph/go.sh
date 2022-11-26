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

# Run the subgraphs in background
../subgraph-education/build/install/subgraph-education/bin/subgraph-education &
sleep 2
../subgraph-experience/build/install/subgraph-experience/bin/subgraph-experience &
sleep 2
../subgraph-identity/build/install/subgraph-identity/bin/subgraph-identity &
sleep 2
../subgraph-organizations/build/install/subgraph-organizations/bin/subgraph-organizations &
sleep 2
../subgraph-skills/build/install/subgraph-skills/bin/subgraph-skills &
sleep 2


# Run the router
./router --log trace --dev --config router.yaml --supergraph resume-supergraph.graphqls
