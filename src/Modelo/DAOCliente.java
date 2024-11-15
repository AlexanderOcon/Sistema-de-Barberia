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

        String transaccion = "DELETE FROM Empleados WHERE id_empleado = " + id_cliente;
        return new DataBase().Actualizar(transaccion);
    }

}
