package Interfaz;

import Logica.Consultorio;

import javax.swing.*;

public class RegistroClinicoGUI extends javax.swing.JFrame {

    static Consultorio consultorio1;
    static String cedulaUsar;
    String sintomas;
    String diagnostico;
    String prescripcion;

    public RegistroClinicoGUI(Consultorio consultorio, String cedula) {
        initComponents();
        consultorio1 = consultorio;
        cedulaUsar = cedula;
    }


    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSintomas = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDiagnostico = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaPrescripcion = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 670));
        setPreferredSize(new java.awt.Dimension(558, 523));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sintomas"));

        txaSintomas.setColumns(20);
        txaSintomas.setRows(5);
        jScrollPane1.setViewportView(txaSintomas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Diagnostico"));

        txaDiagnostico.setColumns(20);
        txaDiagnostico.setRows(5);
        jScrollPane2.setViewportView(txaDiagnostico);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane2).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Prescripción"));

        txaPrescripcion.setColumns(20);
        txaPrescripcion.setRows(5);
        jScrollPane3.setViewportView(txaPrescripcion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane3).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel1.setText("Registro");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(154, Short.MAX_VALUE).addComponent(jLabel1).addGap(135, 135, 135)).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()).addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel4Layout.createSequentialGroup().addComponent(btnRegresar).addGap(175, 175, 175).addComponent(btnGuardar).addGap(0, 0, Short.MAX_VALUE)))));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnRegresar).addComponent(btnGuardar)).addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(22, Short.MAX_VALUE).addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));

        pack();
        setLocationRelativeTo(null);
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        sintomas = txaSintomas.getText();
        diagnostico = txaDiagnostico.getText();
        prescripcion = txaPrescripcion.getText();
        consultorio1.atender(cedulaUsar, sintomas, diagnostico, prescripcion);
        txaSintomas.setText("");
        txaDiagnostico.setText("");
        txaPrescripcion.setText("");
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
            java.util.logging.Logger.getLogger(RegistroClinicoGUI.class.getName()).log(java.util.logging.Level.SEVERE
                    , null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroClinicoGUI(consultorio1, cedulaUsar).setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txaDiagnostico;
    private javax.swing.JTextArea txaPrescripcion;
    private javax.swing.JTextArea txaSintomas;
}
