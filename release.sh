#!/usr/bin/env bash
if [ $# -eq 0 ]
  then
    echo "No arguments supplied"
    exit
fi

./gradlew :clean :build :publish
echo "Promote repo at https://s01.oss.sonatype.org/#nexus-search;quick~io.finnhub"
echo "Check code update https://repo1.maven.org/maven2/io/finnhub/kotlin-client/"
git add -A
git commit -m "update v$1"
git push