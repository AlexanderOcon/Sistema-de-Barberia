package Modelo;

import java.sql.*;
import java.util.*;

public class DAOCliente {

    //Metodo para insertar datos en la BD
    public Cliente Insertar(String nombre, String apellido, String telefono) {
        String transaccion = "INSERT INTO Cliente (nombre, Apellido, telefono) VALUES ('"
                + nombre + "', '"
                + apellido + "', '"
                + telefono + "')";
        // Llama al metodo Actualizar ubicado en DataBase.java
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Cliente(nombre, apellido, telefono);
        }
        return null;
    }
    //Metodo para actualizar un registro en la BD.

    public int Actualizar(int id_cliente, String nombre, String apellido, String telefono) {

        String transaccion = "UPDATE cliente SET nombre = '"
                + nombre + "', apellido = '"
                + apellido + "', telefono = '"
                + telefono
                + "' WHERE id_cliente = "
                + id_cliente;

        return new DataBase().Actualizar(transaccion);
    }

//metodo para seleccionar todos los registros de la tabla 
    public List<Cliente> ObtenerDatos() {

        String transaccion = "SELECT * FROM Cliente";

        List<Map> registros = new DataBase().Listar(transaccion);
        List<Cliente> cliente = new ArrayList<>();

        for (Map registro : registros) {

            Cliente clie = new Cliente(
                    (int) registro.get("id_cliente"),
                    (String) registro.get("nombre"),
                    (String) registro.get("apellido"),
                    (String) registro.get("telefono")
            );
            cliente.add(clie);

        }
        return cliente;
    }

    // Metodo para eliminar un registro de la tabla de BD
    public int Eliminar(int id_cliente) {

        String transaccion = "DELETE FROM Cliente WHERE id_cliente = " + id_cliente;
        return new DataBase().Actualizar(transaccion);
    }

    // Método para buscar clientes por nombre o apellido
        public List<Cliente> BuscarCliente(String terminoBusqueda) {
        // Se define la consulta SQL para buscar coincidencias en las columnas "nombre" o "apellido"
        String transaccion = "SELECT * FROM Cliente WHERE nombre LIKE '%"
                + terminoBusqueda + "%' OR apellido LIKE '%" + terminoBusqueda + "%'";

        // Ejecuta la consulta y obtiene los resultados como una lista de mapas
        List<Map> registros = new DataBase().Listar(transaccion);
        // Inicializa una lista vacía para almacenar los objetos Cliente
        List<Cliente> clientes = new ArrayList<>();

        // Itera sobre los registros obtenidos de la consulta
        for (Map registro : registros) {
            // Crea un nuevo objeto Cliente a partir de los datos del registro actual
            Cliente clie = new Cliente(
                    (int) registro.get("id_cliente"), // Convierte el ID del cliente a entero
                    (String) registro.get("nombre"), // Obtiene el nombre del cliente
                    (String) registro.get("apellido"), // Obtiene el apellido del cliente
                    (String) registro.get("telefono") // Obtiene el teléfono del cliente
            );
            // Añade el objeto Cliente a la lista
            clientes.add(clie);
        }

        // Devuelve la lista de clientes encontrados
        return clientes;
    }
}
