package Vista;

import Modelo.*;
import java.util.*;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class JInternalFrameVentas extends javax.swing.JInternalFrame {

    public JInternalFrameVentas() {
        initComponents();
        jTextIdVenta1.setEnabled(false);//deshabilitar campo de idventa
    }

    public void LimpiarCampos() {
        jTextIdBuscarVentas.setText("");
        jTextidCliente.setText("");
        jTextidEmpleado.setText("");
        jTextMetodoPago.setText("");
        jTextfechaVenta.setText("");
    }

    //Método para listar datos dentro de la tabla
    public void obtenerDatos() {
        //Se crea una lista que almacena los datos obtenidos
        List<Ventas> Ventas = new DAOVentas().ObtenerDatos();
        //Define un modelo para la tabla    
        DefaultTableModel modelo = new DefaultTableModel();
        //Arreglo con nombre de columnas de la tabla
        String[] columnas = {"id_venta", "id_cliente", "id_empleado",
            "metodopagoV", "fecha_venta"};
        //Establece los nombres definidos de las columnas
        modelo.setColumnIdentifiers(columnas);
        for (Ventas ven : Ventas) { //Recorre cada elemento de la lista y los agrega 
            //al modelo de la tabla
            String[] renglon = {
                Integer.toString(ven.getId_venta()),
                Integer.toString(ven.getId_cliente()),
                Integer.toString(ven.getId_empleado()),
                ven.getMetodopagoV(),
                ven.getFecha_venta().toString()};
            modelo.addRow(renglon);
        }
        jTableVentas.setModel(modelo);
    }

    public void Actualizar() {
        int id = Integer.parseInt(this.jTextIdBuscarVentas.getText());
        int cli = Integer.parseInt(this.jTextidCliente.getText());
        int emp = Integer.parseInt(this.jTextidEmpleado.getText());

        String pago = this.jTextMetodoPago.getText();
        Date fech = Date.valueOf(this.jTextfechaVenta.getText());

        DAOVentas dao = new DAOVentas();
        int res = dao.Actualizar(id, cli, emp, pago, fech.toString());
        //fech.toString para pasar la fecha en formato String
        if (res == 1) {
            JOptionPane.showMessageDialog(rootPane, "¡Venta Actualizada!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "¡Ocurrió un ERROR!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextidCliente = new javax.swing.JTextField();
        jTextidEmpleado = new javax.swing.JTextField();
        jTextMetodoPago = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextfechaVenta = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jTextIdVenta1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        jTextIdBuscarVentas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBottonBorrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(40, 86, 115));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar venta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Venta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" ID Empleado");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Metodo Pago");

        jTextidCliente.setBackground(new java.awt.Color(209, 238, 234));
        jTextidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidClienteActionPerformed(evt);
            }
        });

        jTextidEmpleado.setBackground(new java.awt.Color(209, 238, 234));
        jTextidEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidEmpleadoActionPerformed(evt);
            }
        });

        jTextMetodoPago.setBackground(new java.awt.Color(209, 238, 234));
        jTextMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMetodoPagoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha venta");

        jTextfechaVenta.setBackground(new java.awt.Color(209, 238, 234));

        jBAgregar.setBackground(new java.awt.Color(58, 114, 142));
        jBAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_11880129 (1).png"))); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBEditar.setBackground(new java.awt.Color(58, 114, 142));
        jBEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBEditar.setForeground(new java.awt.Color(255, 255, 255));
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_4226577 (1).png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBActualizar.setBackground(new java.awt.Color(58, 114, 142));
        jBActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reload-arrow_15775840.png"))); // NOI18N
        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBBorrar.setBackground(new java.awt.Color(58, 114, 142));
        jBBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBBorrar.setForeground(new java.awt.Color(255, 255, 255));
        jBBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_11712812.png"))); // NOI18N
        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jTextIdVenta1.setBackground(new java.awt.Color(209, 238, 234));
        jTextIdVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdVenta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregar))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextfechaVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jTextMetodoPago, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextidEmpleado, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jTextIdVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBorrar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jBEditar)
                        .addGap(26, 26, 26)
                        .addComponent(jBActualizar)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextidEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextfechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jBEditar)
                    .addComponent(jBActualizar))
                .addGap(42, 42, 42)
                .addComponent(jBBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(40, 86, 115));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Ventas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jTableVentas.setBackground(new java.awt.Color(209, 238, 234));
        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTableVentas);

        jTextIdBuscarVentas.setBackground(new java.awt.Color(209, 238, 234));
        jTextIdBuscarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdBuscarVentasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar Por ID");

        jBottonBorrar.setBackground(new java.awt.Color(58, 114, 142));
        jBottonBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBottonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        jBottonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifying-glass_762591 (1).png"))); // NOI18N
        jBottonBorrar.setText("Buscar");
        jBottonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBottonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTextIdBuscarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBottonBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdBuscarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jBottonBorrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidClienteActionPerformed

    private void jTextidEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidEmpleadoActionPerformed

    private void jTextIdBuscarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdBuscarVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdBuscarVentasActionPerformed

    private void jTextMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMetodoPagoActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
// Captura datos de la cajas de texto
        String cli = jTextidCliente.getText();
        String emp = jTextidEmpleado.getText();
        String pago = jTextMetodoPago.getText();
        String fech = jTextfechaVenta.getText();

        //Comprueba que las cajas de texto no esten vacías
        if (cli.contentEquals("") || emp.contentEquals("")
                || pago.contentEquals("") || fech.contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "Todos los campos son obligatorios");
        } else {
            try {
                int c = Integer.parseInt(cli);
                int em = Integer.parseInt(emp);
                java.sql.Date fe = java.sql.Date.valueOf(fech);
                //objeto para acceder al método Insertar de DAOVenta
                Ventas ven = new DAOVentas().Insertar(c, em, pago, fe);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agregó el registro");
            }
        }
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int filas = this.jTableVentas.getSelectedRow();

        if (filas == -1) {
            JOptionPane.showConfirmDialog(rootPane, "Seleccione un Dato de la Tabla");
        } else {
            try {
                int id = Integer.parseInt((String) this.jTableVentas.getValueAt(filas, 0).toString());
                String nom = (String) this.jTableVentas.getValueAt(filas, 1);
                String des = (String) this.jTableVentas.getValueAt(filas, 2);
                String prec = (String) this.jTableVentas.getValueAt(filas, 3);

                jTextIdBuscarVentas.setText("" + id);
                jTextidCliente.setText(nom);
                jTextidEmpleado.setText(des);
                jTextMetodoPago.setText(prec);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        Actualizar();
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        int fila = this.jTableVentas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        } else {
            int id = Integer.parseInt((String) this.jTableVentas.getValueAt(fila, 0).toString());
            DAOVentas dao = new DAOVentas();
            dao.Eliminar(id);
            obtenerDatos();
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jTextIdVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdVenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdVenta1ActionPerformed

    private void jBottonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBottonBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBottonBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBottonBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVentas;
    private javax.swing.JTextField jTextIdBuscarVentas;
    private javax.swing.JTextField jTextIdVenta1;
    private javax.swing.JTextField jTextMetodoPago;
    private javax.swing.JTextField jTextfechaVenta;
    private javax.swing.JTextField jTextidCliente;
    private javax.swing.JTextField jTextidEmpleado;
    // End of variables declaration//GEN-END:variables
}
