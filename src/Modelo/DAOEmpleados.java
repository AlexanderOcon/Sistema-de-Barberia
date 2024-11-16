package Modelo;

import java.util.*;
import java.sql.*;

public class DAOEmpleados {

    public Empleados Insertar(String nombre, String telefono, String email, String direccion) {
        String transaccion = "INSERT INTO Empleados (nombre, telefono, email, direccion) VALUES ('"
                + nombre + "', '"
                + telefono + "', '"
                + email + "', '"
                + direccion + "')";

        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Empleados(nombre, telefono, email, direccion);
        }
        return null;
    }

    public int Actualizar(int idEmpleado, String nombre, String telefono, String email, String direccion) {
        // La sentencia SQL de actualización
        String transaccion
                = "UPDATE Empleados SET nombre = '"
                + nombre + "', telefono = '"
                + telefono
                + "', email = '"
                + email + "', direccion = '"
                + direccion + "' WHERE id_empleado = "
                + idEmpleado;

        return new DataBase().Actualizar(transaccion);
    }

    // Método para obtener 
    public List<Empleados> ObtenerDatos() {

        String transaccion = "SELECT * FROM Empleados";

        List<Map> registros = new DataBase().Listar(transaccion);
        List<Empleados> empleados = new ArrayList<>();

        for (Map registro : registros) {

            Empleados emp = new Empleados(
                    (int) registro.get("id_empleado"),
                    (String) registro.get("nombre"),
                    (String) registro.get("telefono"),
                    (String) registro.get("email"),
                    (String) registro.get("direccion")
            );
            empleados.add(emp);
        }
        return empleados;
    }

    public int Eliminar(int idEmpleado) {

        String transaccion = "DELETE FROM Empleados WHERE id_empleado = " + idEmpleado;
        return new DataBase().Actualizar(transaccion);
    }

    public List<Empleados> BuscarEmpleado(String nombre) {
        // Construir la consulta SQL para buscar empleados cuyo nombre contenga el texto proporcionado
        // La cláusula LIKE se utiliza con los comodines '%' para realizar una búsqueda parcial
        String transaccion = "SELECT * FROM Empleados WHERE nombre LIKE '%" + nombre + "%'";

        // Ejecutar la consulta en la base de datos y obtener una lista de registros en forma de Map
        List<Map> registros = new DataBase().Listar(transaccion);

        // Crear una lista vacía para almacenar los objetos Empleados resultantes
        List<Empleados> empleados = new ArrayList<>();

        // Recorrer los registros obtenidos y convertirlos en objetos de la clase Empleados
        for (Map registro : registros) {
            // Crear un objeto Empleados usando los valores obtenidos del registro
            Empleados emp = new Empleados(
                    (int) registro.get("id_empleado"), // ID del empleado
                    (String) registro.get("nombre"), // Nombre del empleado
                    (String) registro.get("telefono"), // Teléfono del empleado
                    (String) registro.get("email"), // Email del empleado
                    (String) registro.get("direccion") // Dirección del empleado
            );
            // Agregar el objeto Empleados a la lista
            empleados.add(emp);
        }

        // Devolver la lista de empleados encontrados
        return empleados;
    }

}
