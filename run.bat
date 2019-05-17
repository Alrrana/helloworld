@echo off
SET JAVA_HOME=C:\Program Files\Java\jdk-12.0.1
mvn clean compile exec:java  -Pquick
pause