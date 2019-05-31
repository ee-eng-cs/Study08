@echo off
set JAVA_HOME=C:\PROGRA~1\JAVA\JDK-12
set M2_HOME=c:\tools\apache-maven-3.6.0
set SKIP_TESTS=-DskipTests -Dmaven.test.skip=true
pushd %cd%
cd ..
call %M2_HOME%\bin\mvn clean install %SKIP_TESTS%
pause
popd