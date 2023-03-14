package Logica;



public class ListaCitas {
    Cita cabeza = null;

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

    // Imprime linealmente. Al imprimir 15 valores hay un salto de línea
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
