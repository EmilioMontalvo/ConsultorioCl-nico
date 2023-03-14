package Logica;

public class Persona {
    public String cedula;
    public String nombrePersona;
    public String email;
    public String fecha;
    public String telefono;
    public String direccion;

    public Persona(String cedula, String nombrePersona, String email, String fecha, String telefPersona,
                   String direccion) {
        this.cedula = cedula;
        this.nombrePersona = nombrePersona;
        this.email = email;
        this.fecha = fecha;
        this.telefono = telefPersona;
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombrePersona + "\nCédula: " + cedula + "\nEmail: " + email + "\nFecha de nacimiento: " + fecha + "\nTeléfono " + telefono + "\nDirección: " + direccion + "\n";
    }
}
