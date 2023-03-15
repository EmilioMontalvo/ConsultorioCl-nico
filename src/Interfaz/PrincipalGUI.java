package Interfaz;

import Logica.Consultorio;

import javax.swing.*;

public class PrincipalGUI extends javax.swing.JFrame {
    Consultorio consultorio;
    InformacionGUI informaciónAbrir;
    RegistrarGUI registrarAbrir;
    boolean cedulaCorrecta;
    String cedula;
    
    /**
    *Constructor de la clase PrincipalGUI. Inicializa los componentes de la interfaz gráfica,
    *crea una instancia del objeto Consultorio y lo llena con registros predefinidos,
    *crea una instancia del objeto RegistrarGUI y establece la variable cedulaCorrecta en false.
    */
    public PrincipalGUI() {
        initComponents();
        consultorio = new Consultorio();
        consultorio.generarRegistros();
        registrarAbrir = new RegistrarGUI();
        cedulaCorrecta = false;
    }
    
    /**
    *Representa la interfaz gráfica de usuario principal del programa,
    *que permite al usuario buscar o registrar pacientes en el consultorio a través de su cédula.
    */
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48));
        jLabel1.setText("Consultorio");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel2.setText("Ingresar cédula");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setEnabled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(72, 72, 72).addComponent(jLabel1).addContainerGap(72, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(btnBuscar).addGap(101, 101, 101).addComponent(btnRegistrar)).addComponent(txtCedula)).addGap(140, 140, 140)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel2).addGap(200, 200, 200)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(12, 12, 12).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(27, 27, 27).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnBuscar).addComponent(btnRegistrar)).addContainerGap(20, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }

    /**
    *Acción que se realiza al presionar el botón "Buscar". Obtiene la cédula ingresada por el usuario y verifica que sea válida.
    *En caso de ser válida, verifica si el paciente está registrado en el consultorio.
    *Si el paciente está registrado, abre la ventana de información del paciente.
    *Si el paciente no está registrado, habilita el botón para registrar al paciente.
    *@param evt Evento generado al presionar el botón "Buscar".
    */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        cedula = txtCedula.getText();
        cedulaCorrecta = cedula.matches("\\d{10}");
        if (!cedulaCorrecta) {
            JOptionPane.showMessageDialog(null, "ERROR: Ingresar un número de cédula válido");
        } else {
            if (consultorio.existePaciente(txtCedula.getText())) {
                informaciónAbrir = new InformacionGUI(txtCedula.getText(), consultorio);
                informaciónAbrir.setVisible(true);
                registrarAbrir.setVisible(false);
                this.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "La persona no se encuentra registrada\nProceda a registrarla");
                btnRegistrar.setEnabled(true);
            }
        }
    }

    /**
    +Realiza la acción al presionar el botón "REGISTRAR".
    *Obtiene la cédula ingresada en el campo de texto "txtCedula", crea una instancia de RegistrarGUI y la hace visible.
    *@param evt El evento de acción generado por el botón "REGISTRAR".
    */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        cedula = txtCedula.getText();
        registrarAbrir = new RegistrarGUI(consultorio, cedula);
        this.setVisible(true);
        registrarAbrir.setVisible(true);
    }

    /**
    *Clase principal del programa que inicializa la interfaz gráfica de usuario
    *y establece el estilo "Nimbus" para la apariencia de la interfaz.
    *@param args los argumentos de la línea de comandos.
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
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null
                    , ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGUI().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCedula;

}
