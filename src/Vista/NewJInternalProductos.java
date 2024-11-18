package Vista;

import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class NewJInternalProductos extends javax.swing.JInternalFrame {

    // Constructor que deshabilita el campo de ID de producto
    public NewJInternalProductos() {
        initComponents();
        jTextid_producto.setEnabled(false); // El ID se genera automáticamente, así que se deshabilita
    }

    // Método para limpiar los campos de texto
    public void LimpiarCampos() {
        jTextid_producto.setText("");
        jTextnombre.setText("");
        jTextdescripcion.setText("");
        jTextprecio.setText("");
        jTextProductoBuscar.setText("");
    }

    // Método para obtener y mostrar todos los productos en la tabla
    public void obtenerDatos() {
        try {

            // Se obtiene una lista de productos de la base de datos
            List<Productos> productos = new DAOProductos().ObtenerDatos();
            DefaultTableModel modelo = new DefaultTableModel();

            // Se definen las columnas de la tabla
            String[] columnas = {"id_producto", "nombre", "descripcion", "precio"};
            modelo.setColumnIdentifiers(columnas);

            // Se llena la tabla con los datos de cada producto
            for (Productos pro : productos) {
                String[] renglon = {
                    Integer.toString(pro.getId_producto()),
                    pro.getNombre(),
                    pro.getDescripcion(),
                    pro.getPrecio().toString()
                };
                modelo.addRow(renglon);
            }
            jTableproducto.setModel(modelo); // Se actualiza la tabla en la interfaz

        } catch (Exception e) {
            
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error al obtener los datos de productos.");
        }
        
    }

// Método para actualizar la información de un producto
    public void actualizarProducto() {
        int id = Integer.parseInt(this.jTextid_producto.getText());
        String nomb = this.jTextnombre.getText();
        String desc = this.jTextdescripcion.getText();
        float prec = Float.parseFloat(this.jTextprecio.getText());

        // Actualiza el producto en la base de datos
        DAOProductos dao = new DAOProductos();
        int res = dao.Actualizar(id, nomb, desc, prec);

        // Muestra un mensaje según el resultado de la actualización
        if (res == 1) {
            JOptionPane.showMessageDialog(rootPane, "Producto Actualizado!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "¡Ocurrió un ERROR!");
        }
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextid_producto = new javax.swing.JTextField();
        jTextnombre = new javax.swing.JTextField();
        jTextdescripcion = new javax.swing.JTextField();
        jTextprecio = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableproducto = new javax.swing.JTable();
        jTextProductoBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registar Producto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID_Producto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio");

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAgregar.setText("Agregar ");
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

        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(76, 76, 76))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextid_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jTextnombre)
                            .addComponent(jTextdescripcion)
                            .addComponent(jTextprecio))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextid_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonBorrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTableproducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableproducto);

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextProductoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBuscar)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jTextProductoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Método llamado al hacer clic en "Agregar" para insertar un nuevo producto
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        String nomb = jTextnombre.getText();
        String desc = jTextdescripcion.getText();
        float prec = Float.parseFloat(this.jTextprecio.getText());

        // Valida que los campos no estén vacíos
        if (nomb.contentEquals("") || desc.contentEquals("") || prec == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Todos los campos son obligatorios");
        } else {
            try {
                Productos pro = new DAOProductos().Insertar(nomb, desc, prec);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agregó el registro");
            }
        }
        obtenerDatos();// Actualiza la tabla
        LimpiarCampos(); // Limpia los campos de texto
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    // Método para llenar los campos con los datos del producto seleccionado en la tabla para editarlo
    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int fila = this.jTableproducto.getSelectedRow();//Se obtiene la fila seleccionada
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        } else { //Se toma cada campo de la tabla del registro seleccionado
            // y se asgina a una variable
            try {
                // Captura los datos del producto seleccionado
                int id = Integer.parseInt((String) this.jTableproducto.getValueAt(fila, 0).toString());
                String nomb = (String) this.jTableproducto.getValueAt(fila, 1);
                String desc = (String) this.jTableproducto.getValueAt(fila, 2);
                String prec = (String) this.jTableproducto.getValueAt(fila, 3);

                // Muestra los datos en los campos de texto para su edición
                jTextid_producto.setText("" + id);
                jTextnombre.setText(nomb);
                jTextdescripcion.setText(desc);
                jTextprecio.setText(prec);
                
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    // Método llamado al hacer clic en "Actualizar" para guardar los cambios en el producto
    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        actualizarProducto();
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    // Método llamado al hacer clic en "Borrar" para eliminar el producto seleccionado
    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        int fila = this.jTableproducto.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        } else {
            int id = Integer.parseInt((String) this.jTableproducto.getValueAt(fila, 0).toString());
            DAOProductos dao = new DAOProductos();
            dao.Eliminar(id);
            obtenerDatos();
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // Obtiene el texto ingresado en el campo de búsqueda
        String terminoBusqueda = jTextProductoBuscar.getText().trim();

        // Valida que el campo de búsqueda no esté vacío
        if (terminoBusqueda.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese un término para buscar."); // Muestra un mensaje al usuario si el campo está vacío
            return; // Finaliza el método
        }
        
        try {
            // Llama al método BuscarProducto en DAOProductos para obtener la lista de productos que coinciden con el término de búsqueda
            List<Productos> productos = new DAOProductos().BuscarProducto(terminoBusqueda);

            // Valida si hay resultados en la lista de productos
            if (productos.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "No se encontraron productos con el término: " + terminoBusqueda); // Informa al usuario que no hubo coincidencias
                return; // Finaliza el método
            }

            // Crea un modelo para la tabla con las columnas especificadas
            DefaultTableModel modelo = new DefaultTableModel();
            String[] columnas = {"id_producto", "nombre", "descripcion", "precio"};
            modelo.setColumnIdentifiers(columnas); // Configura los nombres de las columnas en el modelo

            // Itera sobre los productos encontrados y los agrega como filas al modelo
            for (Productos pro : productos) {
                String[] renglon = {
                    Integer.toString(pro.getId_producto()), // Convierte el ID del producto a String
                    pro.getNombre(), // Obtiene el nombre del producto
                    pro.getDescripcion(), // Obtiene la descripción del producto
                    pro.getPrecio().toString() // Convierte el precio del producto a String
                };
                modelo.addRow(renglon); // Agrega la fila al modelo
            }

            // Actualiza la tabla con el modelo que contiene los datos de los productos encontrados
            jTableproducto.setModel(modelo);
            
        } catch (Exception e) {
            e.printStackTrace(); // Muestra detalles del error en la consola
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al realizar la búsqueda."); // Notifica al usuario sobre el error
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableproducto;
    private javax.swing.JTextField jTextProductoBuscar;
    private javax.swing.JTextField jTextdescripcion;
    private javax.swing.JTextField jTextid_producto;
    private javax.swing.JTextField jTextnombre;
    private javax.swing.JTextField jTextprecio;
    // End of variables declaration//GEN-END:variables
}
