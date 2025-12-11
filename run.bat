@echo off
REM Script para compilar y ejecutar la aplicación

echo ========================================
echo   APLICACION DE NUTRICION - CONSOLA
echo ========================================
echo.

REM Compilar
echo Compilando...
cd src
javac AppNutricion.java

if errorlevel 1 (
    echo ERROR en la compilación
    pause
    exit /b 1
)

echo.
echo ✅ Compilación exitosa
echo ========================================
echo.

REM Ejecutar
echo Iniciando aplicación...
echo.
java AppNutricion

pause
