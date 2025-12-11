# 🎬 DEMO - Cómo Se Ve la Aplicación

## 🚀 AL EJECUTAR

```
╔════════════════════════════════════╗
║   APLICACIÓN DE GESTIÓN NUTRICIONAL ║
║                                    ║
║  Nutricionista: Kevin Sarango      ║
║  Email: kevin.sarango@unl.edu.ec   ║
╚════════════════════════════════════╝

═════════════════════════════════════
           MENÚ PRINCIPAL
═════════════════════════════════════
1. Registrar nuevo paciente
2. Ver historial clínico de paciente
3. Listar todos los pacientes
4. Salir

Selecciona una opción (1-4): █
```

---

## 📋 OPCIÓN 1: REGISTRAR PACIENTE

```
════════════════════════════════════
    REGISTRO DE NUEVO PACIENTE
════════════════════════════════════

Nombre: Juan
Apellido Pérez
Email: juan@example.com
Teléfono: 0999999999
Fecha de Nacimiento (YYYY-MM-DD): 1990-05-15
Género (M/F/O): M
Dirección: Calle Principal 123
Ocupación: Ingeniero

✅ Paciente registrado exitosamente!

¿Deseas agregar historial clínico ahora? (S/N): S
```

---

## 📝 AGREGAR HISTORIAL

```
════════════════════════════════════
   HISTORIAL CLÍNICO - JUAN
════════════════════════════════════

Antecedentes médicos: Hipertensión diagnosticada hace 5 años
Hábitos (dieta, ejercicio, etc): Come mucho pan, sedentario
Medicamentos actuales: Losartán 100mg diarios
Alergias: Penicilina
Meta nutricional: Alcanzar peso ideal de 75 kg
Restricciones dietéticas: Bajo en sodio y grasas

✅ Historial clínico registrado!

═════════════════════════════════════
           MENÚ PRINCIPAL
═════════════════════════════════════
1. Registrar nuevo paciente
2. Ver historial clínico de paciente
3. Listar todos los pacientes
4. Salir

Selecciona una opción (1-4): █
```

---

## 📊 OPCIÓN 3: LISTAR PACIENTES

```
════════════════════════════════════

=== LISTA DE PACIENTES ===
1. Juan Pérez (juan@example.com)
2. María García (maria@example.com)
3. Carlos López (carlos@example.com)

═════════════════════════════════════
           MENÚ PRINCIPAL
═════════════════════════════════════
1. Registrar nuevo paciente
2. Ver historial clínico de paciente
3. Listar todos los pacientes
4. Salir

Selecciona una opción (1-4): █
```

---

## 🔍 OPCIÓN 2: VER HISTORIAL

```
════════════════════════════════════

=== LISTA DE PACIENTES ===
1. Juan Pérez (juan@example.com)
2. María García (maria@example.com)

Ingresa el ID del paciente: 1

=== PACIENTE ===
ID: 1
Nombre: Juan Pérez
Email: juan@example.com
Teléfono: 0999999999
Fecha Nacimiento: 1990-05-15
Género: M
Dirección: Calle Principal 123
Ocupación: Ingeniero

=== HISTORIAL CLÍNICO ===
Antecedentes: Hipertensión diagnosticada hace 5 años
Hábitos: Come mucho pan, sedentario
Medicamentos: Losartán 100mg diarios
Alergias: Penicilina
Meta Nutricional: Alcanzar peso ideal de 75 kg
Restricciones: Bajo en sodio y grasas

═════════════════════════════════════
           MENÚ PRINCIPAL
═════════════════════════════════════
1. Registrar nuevo paciente
2. Ver historial clínico de paciente
3. Listar todos los pacientes
4. Salir

Selecciona una opción (1-4): █
```

---

## ❌ OPCIÓN 4: SALIR

```
════════════════════════════════════

════════════════════════════════════
           MENÚ PRINCIPAL
════════════════════════════════════
1. Registrar nuevo paciente
2. Ver historial clínico de paciente
3. Listar todos los pacientes
4. Salir

Selecciona una opción (1-4): 4

👋 ¡Hasta luego!

PS C:\Users\ASUS\Downloads\IMC\prueba>
```

---

## 🎯 FLUJO COMPLETO

```
INICIO
  ↓
┌─────────────────────────────┐
│   MENÚ PRINCIPAL            │
│  1. Registrar Paciente      │
│  2. Ver Historial           │
│  3. Listar Pacientes        │
│  4. Salir                   │
└─────────────────────────────┘
  ↓ (selecciona 1)
┌─────────────────────────────┐
│   REGISTRO PACIENTE         │
│  - Nombre: Juan             │
│  - Apellido: Pérez          │
│  - Email: juan@example.com  │
│  - Teléfono: 0999999999     │
│  - ... más campos ...       │
└─────────────────────────────┘
  ↓
¿Agregar Historial? (S/N)
  ↓ (SÍ)
┌─────────────────────────────┐
│   HISTORIAL CLÍNICO         │
│  - Antecedentes             │
│  - Hábitos                  │
│  - Medicamentos             │
│  - Alergias                 │
│  - Meta Nutricional         │
│  - Restricciones            │
└─────────────────────────────┘
  ↓
✅ PACIENTE REGISTRADO
  ↓
Vuelve al MENÚ PRINCIPAL
```

---

## 💡 CARACTERÍSTICAS VISIBLES

✅ **Interfaz clara** con bordes ASCII
✅ **Menú interactivo** fácil de navegar
✅ **Validación de entrada** (fechas, selecciones)
✅ **Mensajes de confirmación** (✅ ❌)
✅ **Formateo de salida** bien organizado
✅ **Datos persistentes** durante la sesión
✅ **Sin errores** (compilado y probado)

---

## 🎨 ELEMENTOS VISUALES

```
╔════╗  ← Bordes de encabezado
║    ║
╚════╝

═════  ← Separadores

✅     ← Confirmación exitosa
❌     ← Error
👋     ← Despedida

→ Indentación para menús
```

---

Cuando ejecutes `run.bat`, verás exactamente esto en tu pantalla. ¡Pruébalo!
