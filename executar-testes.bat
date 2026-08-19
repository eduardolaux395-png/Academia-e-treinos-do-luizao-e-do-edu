@echo off
setlocal

cd /d "%~dp0"

echo ========================================
echo     TESTES AUTOMATIZADOS DA ACADEMIA
echo ========================================
echo.

powershell.exe -NoProfile -ExecutionPolicy Bypass -File "%~dp0executar-testes.ps1"
set "CODIGO_SAIDA=%ERRORLEVEL%"

echo.
if not "%CODIGO_SAIDA%"=="0" (
    echo RESULTADO: OS TESTES FALHARAM.
    if /i not "%~1"=="--no-pause" pause
    exit /b %CODIGO_SAIDA%
)

echo RESULTADO: TODOS OS TESTES PASSARAM.
if /i not "%~1"=="--no-pause" pause
exit /b 0
