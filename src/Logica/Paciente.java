package Logica;

public class Paciente extends Persona {
    public ListaCitas listaCitas = new ListaCitas();

    public long cedulaActual;

    public Paciente hijoDerecho;
    public Paciente hijoIzquierdo;

    public Paciente(String cedula, String nombrePersona, String email, String fecha, String telefPersona,
                    String direccion) {
        super(cedula, nombrePersona, email, fecha, telefPersona, direccion);
        this.cedulaActual = Long.parseLong(cedula);
        hijoDerecho = hijoIzquierdo = null;
    }
    
    /**
    *Método que enlaza un nodo a un árbol de pacientes ordenado por la cédula del paciente. Si la cédula del paciente es menor a la cédula del nodo actual, 
    *el paciente se inserta en el subárbol izquierdo. Si la cédula del paciente es mayor o igual a la cédula del nodo actual, el paciente se inserta en el 
    *subárbol derecho.
    *@param paciente el paciente a insertar en el árbol
    */
    public void enlazarNodo(Paciente paciente) {
        long cedula = Long.parseLong(paciente.cedula);
        if (cedula < cedulaActual) {
            // Insertar Izquierda
            if (this.hijoIzquierdo == null) {
                this.hijoIzquierdo = paciente;
            } else {
                this.hijoIzquierdo.enlazarNodo(paciente);
            }
        } else {
            // Insertar Derecha
            if (this.hijoDerecho == null) {
                this.hijoDerecho = paciente;
            } else {
                this.hijoDerecho.enlazarNodo(paciente);
            }
        }
    }
}
