import java.time.LocalDate;
import java.util.*;

// Clase para representar un Paciente
class Paciente {
    private static int contadorID = 1;
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String genero;
    private String direccion;
    private String ocupacion;
    private HistorialClinico historial;

    public Paciente(String nombre, String apellido, String email, String telefono,
                    LocalDate fechaNacimiento, String genero, String direccion, String ocupacion) {
        this.id = contadorID++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.historial = new HistorialClinico();
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getGenero() { return genero; }
    public String getDireccion() { return direccion; }
    public String getOcupacion() { return ocupacion; }
    public HistorialClinico getHistorial() { return historial; }
    public void setHistorial(HistorialClinico historial) { this.historial = historial; }

    @Override
    public String toString() {
        return String.format(
            "=== PACIENTE ===\n" +
            "ID: %d\n" +
            "Nombre: %s %s\n" +
            "Email: %s\n" +
            "Teléfono: %s\n" +
            "Fecha Nacimiento: %s\n" +
            "Género: %s\n" +
            "Dirección: %s\n" +
            "Ocupación: %s",
            id, nombre, apellido, email, telefono, fechaNacimiento, genero, direccion, ocupacion
        );
    }
}

// Clase para Historial Clínico
class HistorialClinico {
    private String antecedentes;
    private String habitos;
    private String medicamentos;
    private String alergias;
    private String metaNutricional;
    private String restricciones;

    public HistorialClinico() {
        this.antecedentes = "";
        this.habitos = "";
        this.medicamentos = "";
        this.alergias = "";
        this.metaNutricional = "";
        this.restricciones = "";
    }

    // Getters y Setters
    public String getAntecedentes() { return antecedentes; }
    public void setAntecedentes(String antecedentes) { this.antecedentes = antecedentes; }

    public String getHabitos() { return habitos; }
    public void setHabitos(String habitos) { this.habitos = habitos; }

    public String getMedicamentos() { return medicamentos; }
    public void setMedicamentos(String medicamentos) { this.medicamentos = medicamentos; }

    public String getAlergias() { return alergias; }
    public void setAlergias(String alergias) { this.alergias = alergias; }

    public String getMetaNutricional() { return metaNutricional; }
    public void setMetaNutricional(String metaNutricional) { this.metaNutricional = metaNutricional; }

    public String getRestricciones() { return restricciones; }
    public void setRestricciones(String restricciones) { this.restricciones = restricciones; }

    @Override
    public String toString() {
        return String.format(
            "\n=== HISTORIAL CLÍNICO ===\n" +
            "Antecedentes: %s\n" +
            "Hábitos: %s\n" +
            "Medicamentos: %s\n" +
            "Alergias: %s\n" +
            "Meta Nutricional: %s\n" +
            "Restricciones: %s",
            antecedentes, habitos, medicamentos, alergias, metaNutricional, restricciones
        );
    }
}

// Clase para el Nutricionista
class Nutricionista {
    private String nombre;
    private String email;
    private String cédula;
    private List<Paciente> pacientes;

    public Nutricionista(String nombre, String email, String cédula) {
        this.nombre = nombre;
        this.email = email;
        this.cédula = cédula;
        this.pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente registrado exitosamente!");
    }

    public Paciente buscarPaciente(int id) {
        for (Paciente p : pacientes) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados");
            return;
        }
        System.out.println("\n=== LISTA DE PACIENTES ===");
        for (Paciente p : pacientes) {
            System.out.println(p.getId() + ". " + p.getNombre() + " " + p.getApellido() + " (" + p.getEmail() + ")");
        }
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getCédula() { return cédula; }
}

// Clase principal con menú
public class AppNutricion {
    static Scanner scanner = new Scanner(System.in);
    static Nutricionista nutricionista;

    public static void main(String[] args) {
        // Crear nutricionista por defecto
        nutricionista = new Nutricionista("Kevin Sarango", "kevin.sarango@unl.edu.ec", "0706789012");

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║   APLICACIÓN DE GESTIÓN NUTRICIONAL ║");
        System.out.println("║                                    ║");
        System.out.println("║  Nutricionista: " + nutricionista.getNombre());
        System.out.println("║  Email: " + nutricionista.getEmail());
        System.out.println("╚════════════════════════════════════╝\n");

        menuPrincipal();
    }

    static void menuPrincipal() {
        boolean activo = true;

        while (activo) {
            System.out.println("\n═════════════════════════════════════");
            System.out.println("           MENÚ PRINCIPAL");
            System.out.println("═════════════════════════════════════");
            System.out.println("1. Registrar nuevo paciente");
            System.out.println("2. Ver historial clínico de paciente");
            System.out.println("3. Listar todos los pacientes");
            System.out.println("4. Salir");
            System.out.print("\nSelecciona una opción (1-4): ");

            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    registrarPaciente();
                    break;
                case "2":
                    verHistorial();
                    break;
                case "3":
                    nutricionista.listarPacientes();
                    break;
                case "4":
                    System.out.println("\n¡Hasta luego!");
                    activo = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    static void registrarPaciente() {
        System.out.println("\n════════════════════════════════════");
        System.out.println("    REGISTRO DE NUEVO PACIENTE");
        System.out.println("════════════════════════════════════");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine().trim();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine().trim();

        System.out.print("Email: ");
        String email = scanner.nextLine().trim();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine().trim();

        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine().trim());

        System.out.print("Género (M/F/O): ");
        String genero = scanner.nextLine().trim().toUpperCase();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine().trim();

        System.out.print("Ocupación: ");
        String ocupacion = scanner.nextLine().trim();

        // Crear paciente
        Paciente paciente = new Paciente(nombre, apellido, email, telefono, fechaNacimiento, genero, direccion, ocupacion);
        nutricionista.agregarPaciente(paciente);

        // Preguntar si desea agregar historial
        System.out.print("\n¿Deseas agregar historial clínico ahora? (S/N): ");
        String respuesta = scanner.nextLine().trim().toUpperCase();

        if (respuesta.equals("S")) {
            agregarHistorial(paciente);
        }
    }

    static void agregarHistorial(Paciente paciente) {
        System.out.println("\n════════════════════════════════════");
        System.out.println("   HISTORIAL CLÍNICO - " + paciente.getNombre().toUpperCase());
        System.out.println("════════════════════════════════════");

        System.out.print("Antecedentes médicos: ");
        paciente.getHistorial().setAntecedentes(scanner.nextLine().trim());

        System.out.print("Hábitos (dieta, ejercicio, etc): ");
        paciente.getHistorial().setHabitos(scanner.nextLine().trim());

        System.out.print("Medicamentos actuales: ");
        paciente.getHistorial().setMedicamentos(scanner.nextLine().trim());

        System.out.print("Alergias: ");
        paciente.getHistorial().setAlergias(scanner.nextLine().trim());

        System.out.print("Meta nutricional: ");
        paciente.getHistorial().setMetaNutricional(scanner.nextLine().trim());

        System.out.print("Restricciones dietéticas: ");
        paciente.getHistorial().setRestricciones(scanner.nextLine().trim());

        System.out.println("Historial clínico registrado!");
    }

    static void verHistorial() {
        System.out.println("\n════════════════════════════════════");
        nutricionista.listarPacientes();

        System.out.print("\nIngresa el ID del paciente: ");
        int id = Integer.parseInt(scanner.nextLine().trim());

        Paciente paciente = nutricionista.buscarPaciente(id);

        if (paciente == null) {
            System.out.println("Paciente no encontrado");
            return;
        }

        System.out.println("\n" + paciente);
        System.out.println(paciente.getHistorial());
    }
}
