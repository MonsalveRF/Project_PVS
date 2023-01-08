package capaDatos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class accesoDatos {

    String usuario = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/db_disco";
    Connection conexion;
    Statement stmt;
    ResultSet rs;
    
    public void Abrir() 
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(accesoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }           
    } 
    public void Cerrar()
    {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(accesoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Insertar()
    {
        try{
            conexion = DriverManager.getConnection(url, usuario, clave);
            stmt = conexion.createStatement();
            stmt.executeUpdate("INSERT INTO tbl_usuarios values('felipe',1,'monsalverf@gmail.com',4999546)");            
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(accesoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
    }
    
    public boolean ValidarUsuario(String user, String contra)
    {       
        boolean rta = false;
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            stmt = conexion.createStatement();
            String Query = String.format("SELECT * FROM tbl_admins where strUsuario = '%s' and strContra = '%s'", user,contra);
            rs = stmt.executeQuery(Query);
            rta = rs.next();
        }catch (SQLException ex) {
            Logger.getLogger(accesoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rta;
    }
    public static void main(String[] args)
    {
        accesoDatos con = new accesoDatos();
        boolean valor;
        valor = con.ValidarUsuario("admin","adm1n");
        if(valor)
        {
            System.out.println("Permitido");
        }else
        {
            System.out.println("Denegado");
        }
    }
}
