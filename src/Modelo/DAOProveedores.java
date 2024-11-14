package Modelo;
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
    
    
    
    
    
    
    
}
