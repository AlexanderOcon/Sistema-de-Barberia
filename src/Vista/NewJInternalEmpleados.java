package Vista;

import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class NewJInternalEmpleados extends javax.swing.JInternalFrame {
    
    public NewJInternalEmpleados() {
        initComponents();
        jTextidEmpleado.setEnabled(false);//deshabilitar campo de idEmpleado
    }
    
    public void LimpiarCampos() {
        jTextidEmpleado.setText("");
        jTextNombre.setText("");
        jTextTelefono.setText("");
        jTextEmail.setText("");
        jTextDireccion.setText("");
        jTextBuscarEmpleado.setText("");
    }

    //Método para listar datos dentro de la tabla
    public void obtenerDatos() {
        //Se crea una lista que almacena los datos obtenidos
        List<Empleados> empleados = new DAOEmpleados().ObtenerDatos();
        //Define un modelo para la tabla    
        DefaultTableModel modelo = new DefaultTableModel();
        //Arreglo con nombre de columnas de la tabla
        String[] columnas = {"idEmpleado", "nombre", "telefono",
            "email", "direccion"};
        //Establece los nombres definidos de las columnas
        modelo.setColumnIdentifiers(columnas);
        for (Empleados au : empleados) { //Recorre cada elemento de la lista y los agrega 
            //al modelo de la tabla
            String[] renglon = {Integer.toString(au.getIdEmpleado()), au.getNombre(),
                au.getTelefono(), au.getEmail(), au.getDireccion().toString()};
            modelo.addRow(renglon);
        }
        jTableEmpleados.setModel(modelo);
        // Ubica los datos del modelo en la tabla
    }
    
    public void actualizar() {
        int id = Integer.parseInt(this.jTextidEmpleado.getText());
        String nom = this.jTextNombre.getText();
        String ape = this.jTextTelefono.getText();
        String corr = this.jTextEmail.getText();
        String dire = this.jTextDireccion.getText();
        
        DAOEmpleados dao = new DAOEmpleados();
        int res = dao.Actualizar(id, nom, ape, corr, dire);
        if (res == 1) {
            JOptionPane.showMessageDialog(rootPane, "Empleado Actualizado!");
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
        jTextidEmpleado = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBEditar1 = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jTextBuscarEmpleado = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Empleados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID_Empleado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Telefono");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jTextidEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidEmpleadoActionPerformed(evt);
            }
        });

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Direccion");

        jBAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBEditar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBEditar1.setText("Actualizar");
        jBEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditar1ActionPerformed(evt);
            }
        });

        jBBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextidEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jTextidEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEditar)
                    .addComponent(jBEditar1)
                    .addComponent(jBAgregar))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBBorrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableEmpleados);

        jBBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTextBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextidEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidEmpleadoActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        // Captura datos de la cajas de texto
        String nomb = jTextNombre.getText();
        String tele = jTextTelefono.getText();
        String ema = jTextEmail.getText();
        String dire = jTextDireccion.getText();

        //Comprueba que las cajas de texto no esten vacías
        if (nomb.contentEquals("") || ema.contentEquals("")
                || ema.contentEquals("") || dire.contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "Todos los campos son obligatorios");
        } else {
            try {

                //objeto para acceder al método Insertar de DAOAutor
                Empleados au = new DAOEmpleados().Insertar(nomb, tele, ema, dire);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agregó el registro");
            }
        }
        obtenerDatos();//1lama a este método para que se muestre el nuevo
        //registro en la tabla del formulario
        LimpiarCampos();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int fila = this.jTableEmpleados.getSelectedRow();//Se obtiene #fila seleccionado
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        } else { //Se toma cada campo de la tabla del registro seleccionado
            // y se asgina a una variable
            try {
                int id = Integer.parseInt((String) this.jTableEmpleados.getValueAt(fila, 0).toString());
                String nom = (String) this.jTableEmpleados.getValueAt(fila, 1);
                String tele = (String) this.jTableEmpleados.getValueAt(fila, 2);
                String ema = (String) this.jTableEmpleados.getValueAt(fila, 3);
                String dire = (String) this.jTableEmpleados.getValueAt(fila, 4);

                //Se ubican en las cajas de textos los datos capturados de la tabla
                jTextidEmpleado.setText("" + id);
                jTextNombre.setText(nom);
                jTextTelefono.setText(tele);
                jTextEmail.setText(ema);
                jTextDireccion.setText(dire);
                
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditar1ActionPerformed
        actualizar();
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_jBEditar1ActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        
        int fila = this.jTableEmpleados.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        } else {
            int id = Integer.parseInt((String) this.jTableEmpleados.getValueAt(fila, 0).toString());
            DAOEmpleados dao = new DAOEmpleados();
            dao.Eliminar(id);
            obtenerDatos();
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        
        String criterio = jTextBuscarEmpleado.getText().trim();
        
        if (criterio.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese un criterio de búsqueda");
            return;
        }
        
        try {
            // Llamar al método de DAOEmpleados para buscar
            DAOEmpleados dao = new DAOEmpleados();
            List<Empleados> resultado = new DAOEmpleados().BuscarEmpleado(criterio); // Método que deberías definir en DAOEmpleados
            
            if (resultado.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "No se encontraron resultados");
                return;
            }

            // Crear modelo de tabla para mostrar los resultados
            DefaultTableModel modelo = new DefaultTableModel();
            String[] columnas = {"idEmpleado", "nombre", "telefono", "email", "direccion"};
            modelo.setColumnIdentifiers(columnas);
            
            for (Empleados emp : resultado) {
                String[] fila = {
                    Integer.toString(emp.getIdEmpleado()),
                    emp.getNombre(),
                    emp.getTelefono(),
                    emp.getEmail(),
                    emp.getDireccion()
                };
                modelo.addRow(fila);
            }
            
            jTableEmpleados.setModel(modelo);
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error al buscar empleados: " + e.getMessage());
        }
        

    }//GEN-LAST:event_jBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEditar1;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JTextField jTextBuscarEmpleado;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JTextField jTextidEmpleado;
    // End of variables declaration//GEN-END:variables
}
