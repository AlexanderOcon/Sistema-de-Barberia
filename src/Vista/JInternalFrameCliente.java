package Vista;

import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class JInternalFrameCliente extends javax.swing.JInternalFrame {

    //deshabilitar campo de IdAutor
    public JInternalFrameCliente() {
        initComponents();
        jTextFieldId.setEnabled(false);
    }

    public void LimpiarCampos() {
        jTextFieldId.setText("");
        jTextFieldNombre.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldApellidos.setText("");
        jTextBuscarCliente.setText("");
    }

    public void obtenerDatos() {
        //Se crea una lista que almacena los datos obtenidos
        List<Cliente> Cliente = new DAOCliente().ObtenerDatos();
        //Define un modelo para la tabla    
        DefaultTableModel modelo = new DefaultTableModel();
        //Arreglo con nombre de columnas de la tabla
        String[] columnas = {"id_ciente", "nombre", "apellido",
            "telefono"};
        //Establece los nombres definidos de las columnas
        modelo.setColumnIdentifiers(columnas);
        for (Cliente au : Cliente) { //Recorre cada elemento de la lista y los agrega 
            //al modelo de la tabla
            String[] renglon = {Integer.toString(au.getId_cliente()), au.getNombre(),
                au.getApellido(), au.getTelefono()};
            modelo.addRow(renglon);
            jTableCliente.setModel(modelo);
            // Ubica los datos del modelo en la tabla
        }
    }

    public void actualizarCliente() {

        int id = Integer.parseInt(this.jTextFieldId.getText());
        String nom = this.jTextFieldNombre.getText();
        String ape = this.jTextFieldApellidos.getText();
        String tele = this.jTextFieldTelefono.getText();
        DAOCliente dao = new DAOCliente();
        int res = dao.Actualizar(id, nom, ape, tele);
        if (res == 1) {
            JOptionPane.showMessageDialog(rootPane, "Cliente actualizado");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ocurrio un Error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonLimpiar = new javax.swing.JButton();
        jTextBuscarCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos");

        jTextFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telefono");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ID");

        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jLabel5))
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldApellidos)
                            .addComponent(jTextFieldTelefono)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEditar)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBorrar))
                            .addComponent(jTextBuscarCliente))))
                .addGap(17, 30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonBorrar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jTextBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableCliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidosActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // Captura datos de la cajas de texto
        String nomb = jTextFieldNombre.getText();
        String ape = jTextFieldApellidos.getText();
        String tele = jTextFieldTelefono.getText();
        if (nomb.contentEquals("") || ape.contentEquals("") || tele.contentEquals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Llenar Todos los Campos");
        } else {
            try {
                //objeto para acceder al método Insertar de DAOAutor
                Cliente au = new DAOCliente().Insertar(nomb, ape, tele);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agregó el registro");
            }
        }
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        int fila = this.jTableCliente.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "seleccionar un registro de la tabla");
        } else {
            try {
                int id = Integer.parseInt((String) this.jTableCliente.getValueAt(fila, 0).toString());
                String nom = (String) this.jTableCliente.getValueAt(fila, 1);
                String ape = (String) this.jTableCliente.getValueAt(fila, 2);
                String tele = (String) this.jTableCliente.getValueAt(fila, 3);

                jTextFieldId.setText("" + id);
                jTextFieldNombre.setText(nom);
                jTextFieldApellidos.setText(ape);
                jTextFieldTelefono.setText(tele);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // Obtiene el texto ingresado en el campo de búsqueda
        String terminoBusqueda = jTextBuscarCliente.getText().trim();

        // Valida que el campo de búsqueda no esté vacío
        if (terminoBusqueda.isEmpty()) {
            // Muestra un mensaje al usuario si el campo está vacío
            JOptionPane.showMessageDialog(rootPane, "Ingrese un término para buscar.");
            return; // Finaliza el método si no se ha ingresado un término
        }

        try {
            // Llama al método BuscarCliente en DAOCliente para obtener la lista de clientes que coinciden con el término de búsqueda
            List<Cliente> clientes = new DAOCliente().BuscarCliente(terminoBusqueda);

            // Valida si hay resultados en la lista de clientes
            if (clientes.isEmpty()) {
                // Informa al usuario que no se encontraron clientes con el término de búsqueda
                JOptionPane.showMessageDialog(rootPane, "No se encontraron clientes con el término: " + terminoBusqueda);
                return; // Finaliza el método si no se encuentran coincidencias
            }

            // Crea un modelo para la tabla con las columnas especificadas
            DefaultTableModel modelo = new DefaultTableModel();
            String[] columnas = {"id_cliente", "nombre", "apellido", "telefono"};
            modelo.setColumnIdentifiers(columnas); // Configura los nombres de las columnas en el modelo

            // Itera sobre los clientes encontrados y los agrega como filas al modelo
            for (Cliente clie : clientes) {
                String[] renglon = {
                    Integer.toString(clie.getId_cliente()), // Convierte el ID del cliente a String
                    clie.getNombre(), // Obtiene el nombre del cliente
                    clie.getApellido(), // Obtiene el apellido del cliente
                    clie.getTelefono() // Obtiene el teléfono del cliente
                };
                modelo.addRow(renglon); // Agrega la fila al modelo
            }

            // Actualiza la tabla con el modelo que contiene los datos de los clientes encontrados
            jTableCliente.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace(); // Muestra detalles del error en la consola
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al realizar la búsqueda."); // Notifica al usuario sobre el error
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        actualizarCliente();
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed

        // TODO add your handling code here:
        int fila = this.jTableCliente.getSelectedRow();
        if (fila == 1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        } else {
            int id = Integer.parseInt((String) this.jTableCliente.getValueAt(fila, 0).toString());
            DAOCliente dao = new DAOCliente();
            dao.Eliminar(id);
            obtenerDatos();
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextBuscarCliente;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
