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
        jButtonActualizar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jTextBuscarCliente = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscar1 = new javax.swing.JButton();

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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 86, 115));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(431, 367));

        jTextFieldId.setBackground(new java.awt.Color(209, 238, 234));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jTextFieldTelefono.setBackground(new java.awt.Color(209, 238, 234));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos");

        jTextFieldApellidos.setBackground(new java.awt.Color(209, 238, 234));
        jTextFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");

        jTextFieldNombre.setBackground(new java.awt.Color(209, 238, 234));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jButtonAgregar.setBackground(new java.awt.Color(58, 114, 142));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_11880129 (1).png"))); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(58, 114, 142));
        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_4226577 (1).png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(58, 114, 142));
        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reload-arrow_15775840.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonBorrar.setBackground(new java.awt.Color(58, 114, 142));
        jButtonBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_11712812.png"))); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Cliente");

        jButtonLimpiar.setBackground(new java.awt.Color(58, 114, 142));
        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clean_419660.png"))); // NOI18N
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42)
                        .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addGap(43, 43, 43)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButtonAgregar)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonEditar)
                        .addGap(59, 59, 59)
                        .addComponent(jButtonActualizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButtonLimpiar)
                        .addGap(65, 65, 65)
                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEditar)
                        .addComponent(jButtonAgregar))
                    .addComponent(jButtonActualizar))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonLimpiar)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 470));

        jPanel1.setBackground(new java.awt.Color(40, 86, 115));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(431, 367));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCliente.setBackground(new java.awt.Color(209, 238, 234));
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
        jTableCliente.setMaximumSize(new java.awt.Dimension(2147483647, 100));
        jScrollPane2.setViewportView(jTableCliente);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 69, -1, 390));

        jTextBuscarCliente.setBackground(new java.awt.Color(209, 238, 234));
        jPanel1.add(jTextBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 200, -1));

        jButtonBuscar.setBackground(new java.awt.Color(132, 195, 200));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 0, 125, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Por Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jButtonBuscar1.setBackground(new java.awt.Color(58, 114, 142));
        jButtonBuscar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifying-glass_762591 (1).png"))); // NOI18N
        jButtonBuscar1.setText("Buscar");
        jButtonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 510, 470));

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
            JOptionPane.showMessageDialog(rootPane, "Llenar Todos los Campos");
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
       
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        actualizarCliente();
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed

        int fila = this.jTableCliente.getSelectedRow();
        if (fila == -1) {
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

    private void jButtonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscar1ActionPerformed
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
        
    }//GEN-LAST:event_jButtonBuscar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscar1;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
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
