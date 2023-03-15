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
    
    /**
    * Metodo que registra la atención de un paciente en su historial médico.
    *@param cedula el número de cédula del paciente a atender.
    *@param sintomas una cadena de texto que describe los síntomas del paciente.
    *@param diagnostico una cadena de texto que describe el diagnóstico del paciente.
    *@param prescripcion una cadena de texto que describe la prescripción médica para el paciente.
    */
    public void atender(String cedula, String sintomas, String diagnostico, String prescripcion) {
        // Se agrega la atención del paciente en su historial médico
        Paciente paciente = buscar(cedula);
        paciente.listaCitas.insertarCabeza(paciente, sintomas, diagnostico, prescripcion);
    }
    
    /**
    *Metodo que busca un objeto Paciente en el árbol de pacientes a partir del número de cédula.
    *@param cedula el número de cédula del paciente a buscar.
    *@return el objeto Paciente que corresponde a la cédula buscada, o null si no se encontró.
    */
    public Paciente buscar(String cedula) {
        long busqueda = Long.parseLong(cedula);
        return arbolPacientes.buscarNodo(busqueda);
    }
    
    /**
    *Metodo que registra un nuevo paciente en el sistema.
    *@param paciente el objeto Paciente a registrar.
    */
    public void registrar(Paciente paciente) {
        arbolPacientes.insertarNodo(paciente);
        manipulador.guardarPaciente(paciente);
    }
    
    /**
    * Metodo que verifica si existe un paciente en el sistema a partir del número de cédula.
    *@param cedula el número de cédula del paciente a buscar.
    *@return true si el paciente existe en el sistema, false en caso contrario.
    */
    public boolean existePaciente(String cedula) {
        return buscar(cedula) != null;
    }
    
    /**
    *Metodo que genera un archivo CSV con los registros de los pacientes del sistema.
    */
    public void generarRegistros() {
        manipulador.generarCsv(this);
    }



}
