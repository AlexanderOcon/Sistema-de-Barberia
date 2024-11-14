package Modelo;

import java.util.*;
import java.sql.*;
/**
 *
 * @author Usuario
 */
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
        String transaccion =
                "UPDATE Empleados SET nombre = '"
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
}
    

