package Logica;



public class ListaCitas {
    Cita cabeza = null;
    
    /**
    *Método que inserta una nueva cita al inicio de la lista de citas del paciente.
    *@param paciente el objeto Paciente al que se le agrega la nueva cita.
    *@param sintomas una cadena de texto que describe los síntomas del paciente.
    *@param diagnostico una cadena de texto que describe el diagnóstico del paciente.
    *@param prescripcion una cadena de texto que describe la prescripción médica para el paciente.
    */
    public void insertarCabeza(Paciente paciente, String sintomas, String diagnostico, String prescripcion) {
        Cita nuevoCita = new Cita(paciente, sintomas, diagnostico, prescripcion);
        // Si la lista no está vacía el siguiente del nuevoNodo
        // será la cabeza
        if (!listaVacia()) {
            nuevoCita.siguiente = cabeza;
        }
        // Se actualiza el nodo cabeza por nuevoCita
        cabeza = nuevoCita;
    }
    
    /**
    *Método que devuelve una cadena de texto con la información de las citas del paciente. Imprime linealmente las citas, cada una con los datos de fecha y hora de atención, síntomas,
    *diagnóstico y prescripción médica. La lista de citas está vacía, devuelve "No existen citas".
    *@return una cadena de texto con la información de las citas del paciente.
    */
    public String mostrarCitas() {
        String infoCitas = "";
        if (listaVacia()) {
            infoCitas = "No existen citas";
        } else {
            Cita citaActual = cabeza;
            while (citaActual.siguiente != null) {
                infoCitas += "Cita: " + citaActual.horaAtencion + "\nSintomas:\n" + citaActual.sintomas +
                        "\nDiagnostico\n" + citaActual.diagnostico + "\nPrescripción:\n" + citaActual.prescripcion +
                        "\n";
                citaActual = citaActual.siguiente;

            }
            infoCitas += "Cita: " + citaActual.horaAtencion + "\nSintomas:\n" + citaActual.sintomas + "\nDiagnostico" +
                    "\n" + citaActual.diagnostico + "\nPrescripción:\n" + citaActual.prescripcion + "\n";
        }
        return infoCitas;
    }

    public boolean listaVacia() {
        return cabeza == null;
    }

}
