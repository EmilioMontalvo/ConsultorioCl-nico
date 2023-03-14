package Interfaz;

import Logica.Consultorio;
import Logica.Paciente;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class RegistrarGUI extends javax.swing.JFrame {

    static Consultorio consultorio1;
    static String cedula;
    Paciente paciente;
    SimpleDateFormat formato;
    String nombre;
    String apellido;
    Date fecha;
    String telefono;
    String email;
    String direccion;


    public RegistrarGUI() {
    }

    public RegistrarGUI(Consultorio consultorio, String cedulaUsar) {
        initComponents();
        consultorio1 = consultorio;
        cedula = cedulaUsar;
        formato = new SimpleDateFormat("dd/MM/yyyy");
    }

    public void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        jdcFechaNac.setDate(null);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblFechaNac = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar");
        setName("Historial Médico");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblFechaNac.setText("Fecha de Nacimiento");

        lblTelefono.setText("Teléfono");

        lblEmail.setText("Email");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblDireccion.setText("Dirección");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(35, 35, 35).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(lblNombre).addGap(18, 18, 18).addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(lblFechaNac).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(lblEmail).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(lblApellido).addGap(18, 18, 18).addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(lblTelefono).addGap(18, 18, 18).addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(lblDireccion).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(txtDireccion))).addContainerGap(35, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(btnRegresar).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(btnGuardar).addGap(268, 268, 268)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblNombre).addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lblApellido).addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(26, 26, 26).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblTelefono).addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lblFechaNac)).addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(42, 42, 42)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblDireccion).addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lblEmail).addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(btnGuardar).addGap(20, 20, 20)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(btnRegresar).addContainerGap()))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        String fechaNac = "";
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        fecha = jdcFechaNac.getDate();
        telefono = txtTelefono.getText();
        direccion = txtDireccion.getText();
        email = txtEmail.getText();

        if (!nombre.matches("[A-Za-z]+")) {
            JOptionPane.showMessageDialog(null, "ERROR: Ingresar un nombre");
            txtNombre.setText("");
        }

        if (!apellido.matches("[A-Za-z]+")) {
            JOptionPane.showMessageDialog(null, "ERROR: Ingresar un apellido");
            txtApellido.setText("");
        }

        if (fecha == null) {
            JOptionPane.showMessageDialog(null, "ERROR: Seleccionar una fecha");
            jdcFechaNac.setDate(null);
        } else {
            fechaNac = fecha + "";
        }

        if (!telefono.matches("[0-9]{7}")) {
            JOptionPane.showMessageDialog(null, "ERROR: Ingresar un teléfono válido");
            txtTelefono.setText("");
        }

        if (direccion.equals("")) {
            JOptionPane.showMessageDialog(null, "ERROR: Ingresar una dirección");
            txtDireccion.setText("");
        }

        if (!email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
            JOptionPane.showMessageDialog(null, "ERROR: Ingresar una email");
            txtEmail.setText("");
        }
        if (nombre.matches("[A-Za-z]+") && apellido.matches("[A-Za-z]+") && fecha != null && telefono.matches("[0-9" + "]{7}") && !direccion.equals("") && email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+" + "(?:\\.[a-zA-Z0-9-]+)*$")) {
            paciente = new Paciente(cedula, nombre + " " + apellido, email, fechaNac, telefono, direccion);
            consultorio1.registrar(paciente);
            JOptionPane.showMessageDialog(rootPane, "Paciente registrado exitosamente\nRegrese a la pantalla principal con el botón regresar");
            limpiar();
        }
    }

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null
                    , ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrarGUI(consultorio1, cedula).setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;

}