package Logica;


import javax.swing.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Manipulador {
    private BufferedReader lector;
    private String linea;
    String infoPaciente = "";
    private final String directorioActual = encontrarDirectorio();
    ;
    private static String[] partes;
    
    /**
    *Método que genera un archivo CSV a partir de los datos de los pacientes del consultorio.
    *@param clinica objeto Consultorio que contiene la lista de pacientes a exportar.
    */
    public void generarCsv(Consultorio clinica) {
        try {
            lector = new BufferedReader((new FileReader(directorioActual)));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                llenarPaciente(clinica);
            }
            lector.close();
            linea = null;
            partes = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
    *Método que llena un objeto Paciente con la información contenida en un archivo CSV y lo inserta en el árbol de pacientes de la clínica.
    *@param clinica contiene el árbol de pacientes en el cual se insertará el nuevo paciente.
    */
    public static void llenarPaciente(Consultorio clinica) {
        String cedulaStringCsv = partes[0];
        String nombreCsv = partes[1];
        String emailCsv = partes[2];
        String fechaCsv = partes[3];
        String telefonoCsv = partes[4];
        String direccionCsv = partes[5];


        System.out.println("El paciente con la siguiente información");
        Paciente paciente = new Paciente(cedulaStringCsv, nombreCsv, emailCsv, fechaCsv, telefonoCsv, direccionCsv);
        System.out.println(paciente); //Borrar
        clinica.arbolPacientes.insertarNodo(paciente);
    }
    
    /**
    *Mpetodo que guarda la información de un paciente en un archivo CSV.
    *@param paciente el paciente a guardar.
    */
    public void guardarPaciente(Paciente paciente) {
        try {
            infoPaciente = "";
            infoPaciente += "\n"+ paciente.cedula;
            infoPaciente += "," + paciente.nombrePersona;
            infoPaciente += "," + paciente.email;
            infoPaciente += "," + paciente.fecha;
            infoPaciente += "," + paciente.telefono;
            infoPaciente += "," + paciente.direccion;


            FileWriter fileWriter = new FileWriter(directorioActual, true);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            buffer.write(infoPaciente);
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    /**
    *Método que devuelve la ruta del archivo registros.csv dentro del directorio actual del programa.
    *@return la ruta del archivo registros.csv.
    */
    public static String encontrarDirectorio() {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "registros.csv");
        return String.valueOf(filePath);
    }

}
