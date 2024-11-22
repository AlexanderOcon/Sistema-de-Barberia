package Vista;

import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class JInternalFrameProveedores extends javax.swing.JInternalFrame {

    // Constructor de la clase
    public JInternalFrameProveedores() {
        initComponents(); // Inicializa los componentes de la interfaz
        jTextId_Proveedor.setEnabled(false); // Deshabilita el campo de texto para el ID del proveedor
    }

    // Método para limpiar los campos de texto en la interfaz
    public void LimpiarCampos() {
        jTextId_Proveedor.setText(""); // Limpia el campo del ID del proveedor
        jTextNombre.setText(""); // Limpia el campo del nombre
        jTextApellido.setText(""); // Limpia el campo del apellido
        jTextEmail.setText(""); // Limpia el campo del email
        jTextTelefono.setText(""); // Limpia el campo del teléfono
        jTextUrl.setText(""); // Limpia el campo de la URL
    }

    // Método para obtener los datos de los proveedores desde la base de datos
    public void obtenerDatos() {
        try {
            // Obtiene una lista de proveedores desde la base de datos
            List<Proveedores> proveedores = new DAOProveedores().ObtenerDatos();
            DefaultTableModel modelo = new DefaultTableModel();

            // Define las columnas de la tabla
            String[] columnas = {"id_proveedor", "Nombre", "Apellido", "Email", "Telefono", "Url"};
            modelo.setColumnIdentifiers(columnas);

            // Llena la tabla con los datos obtenidos
            for (Proveedores prove : proveedores) {
                String[] renglon = {
                    Integer.toString(prove.getId_proveedor()), // Convierte el ID del proveedor a String
                    prove.getNombre(), // Obtiene el nombre del proveedor
                    prove.getApellido(), // Obtiene el apellido del proveedor
                    prove.getEmail(), // Obtiene el email del proveedor
                    prove.getTelefono(), // Obtiene el teléfono del proveedor
                    prove.getUrl() // Obtiene la URL del proveedor
                };
                modelo.addRow(renglon); // Agrega una fila al modelo de la tabla
            }
            jTableProveedores.setModel(modelo); // Actualiza la tabla en la interfaz

        } catch (Exception e) {
            e.printStackTrace(); // Imprime el error en la consola
            JOptionPane.showMessageDialog(rootPane, "Error al obtener los datos de proveedor."); // Muestra un mensaje de error
        }
    }

    // Método para actualizar la información de un proveedor
    public void actualizarProveedor() {
        // Obtiene los datos ingresados en la interfaz
        int id = Integer.parseInt(this.jTextId_Proveedor.getText()); // Obtiene el ID del proveedor
        String nomb = this.jTextNombre.getText(); // Obtiene el nombre del proveedor
        String apell = this.jTextApellido.getText(); // Obtiene el apellido del proveedor
        String email = this.jTextEmail.getText(); // Obtiene el email del proveedor
        String tel = this.jTextTelefono.getText(); // Obtiene el teléfono del proveedor
        String url = this.jTextUrl.getText(); // Obtiene la URL del proveedor

        // Crea una instancia de DAOProveedores para realizar la actualización
        DAOProveedores dao = new DAOProveedores();
        int res = dao.Actualizar(id, nomb, apell, email, tel, url); // Llama al método para actualizar en la base de datos

        // Muestra un mensaje dependiendo del resultado de la operación
        if (res == 1) {
            JOptionPane.showMessageDialog(rootPane, "Proveedor Actualizado!"); // Actualización exitosa
        } else {
            JOptionPane.showMessageDialog(rootPane, "¡Ocurrió un ERROR!"); // Error en la actualización
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextId_Proveedor = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextUrl = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(40, 86, 115));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Proveedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID_Proveedor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Url");

        jTextId_Proveedor.setBackground(new java.awt.Color(209, 238, 234));

        jTextNombre.setBackground(new java.awt.Color(209, 238, 234));

        jTextApellido.setBackground(new java.awt.Color(209, 238, 234));

        jTextEmail.setBackground(new java.awt.Color(209, 238, 234));
        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jTextTelefono.setBackground(new java.awt.Color(209, 238, 234));

        jTextUrl.setBackground(new java.awt.Color(209, 238, 234));

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

        jButtonLimpiar.setBackground(new java.awt.Color(58, 114, 142));
        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clean_419660.png"))); // NOI18N
        jButtonLimpiar.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextId_Proveedor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButtonLimpiar)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButtonAgregar)
                .addGap(39, 39, 39)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButtonActualizar)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextId_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonAgregar))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(40, 86, 115));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jTableProveedores.setBackground(new java.awt.Color(209, 238, 234));
        jTableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTableProveedores.setMinimumSize(new java.awt.Dimension(60, 80));
        jScrollPane1.setViewportView(jTableProveedores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // Captura datos de la cajas de texto
        String nomb = jTextNombre.getText();
        String apell = jTextApellido.getText();
        String ema = jTextEmail.getText();
        String tele = jTextTelefono.getText();
        String url = this.jTextUrl.getText();

        //Comprueba que las cajas de texto no esten vacías
        if (nomb.contentEquals("") || apell.contentEquals("") || ema.contentEquals("")
                || tele.contentEquals("") || url.contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "Todos los campos son obligatorios");
        } else {
            try {

                //objeto para acceder al método Insertar de DAOProveedores
                Proveedores prove = new DAOProveedores().Insertar(nomb, apell, ema, tele, url);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agregó el registro");
            }
        }
        obtenerDatos();//1lama a este método para que se muestre el nuevo
        //registro en la tabla del formulario
        LimpiarCampos();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        actualizarProveedor();// Llama al método para actualizar la información de un proveedor
        obtenerDatos();// Llama al método para obtener los datos actualizados de los proveedores y mostrarlos en la tabla
        LimpiarCampos(); // Llama al método para limpiar los campos de texto en la interfaz
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // Obtiene la fila seleccionada en la tabla de proveedores
        int fila = this.jTableProveedores.getSelectedRow();

        // Verifica si no se ha seleccionado ninguna fila
        if (fila == -1) {
            // Muestra un mensaje al usuario indicando que debe seleccionar un registro
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        } else {
            // Obtiene el ID del proveedor desde la tabla, convirtiéndolo a entero
            int id = Integer.parseInt((String) this.jTableProveedores.getValueAt(fila, 0).toString());

            // Crea una instancia de DAOProveedores y elimina el proveedor con el ID obtenido
            DAOProveedores dao = new DAOProveedores();
            dao.Eliminar(id);

            // Llama al método para actualizar los datos mostrados en la tabla
            obtenerDatos();
        }

    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
// Obtiene la fila seleccionada en la tabla de proveedores
        int fila = this.jTableProveedores.getSelectedRow();

// Verifica si no se ha seleccionado ninguna fila
        if (fila == -1) {
            // Muestra un mensaje al usuario indicando que debe seleccionar un registro
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        } else {
            // Si hay una fila seleccionada, se obtienen los datos de la misma
            try {
                // Captura el ID del proveedor seleccionado y lo convierte a entero
                int id = Integer.parseInt((String) this.jTableProveedores.getValueAt(fila, 0).toString());
                // Captura el resto de los datos del proveedor seleccionado
                String nomb = (String) this.jTableProveedores.getValueAt(fila, 1); // Nombre
                String apell = (String) this.jTableProveedores.getValueAt(fila, 2); // Apellido
                String ema = (String) this.jTableProveedores.getValueAt(fila, 3); // Email
                String tele = (String) this.jTableProveedores.getValueAt(fila, 4); // Teléfono
                String url = (String) this.jTableProveedores.getValueAt(fila, 5); // URL

                // Muestra los datos obtenidos en los campos de texto para que puedan ser editados
                jTextId_Proveedor.setText("" + id); // Muestra el ID en el campo correspondiente
                jTextNombre.setText(nomb); // Muestra el nombre
                jTextApellido.setText(apell); // Muestra el apellido
                jTextEmail.setText(ema); // Muestra el email
                jTextTelefono.setText(tele); // Muestra el teléfono
                jTextUrl.setText(url); // Muestra la URL

            } catch (NumberFormatException e) {
                // Maneja cualquier excepción al convertir el ID a entero
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProveedores;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextId_Proveedor;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JTextField jTextUrl;
    // End of variables declaration//GEN-END:variables
}
