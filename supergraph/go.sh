# Generate super graph
echo "# GENERATED FILE - DO NOT EDIT" > resume-supergraph.graphqls
rover supergraph compose --config ./resume-supergraph-rover-config.yaml >> resume-supergraph.graphqls

# Install the router if not present
if [ ! -f router ]; then
    echo "Installing router"
    curl -sSL https://router.apollo.dev/download/nix/latest | sh
fi

# Run the router
./router --dev --supergraph resume-supergraph.graphqls
