/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.control_banano_controller;
import controlador.exportacion;
import controlador.reporte_camion_controller;
import controlador.reporte_caja_controller;
import controlador.reporte_destino_controller;
/**
 *
 * @author ANDRES COELLO
 */
public class control_banano extends javax.swing.JFrame {
    exportacion obj;
    /**
     * Creates new form control_banano
     */
    public control_banano() {
        obj = new exportacion(0,"","",0,"");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        antes = new javax.swing.JTextField();
        despues = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        caja = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        puertos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 252, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/v.jpg"))); // NOI18N

        antes.setBackground(new java.awt.Color(51, 51, 51));
        antes.setForeground(new java.awt.Color(255, 255, 255));
        antes.setText("0000");

        despues.setEditable(false);
        despues.setBackground(new java.awt.Color(51, 51, 51));
        despues.setForeground(new java.awt.Color(255, 255, 255));
        despues.setText("0");

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Nuevo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/caj.png"))); // NOI18N

        caja.setBackground(new java.awt.Color(51, 51, 51));
        caja.setForeground(new java.awt.Color(255, 255, 255));
        caja.setText("0000");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Peso caja en LB");

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cerrar Session");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/des.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Destino Producto");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Peso  de carga vehicular");

        puertos.setBackground(new java.awt.Color(51, 51, 51));
        puertos.setForeground(new java.awt.Color(255, 255, 255));
        puertos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puertos", "Mritimo Guayaquil", "Bolivar APPB", "Esmeraldas APE", "Talcahuano Chile", "San Antonio Chile", "Santiago Chile", "Iquique Chile" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Vacio");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cargado");

        matricula.setBackground(new java.awt.Color(51, 51, 51));
        matricula.setForeground(new java.awt.Color(255, 255, 255));
        matricula.setText("Matricula Vehiculo");

        cantidad.setBackground(new java.awt.Color(51, 51, 51));
        cantidad.setForeground(new java.awt.Color(255, 255, 255));
        cantidad.setText("0000");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Cantidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(antes, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel8)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(despues, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel9))))
                                    .addComponent(jLabel7)
                                    .addComponent(matricula)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cantidad))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(puertos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(antes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(despues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(puertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/1.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/2.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/3.jpg"))); // NOI18N
        jButton3.setText(" ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Reportes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 0, 130, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reporte_destino vent = new reporte_destino();
        vent.setLocationRelativeTo(null);
        reporte_destino_controller control = new reporte_destino_controller(vent);
        control.IniciarVista();
        vent.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if("0000".equals(this.antes.getText()) || "0".equals(this.despues.getText()) || "0000".equals(this.caja.getText())){
            this.antes.enable();
            this.despues.enable();
            this.caja.enable();
            this.puertos.enable();
            this.matricula.enable();
            this.cantidad.enable();
        }else{
            this.antes.setText("0000");
            this.despues.setText("0");
            this.caja.setText("0000");
            this.cantidad.setText("0000");
            this.matricula.setText("Matricula Vehiculo");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        login vent = new login();
        vent.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int vacio = Integer.parseInt(antes.getText());
        int cant = Integer.parseInt(cantidad.getText());
        String matricula_vehiculo = matricula.getText();
        int libra_caja = Integer.parseInt(caja.getText());
        String destino = (String) puertos.getSelectedItem();
        String obtener_calculo = obj.calculo(vacio,libra_caja, cant);
        this.despues.setText(obtener_calculo);
        obj.archivos(obtener_calculo, matricula_vehiculo);
        obj.archivos_destino(cant, destino);
        //double carga = Double.parseDouble(despues.getText());
        
        control_banano_controller vent = new control_banano_controller(vacio,obtener_calculo ,matricula_vehiculo ,libra_caja,destino);
        exportacion vent_2 = new exportacion(vacio, obtener_calculo ,matricula_vehiculo ,libra_caja,destino);
        vent_2.mensaje();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reporte_camion vent = new reporte_camion();
        vent.setLocationRelativeTo(null);
        reporte_camion_controller control = new reporte_camion_controller(vent);
        control.IniciarVista();
        vent.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reporte_caja vent = new reporte_caja();
        vent.setLocationRelativeTo(null);
        reporte_caja_controller control = new reporte_caja_controller(vent);
        control.IniciarVista();
        vent.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(control_banano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(control_banano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(control_banano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(control_banano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new control_banano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField antes;
    public javax.swing.JTextField caja;
    public javax.swing.JTextField cantidad;
    public javax.swing.JTextField despues;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField matricula;
    public javax.swing.JComboBox<String> puertos;
    // End of variables declaration//GEN-END:variables
}