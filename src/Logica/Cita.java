package Logica;

import java.util.Date;

public class Cita {

    Date horaAtencion;
    Paciente paciente;
    Cita siguiente;
    String sintomas;
    String diagnostico;
    String prescripcion;
    
    /**
    *Constructor de la clase Cita.
    *@param paciente el objeto Paciente asociado a la cita.
    *@param sintomas una cadena de texto que describe los síntomas del paciente.
    *@param diagnostico una cadena de texto que describe el diagnóstico del paciente.
    *@param prescripcion una cadena de texto que describe la prescripción médica para el paciente.
    */

    public Cita(Paciente paciente, String sintomas, String diagnostico, String prescripcion) {
        this.siguiente = null;
        this.paciente = paciente;
        this.horaAtencion = new Date();
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.prescripcion = prescripcion;
    }
}
