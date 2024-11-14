package Controlador;
import  Vista.*;

public class Sistema_Barberia extends javax.swing.JFrame {

        private NewJInternalProductos Producto;
         private NewJInternalEmpleados Empleados;
        private JInternalFrameCliente Clientes;
         private JInternalFrameVentas Ventas;
            
    public Sistema_Barberia() {
        initComponents();
        setTitle("KING OF KING");
        
        
        Producto=new NewJInternalProductos();
         desktopPane.add( Producto);
         
          Empleados=new NewJInternalEmpleados();
         desktopPane.add( Empleados);
         
          Clientes=new JInternalFrameCliente();
         desktopPane.add( Clientes);    
         
           Ventas=new JInternalFrameVentas();
         desktopPane.add( Ventas);  
    }

    
    
 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        VerProductosMenuItem = new javax.swing.JMenuItem();
        fileMenu1 = new javax.swing.JMenu();
        VerEmpleadosMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jMenuVerClientes = new javax.swing.JMenuItem();
        jMenuVentas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaptionBorder);

        desktopPane.setBackground(new java.awt.Color(0, 153, 153));
        desktopPane.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        fileMenu.setMnemonic('f');
        fileMenu.setText("Productos");

        VerProductosMenuItem.setMnemonic('o');
        VerProductosMenuItem.setText("Ver Productos");
        VerProductosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerProductosMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(VerProductosMenuItem);

        menuBar.add(fileMenu);

        fileMenu1.setMnemonic('f');
        fileMenu1.setText("Empleados");

        VerEmpleadosMenuItem.setMnemonic('o');
        VerEmpleadosMenuItem.setText("Ver Empleados");
        VerEmpleadosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEmpleadosMenuItemActionPerformed(evt);
            }
        });
        fileMenu1.add(VerEmpleadosMenuItem);
        fileMenu1.add(jSeparator1);

        menuBar.add(fileMenu1);

        jMenu1.setText("Clientes");

        jMenuVerClientes.setText("Ver Clientes");
        jMenuVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVerClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuVerClientes);

        menuBar.add(jMenu1);

        jMenuVentas.setText("Ventas");

        jMenuItem2.setText("Ver Ventas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuVentas.add(jMenuItem2);

        menuBar.add(jMenuVentas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerProductosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerProductosMenuItemActionPerformed
         Producto.obtenerDatos();
          Producto.setVisible(true);
          
    }//GEN-LAST:event_VerProductosMenuItemActionPerformed

    private void VerEmpleadosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEmpleadosMenuItemActionPerformed
      Empleados.obtenerDatos();
           Empleados.setVisible(true);
    }//GEN-LAST:event_VerEmpleadosMenuItemActionPerformed

    private void jMenuVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVerClientesActionPerformed
        Clientes.obtenerDatos();
           Clientes.setVisible(true);
    }//GEN-LAST:event_jMenuVerClientesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      Ventas.obtenerDatos();
           Ventas.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    
    
    
    
    
    
    
    
    
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
    private javax.swing.JMenuItem VerEmpleadosMenuItem;
    private javax.swing.JMenuItem VerProductosMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuVentas;
    private javax.swing.JMenuItem jMenuVerClientes;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
