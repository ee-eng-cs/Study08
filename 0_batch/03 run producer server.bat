@echo off
set JAVA_HOME=C:\PROGRA~1\JAVA\JDK-12
set JAR=..\microservices-producer\target\Study08_microservices-producer-1.0.0-SNAPSHOT.jar
if exist %JAR% call %JAVA_HOME%\bin\java -jar %JAR%
pause