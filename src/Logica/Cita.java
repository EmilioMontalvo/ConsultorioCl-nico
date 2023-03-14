package Logica;

import java.util.Date;

public class Cita {

    Date horaAtencion;
    Paciente paciente;
    Cita siguiente;
    String sintomas;
    String diagnostico;
    String prescripcion;

    public Cita(Paciente paciente, String sintomas, String diagnostico, String prescripcion) {
        this.siguiente = null;
        this.paciente = paciente;
        this.horaAtencion = new Date();
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.prescripcion = prescripcion;
    }
}