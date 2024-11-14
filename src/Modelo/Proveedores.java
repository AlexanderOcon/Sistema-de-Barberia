package Modelo;


public class Proveedores {
  private int id_proveedor; 
  private String Nombre;   
  private String Apellido;  
  private String Email;   
  private String Telefono;  
  private String Url;  

    public Proveedores(int id_proveedor, String Nombre, String Apellido, String Email, String Telefono, String Url) {
        this.id_proveedor = id_proveedor;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Url = Url;
    }

    public Proveedores(String Nombre, String Apellido, String Email, String Telefono, String Url) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Url = Url;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }
  
    
}
