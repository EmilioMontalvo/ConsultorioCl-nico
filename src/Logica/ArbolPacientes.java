package Logica;

public class ArbolPacientes {
    public Paciente raiz;

    public ArbolPacientes() {
        this.raiz = null;
    }

    public void insertarNodo(Paciente paciente) {
        if (arbolVacio()) {
            raiz = paciente;
        } else {
            raiz.enlazarNodo(paciente);
        }
    }

    public Paciente buscarNodo(long busqueda) {
        if (arbolVacio()) return null;

        Paciente nodoActual = raiz;     // Nodo que recorre
        while (nodoActual.cedulaActual != busqueda) {

            // Hay dos posibilidades, que sea menor o mayor
            if (busqueda < nodoActual.cedulaActual) {
                nodoActual = nodoActual.hijoIzquierdo;
            } else {
                nodoActual = nodoActual.hijoDerecho;
            }
            // Verifica en cada iteración si el nodoActual es nulo
            if (nodoActual == null) {
                return null;
            }

        }
        // Si se encontró un nodo con el elemento a buscar
        // entonces padre es el nodo previo a actualizarse
        return nodoActual;
    }

    public boolean arbolVacio() {
        // Si la raiz es nulo entonces arbol vacío
        return this.raiz == null;
    }
}

