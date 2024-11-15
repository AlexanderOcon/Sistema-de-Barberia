package Modelo;

import java.util.*;
import java.sql.*;

public class DAOVentas {

    public Ventas Insertar(int id_cliente, int id_empleado, String metodopagoV, java.sql.Date fecha_venta) {
        // Construcción de la transacción SQL para insertar una nueva venta en la tabla Ventas
        String transaccion = "INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES ("
                + id_cliente + ", "
                + id_empleado + ", '"
                + metodopagoV + "', '"
                + fecha_venta + "')";

        // Usamos el método Actualizar para ejecutar la transacción en la base de datos
        if (new DataBase().Actualizar(transaccion) > 0) {
            // Si la transacción fue exitosa, devolvemos un objeto Ventas con los datos insertados
            return new Ventas(id_cliente, id_empleado, metodopagoV, fecha_venta);
        }
        return null; // Si hubo un error, devolvemos null
    }

    public int Actualizar(int idVenta, int idCliente, int idEmpleado, String metodoPago, String fechaVenta) {
        // La sentencia SQL de actualización
        String transaccion = "UPDATE Ventas SET id_cliente = " + idCliente + ", id_empleado = " + idEmpleado
                + ", metodopagoV = '" + metodoPago + "', fecha_venta = '" + fechaVenta
                + "' WHERE id_venta = " + idVenta;

        return new DataBase().Actualizar(transaccion);
    }

    // Método para obtener datos de la tabla Ventas
    public List<Ventas> ObtenerDatos() {
        String transaccion = "SELECT * FROM ventas";
        //Llama a método Listar de DataBase.java
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Ventas> ventas = new ArrayList<>();
        //Ciclo que recorre cada registro y los agrega al arreglo
        for (Map registro : registros) {

            Ventas venta = new Ventas(
                    (int) registro.get("id_venta"),
                    (int) registro.get("id_cliente"),
                    (int) registro.get("id_empleado"),
                    (String) registro.get("metodopagoV"),
                    (java.sql.Date) registro.get("fecha_venta"));
            ventas.add(venta);
        }
        return ventas;//Retorna todos las ventas ubicadas en la tabla de BD
    }

    public int Eliminar(int idVenta) {
        String transaccion = "DELETE FROM Ventas WHERE id_venta = " + idVenta;
        return new DataBase().Actualizar(transaccion);
    }
}
