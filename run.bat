@echo off
mvn compile
mvn package
java -cp target/helloworld-1.0.jar
pause