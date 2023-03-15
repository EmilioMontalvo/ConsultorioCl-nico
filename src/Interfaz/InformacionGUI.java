package Interfaz;

import Logica.Consultorio;
import Logica.Paciente;

import javax.swing.*;
import java.awt.*;


public class InformacionGUI extends javax.swing.JFrame {

    RegistroClinicoGUI abrir;
    static Consultorio consultorio1;
    static String cedulaUsar;
    Paciente paciente;
    
    /**
    *Se crea una nueva ventana de información del paciente y muestra su información junto con su lista de citas.
    *@param cedula Cédula del paciente a mostrar información.
    *@param consultorio Consultorio en el que se buscará el paciente.
    */
    public InformacionGUI(String cedula, Consultorio consultorio) {
        initComponents();
        consultorio1 = consultorio;
        cedulaUsar = cedula;
        abrir = new RegistroClinicoGUI(consultorio1, cedulaUsar);
        paciente = consultorio1.buscar(cedulaUsar);
        txaInformacion.setText(paciente.toString() + "\n" + paciente.listaCitas.mostrarCitas());
    }

    /**
    *Inicializa y configura los componentes de la interfaz gráfica de usuario de InformacionGUI.
    *Se crea una etiqueta con el título "Información", un área de texto donde se muestra la información del paciente y sus citas, tres botones: "Regresar", "Añadir Cita" y "Actualizar".
    *Se agregan escuchadores de eventos a los botones para realizar acciones al presionarlos.
    */
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaInformacion = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        btnAñadirCita = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", Font.BOLD, 48));
        jLabel1.setText("Información");

        txaInformacion.setColumns(20);
        txaInformacion.setRows(5);
        txaInformacion.setEnabled(false);
        jScrollPane1.setViewportView(txaInformacion);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAñadirCita.setText("Añadir Cita");
        btnAñadirCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCitaActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1).addGroup(layout.createSequentialGroup().addComponent(btnRegresar).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(btnActualizar))).addContainerGap()).addGroup(layout.createSequentialGroup().addGap(247, 247, 247).addComponent(btnAñadirCita).addContainerGap(247, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1).addGap(87, 87, 87)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(btnAñadirCita).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnRegresar).addComponent(btnActualizar)).addContainerGap()));

        pack();
        setLocationRelativeTo(null);
    }

    /**
    *Método que se ejecuta cuando se presiona el botón "Regresar".
    *Hace que la ventana actual se vuelva invisible.
    *@param evt el evento de acción generado al presionar el botón
    */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    /**
    *Método que se ejecuta cuando se presiona el botón "Añadir Cita".
    *Hace que la ventana actual se vuelva invisible.
    *@param evt el evento de acción generado al presionar el botón
    */
    private void btnAñadirCitaActionPerformed(java.awt.event.ActionEvent evt) {
        abrir.setVisible(true);
    }

    /**
    *Actualiza la información del paciente y muestra la lista de citas en el área de texto.
    *@param evt evento de acción del botón actualizar
    */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {
        paciente = consultorio1.buscar(cedulaUsar);
        txaInformacion.setText(paciente.toString() + "\n" + paciente.listaCitas.mostrarCitas());
    }

    /**
    *Método principal del programa que establece el Look and Feel Nimbus como aspecto visual de la interfaz y crea una nueva instancia de la clase InformacionGUI, estableciéndola como visible.
    *@param args los argumentos de la línea de comandos
    */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionGUI.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionGUI(cedulaUsar, consultorio1).setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadirCita;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaInformacion;

}
