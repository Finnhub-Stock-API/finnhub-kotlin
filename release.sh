#!/usr/bin/env bash
./gradlew :clean :build :publish
echo "Promote repo at https://s01.oss.sonatype.org/#nexus-search;quick~io.finnhub"
echo "Check code update https://repo1.maven.org/maven2/io/finnhub/kotlin-client/"