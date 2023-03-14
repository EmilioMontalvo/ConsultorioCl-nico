package Logica;

public class Consultorio {
    public ArbolPacientes arbolPacientes = new ArbolPacientes();
    private final Manipulador manipulador;

    public Consultorio() {
        String nombreConsultorio = "Consultorio Espin";
        String correoConsultorio = "consultorio_espin@outlook.es";
        String telefConsultorio = "2398755";
        this.manipulador = new Manipulador();
    }

    public void atender(String cedula, String sintomas, String diagnostico, String prescripcion) {
        // Se agrega la atención del paciente en su historial médico
        Paciente paciente = buscar(cedula);
        paciente.listaCitas.insertarCabeza(paciente, sintomas, diagnostico, prescripcion);
    }

    public Paciente buscar(String cedula) {
        long busqueda = Long.parseLong(cedula);
        return arbolPacientes.buscarNodo(busqueda);
    }

    public void registrar(Paciente paciente) {
        arbolPacientes.insertarNodo(paciente);
        manipulador.guardarPaciente(paciente);
    }

    public boolean existePaciente(String cedula) {
        return buscar(cedula) != null;
    }

    public void generarRegistros() {
        manipulador.generarCsv(this);
    }



}
