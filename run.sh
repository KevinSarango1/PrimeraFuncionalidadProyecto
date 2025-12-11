#!/bin/bash
# Script para compilar y ejecutar la aplicación

echo "========================================"
echo "  APLICACION DE NUTRICION - CONSOLA"
echo "========================================"
echo ""

# Compilar
echo "Compilando..."
cd src
javac AppNutricion.java

if [ $? -ne 0 ]; then
    echo "ERROR en la compilación"
    exit 1
fi

echo ""
echo "✅ Compilación exitosa"
echo "========================================"
echo ""

# Ejecutar
echo "Iniciando aplicación..."
echo ""
java AppNutricion
