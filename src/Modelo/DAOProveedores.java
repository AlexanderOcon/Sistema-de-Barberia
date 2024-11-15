package Modelo;

import java.util.*;

public class DAOProveedores {
    
    
    public Proveedores Insertar(String Nombre, String Apellido, String Email, String Telefono,String Url) {
        // Construcción de la transacción SQL para insertar una nueva venta en la tabla Ventas
        String transaccion = "INSERT INTO Proveedores (Nombre, Apellido, Email, Telefono,Url) VALUES ("
                + Nombre + ", "
                + Apellido + ", '"
                + Email + "', '"
                + Telefono + "')"
                 + Url + "')";
        
        // Usamos el método Actualizar para ejecutar la transacción en la base de datos
        if (new DataBase().Actualizar(transaccion) > 0) {
            // Si la transacción fue exitosa, devolvemos un objeto Ventas con los datos insertados
            return new Proveedores (Nombre, Apellido, Email, Telefono,Url);
        }
        return null; // Si hubo un error, devolvemos null
  } 
    
     // Método para actualizar los datos de un producto existente en la base de datos
    public int Actualizar(int id_proveedor, String Nombre, String Apellido, String Email, String Telefono, String Url) {
         // Consulta SQL para actualizar el nombre, descripción y precio del producto con id específico
        String transaccion = "UPDATE Proveedores SET Nombre='"
                + Nombre + "', Apellido='"
                + Apellido + "', Email="
                + Email + "',=Telefono"
                + Telefono +"',=Url"
                + Url + "WHERE id_proveedor="
                + id_proveedor;
        
        // Ejecuta la consulta de actualización 
        return new DataBase().Actualizar(transaccion);
    }
    
    // Método para obtener todos los productos de la base de datos
    public List <Proveedores> ObtenerDatos() {
        String transaccion = "SELECT * FROM Proveedores;";
        
        // Lista de registros obtenidos de la base de datos
        List<Map<String, Object>> registros = new DataBase().Listar(transaccion);
        List<Proveedores> proveedores = new ArrayList<>();
        
        
        // Recorre cada registro y lo convierte en un objeto Productos
        for (Map<String, Object> registro : registros) {
            Proveedores provee;
            provee = new Proveedores(
                    (int) registro.get("id_proveedor"), // Obtiene el ID del producto
                    (String) registro.get("Nombre"), // Obtiene el nombre
                    (String) registro.get("Apellido"),// Obtiene la descripción
                    (String) registro.get("Email"),
                    (String) registro.get("Telefono"),
                    (String) registro.get("Url")
            );
            proveedores.add(provee); // Agrega el producto a la lista
        }
        return proveedores; // Retorna la lista de productos
    }
    
    // Método para eliminar un producto de la base de datos por su ID
    public int Eliminar(int id_proveedor) {
        // Consulta SQL para eliminar el producto con el ID especificado
        String transaccion = "DELETE FROM Proveedores WHERE id_proveedor = " + id_proveedor;
        return new DataBase().Actualizar(transaccion); // Ejecuta la consulta de eliminación
    }
    
    
    
    
    
}
