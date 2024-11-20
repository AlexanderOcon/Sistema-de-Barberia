package Controlador;

import Vista.*;

public class Sistema_Barberia extends javax.swing.JFrame {
    
private NewJInternalProductos Producto;
    private NewJInternalEmpleados Empleados;
    private JInternalFrameCliente Clientes;
    private JInternalFrameVentas Ventas;
    private JInternalFrameProveedores Proveedores;

    public Sistema_Barberia() {
        initComponents();
        setTitle("KING OF KING");
        this.setExtendedState(Sistema_Barberia.MAXIMIZED_BOTH);

        Producto = new NewJInternalProductos();
        desktopPane.add(Producto);

        Empleados = new NewJInternalEmpleados();
        desktopPane.add(Empleados);

        Clientes = new JInternalFrameCliente();
        desktopPane.add(Clientes);

        Ventas = new JInternalFrameVentas();
        desktopPane.add(Ventas);

        Proveedores = new JInternalFrameProveedores();
        desktopPane.add(Proveedores);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jButtonProductos = new javax.swing.JButton();
        jButtonEmpleados = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jButtonVentas = new javax.swing.JButton();
        jButtonProveedores = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaptionBorder);

        desktopPane.setBackground(new java.awt.Color(40, 86, 115));
        desktopPane.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BARBERIA KING OF KING");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(470, 40, 320, 32);

        jButtonProductos.setBackground(new java.awt.Color(58, 114, 142));
        jButtonProductos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonProductos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hygiene-product_17205369 (1).png"))); // NOI18N
        jButtonProductos.setText("Productos");
        jButtonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonProductos);
        jButtonProductos.setBounds(100, 100, 220, 40);

        jButtonEmpleados.setBackground(new java.awt.Color(58, 114, 142));
        jButtonEmpleados.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user (1).png"))); // NOI18N
        jButtonEmpleados.setText("Empleados");
        jButtonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadosActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonEmpleados);
        jButtonEmpleados.setBounds(100, 180, 220, 40);

        jButtonClientes.setBackground(new java.awt.Color(58, 114, 142));
        jButtonClientes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rating_3201521 (1).png"))); // NOI18N
        jButtonClientes.setText("Clientes");
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonClientes);
        jButtonClientes.setBounds(100, 270, 220, 40);

        jButtonVentas.setBackground(new java.awt.Color(58, 114, 142));
        jButtonVentas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonVentas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shopping-bag_743007 (2).png"))); // NOI18N
        jButtonVentas.setText("Ventas");
        jButtonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentasActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonVentas);
        jButtonVentas.setBounds(100, 360, 220, 40);

        jButtonProveedores.setBackground(new java.awt.Color(58, 114, 142));
        jButtonProveedores.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonProveedores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/packing_3519189 (1).png"))); // NOI18N
        jButtonProveedores.setText("Proveedores");
        jButtonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProveedoresActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonProveedores);
        jButtonProveedores.setBounds(100, 440, 220, 50);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProveedoresActionPerformed
        // TODO add your handling code here:
        Proveedores.obtenerDatos();
        Proveedores.setVisible(true);

    }//GEN-LAST:event_jButtonProveedoresActionPerformed

    private void jButtonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentasActionPerformed
        // TODO add your handling code here:
        Ventas.obtenerDatos();
        Ventas.setVisible(true);

    }//GEN-LAST:event_jButtonVentasActionPerformed

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        // TODO add your handling code here:

        Clientes.obtenerDatos();
        Clientes.setVisible(true);
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jButtonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadosActionPerformed
        // TODO add your handling code here:
        Empleados.obtenerDatos();
        Empleados.setVisible(true);

    }//GEN-LAST:event_jButtonEmpleadosActionPerformed

    private void jButtonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductosActionPerformed
        // TODO add your handling code here:
        Producto.obtenerDatos();
        Producto.setVisible(true);
    }//GEN-LAST:event_jButtonProductosActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema_Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema_Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema_Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema_Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema_Barberia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonEmpleados;
    private javax.swing.JButton jButtonProductos;
    private javax.swing.JButton jButtonProveedores;
    private javax.swing.JButton jButtonVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
