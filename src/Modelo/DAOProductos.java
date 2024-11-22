package Modelo;

import java.util.*;

public class DAOProductos {

    // Método para insertar un nuevo producto en la base de datos
    public Productos Insertar(String nombre, String descripcion, Float precio) {
        // Consulta SQL para insertar el producto con nombre, descripción y precio 
        String transaccion = "INSERT INTO Productos(nombre, descripcion, precio) VALUES ('"
                + nombre + "','"
                + descripcion + "',"
                + precio + ")";
        // Ejecuta la consulta y verifica si la inserción fue exitosa
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Productos(nombre, descripcion, precio); // Retorna un nuevo objeto Productos
        }
        return null; // Si falla, retorna null
    }

    // Método para actualizar los datos de un producto existente en la base de datos
    public int Actualizar(int id_producto, String nombre, String descripcion, Float precio) {
        // Consulta SQL para actualizar el nombre, descripción y precio del producto con id específico
        String transaccion = "UPDATE Productos SET nombre='"
                + nombre + "', descripcion='"
                + descripcion + "', precio="
                + precio + " WHERE id_producto="
                + id_producto;

        // Ejecuta la consulta de actualización 
        return new DataBase().Actualizar(transaccion);
    }

    // Método para obtener todos los productos de la base de datos
    public List<Productos> ObtenerDatos() {
        String transaccion = "SELECT * FROM Productos";

        // Lista de registros obtenidos de la base de datos
        List<Map<String, Object>> registros = new DataBase().Listar(transaccion);
        List<Productos> productos = new ArrayList<>();

        // Recorre cada registro y lo convierte en un objeto Productos
        for (Map<String, Object> registro : registros) {
            Productos pro;
            pro = new Productos(
                    (int) registro.get("id_producto"), // Obtiene el ID del producto
                    (String) registro.get("nombre"), // Obtiene el nombre
                    (String) registro.get("descripcion"), // Obtiene la descripción
                    (float) registro.get("precio") // Obtiene el precio
            );
            productos.add(pro); // Agrega el producto a la lista
        }
        return productos; // Retorna la lista de productos
    }

    // Método para eliminar un producto de la base de datos por su ID
    public int Eliminar(int id_producto) {
        // Consulta SQL para eliminar el producto con el ID especificado
        String transaccion = "DELETE FROM Productos WHERE id_producto = " + id_producto;
        return new DataBase().Actualizar(transaccion); // Ejecuta la consulta de eliminación
    }

  
    // Método para buscar productos por ID
    public Productos BuscarProductoPorId(int idProducto) {
        // Consulta SQL para buscar un producto cuyo ID coincida con el proporcionado
        String transaccion = "SELECT * FROM Productos WHERE id_producto = " + idProducto;

        // Lista de registros obtenidos de la base de datos (esperamos solo un registro)
        List<Map<String, Object>> registros = new DataBase().Listar(transaccion);

        // Si se encontró un registro, lo convierte en un objeto Productos
        if (!registros.isEmpty()) {
            Map<String, Object> registro = registros.get(0); // Obtiene el primer registro
            return new Productos(
                    (int) registro.get("id_producto"), // Obtiene el ID del producto
                    (String) registro.get("nombre"), // Obtiene el nombre
                    (String) registro.get("descripcion"), // Obtiene la descripción
                    (float) registro.get("precio") // Obtiene el precio
            );
        }
        // Si no se encontró el producto, retorna null o lanza una excepción según lo necesites
        return null;
    }
}