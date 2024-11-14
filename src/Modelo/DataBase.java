package Modelo;

import java.sql.*;
import java.util.*;

public class DataBase {
    
   private final String URL = "jdbc:mysql://localhost:3306/Barberia";
    private final String user="root";
    private final String password="Alexander12";
    
    private Connection conexion;

    public DataBase() {
        try{
            conexion = DriverManager.getConnection(URL, user, password);
            System.out.println("Conexion Establecida");
        }catch(SQLException e){
            System.out.println("Error de Conexion");
            e.printStackTrace();
        }
    }
    
    public int Actualizar(String Consulta){
        try{
            Statement st=conexion.createStatement();
            return st.executeUpdate(Consulta);   
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    
    public List OrganizarDatos(ResultSet rs){
        List filas=new ArrayList();
        try{
            
            int numColumnas=rs.getMetaData().getColumnCount();
            while (rs.next()){
                Map<String, Object> renglon=new HashMap();
                for(int i=1; i<=numColumnas; i++){
                    String nombreCampos=rs.getMetaData().getColumnName(i);
                    Object valor=rs.getObject(nombreCampos);
                    renglon.put(nombreCampos,valor);
                }
                filas.add(renglon);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return filas;
    }
    
    public List Listar(String consulta){
        ResultSet rs=null;
        List resultado=new ArrayList();
        try{
            Statement st=conexion.createStatement();
            rs=st.executeQuery(consulta);
            resultado=OrganizarDatos(rs);
        }catch(SQLException e){
            System.out.println("No se Realizo la Consulta");
            e.printStackTrace();
        }
        return resultado;
    }
    
    
    public void cerraConexion(){
       try{
           conexion.close();
       }catch(SQLException e){
           e.printStackTrace();
       }
    }
}
