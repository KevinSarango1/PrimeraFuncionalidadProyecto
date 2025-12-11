# 📋 Aplicación de Nutrición - Consola

Aplicación simple de consola para registrar pacientes y su historial clínico.

## 🚀 Ejecutar

### Windows
```bash
double-click run.bat
```

O desde PowerShell:
```powershell
cd prueba
.\run.bat
```

### Linux/Mac
```bash
chmod +x run.sh
./run.sh
```

## 📝 Características

- ✅ Nutricionista predefinido: **Kevin Sarango**
- ✅ Registrar pacientes
- ✅ Registrar historial clínico
- ✅ Ver historial de paciente
- ✅ Listar todos los pacientes
- ✅ Todo en consola (sin web)

## 🎯 Menú Principal

```
1. Registrar nuevo paciente
2. Ver historial clínico de paciente
3. Listar todos los pacientes
4. Salir
```

## 💻 Requisitos

- Java 17+ instalado

Verifica:
```bash
java -version
```

## 📊 Ejemplo de Uso

```
1. Selecciona opción 1 (Registrar nuevo paciente)
2. Llena los datos:
   - Nombre, Apellido, Email, Teléfono
   - Fecha de Nacimiento (YYYY-MM-DD)
   - Género, Dirección, Ocupación
3. Responde SI para agregar historial clínico
4. Llena:
   - Antecedentes, Hábitos, Medicamentos
   - Alergias, Meta Nutricional, Restricciones
5. ¡Listo! El paciente está registrado
```

## 📁 Estructura

```
prueba/
├── run.bat          # Script Windows
├── run.sh           # Script Linux/Mac
├── README.md        # Este archivo
└── src/
    └── AppNutricion.java   # Código fuente
```

## 🔧 Compilar Manualmente

```bash
cd prueba/src
javac AppNutricion.java
java AppNutricion
```
