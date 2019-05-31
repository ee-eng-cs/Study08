@echo on
@set CURL=c:\tools\curl-7.58.0\bin\curl.exe
@set CURL=%CURL% -g -i -H "Accept: application/json" -H "Content-Type: application/json"
@set HR_YELLOW=@powershell -Command Write-Host "----------------------------------------------------------------------" -foreground "Yellow"
@set HR_RED=@powershell    -Command Write-Host "----------------------------------------------------------------------" -foreground "Red"

%HR_YELLOW%
@powershell -Command Write-Host "Content from producer service - port 8081" -foreground "Green"
%CURL% "http://localhost:8081/content"

@echo.
%HR_YELLOW%
@powershell -Command Write-Host "Content from producer service - port 9091" -foreground "Green"
%CURL% "http://localhost:9091/content"

@echo.
%HR_YELLOW%
@powershell -Command Write-Host "Launch consumer service" -foreground "Green"
%CURL% "http://localhost:8082/launch_consumer_service"

@echo.
%HR_RED%
@powershell -Command Write-Host "FINISH" -foreground "Red"
pause