rm -rf ./docs/*

javadoc -d ./docs $(find . -name "*.java")

firefox ./docs/index.html
