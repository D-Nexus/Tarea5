/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.AlumnoController;
/**
 *
 * @author sebas
 */
public class agregarNotas extends javax.swing.JFrame {

    /**
     * Creates new form agregarNotas
     */
    public agregarNotas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tareaNota4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tareaNota1 = new javax.swing.JTextField();
        tareaNota2 = new javax.swing.JTextField();
        tareaNota3 = new javax.swing.JTextField();
        tareaNota5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        trabajoNota1 = new javax.swing.JTextField();
        trabajoNota2 = new javax.swing.JTextField();
        trabajoNota3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        certamenNota1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        rutAlumno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tareaNota4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel1.setText("Ingresar notas tareas");

        tareaNota1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tareaNota1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tareaNota2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tareaNota3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tareaNota5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Nota 1");

        jLabel3.setText("Nota 2");

        jLabel4.setText("Nota 3");

        jLabel5.setText("Nota 4");

        jLabel6.setText("Nota 5");

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel7.setText("Ingresar notas trabajos");

        jLabel8.setText("Nota 1");

        jLabel9.setText("Nota 2");

        jLabel10.setText("Nota 3");

        trabajoNota1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        trabajoNota2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        trabajoNota3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel11.setText("Ingresar nota certamen");

        certamenNota1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setText("Nota 1");

        btnAgregar.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel13.setText("Rut alumno");

        Error.setText("Aviso:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(trabajoNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(trabajoNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(trabajoNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(8, 8, 8)))
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(tareaNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(tareaNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tareaNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tareaNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tareaNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(certamenNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(rutAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tareaNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tareaNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tareaNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tareaNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tareaNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trabajoNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trabajoNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trabajoNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(certamenNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Error)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Verificamos campos vacios
        if(tareaNota1.getText().isEmpty() || tareaNota2.getText().isEmpty() || tareaNota3.getText().isEmpty() || tareaNota4.getText().isEmpty() || tareaNota5.getText().isEmpty()){
            Error.setText("Aviso: Completar campos vacios");
        }
        else if(trabajoNota1.getText().isEmpty() || trabajoNota2.getText().isEmpty() || trabajoNota3.getText().isEmpty()){
            Error.setText("Aviso: Completar campos vacios");
        }
        else if(certamenNota1.getText().isEmpty()){
            Error.setText("Aviso: Completar campos vacios");
        }
        else{ 
            agregarNotas();
            
            //vacias campos
            Error.setText("Aviso:");
            tareaNota1.setText("");
            tareaNota2.setText("");
            tareaNota3.setText("");
            tareaNota4.setText("");
            tareaNota5.setText("");
            trabajoNota1.setText("");
            trabajoNota2.setText("");
            trabajoNota3.setText("");
            certamenNota1.setText("");
            rutAlumno.setText("");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void agregarNotas(){
        AlumnoController aController = new AlumnoController();   
        //Enviamos las notas al controlador
        //Notas tareas
        aController.agregarNotasTareas(Integer.parseInt(rutAlumno.getText()),
                Double.valueOf(tareaNota1.getText()),
                Double.valueOf(tareaNota2.getText()),
                Double.valueOf(tareaNota3.getText()),
                Double.valueOf(tareaNota4.getText()),
                Double.valueOf(tareaNota5.getText())
        );
        //Notas trabajos
        aController.agregarNotasTrabajo(Integer.parseInt(rutAlumno.getText()),
                Double.valueOf(trabajoNota1.getText()),
                Double.valueOf(trabajoNota2.getText()),
                Double.valueOf(trabajoNota3.getText())
        );
        //Nota certamen
        aController.agregarNotaCertamen(Integer.parseInt(rutAlumno.getText()),Double.valueOf(certamenNota1.getText()));
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Error;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JTextField certamenNota1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField rutAlumno;
    private javax.swing.JTextField tareaNota1;
    private javax.swing.JTextField tareaNota2;
    private javax.swing.JTextField tareaNota3;
    private javax.swing.JTextField tareaNota4;
    private javax.swing.JTextField tareaNota5;
    private javax.swing.JTextField trabajoNota1;
    private javax.swing.JTextField trabajoNota2;
    private javax.swing.JTextField trabajoNota3;
    // End of variables declaration//GEN-END:variables
}
