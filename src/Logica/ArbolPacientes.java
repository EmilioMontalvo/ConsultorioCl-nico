package Logica;

public class ArbolPacientes {
    public Paciente raiz;

    public ArbolPacientes() {
        this.raiz = null;
    }
    /** 
     * Metodo que sirve para insertar un nodo al arbol
     * @param paciente obejto Paciente que se agregara al arbol
     */
    public void insertarNodo(Paciente paciente) {
        if (arbolVacio()) {
            raiz = paciente;
        } else {
            raiz.enlazarNodo(paciente);
        }
    }
    
   /** 
    * Metodo que busca un nodo en el árbol por su número de cédula
    * @param busqueda el número de cédula a buscar en el árbol
    * @return el nodo del árbol que contiene el número de cédula buscado, o null si no se encontró
    */
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
   /** 
    * Metodo que verifica si el árbol está vacío.
    * @return true si el árbol está vacío, false en caso contrario.
    */
    public boolean arbolVacio() {
        // Si la raiz es nulo entonces arbol vacío
        return this.raiz == null;
    }
}

