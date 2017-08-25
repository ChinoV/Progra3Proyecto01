/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2progra3;
 
import java.util.ArrayList;
import java.sql.*;    

/**
 *
 * @author Alfredo Valverde
 */
public class DataControl {
    
    private static Connection cnx = null;
    
    /**
     * <h1>abrirConexion</h1>
     * <p> Abre la coneccion a la base de datos
     * </p>  
     */
    private static void abrirConexion() throws SQLException {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Progra3DB", "root", "1125");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
    }    
    /**
     * <h1>cerrarConexion</h1>
     * <p> Cierra la coneccion a la base de datos
     * </p> 
     * @param mensaje Lista a ordenar
     */
    private static void cerrarConexion() throws SQLException{
        if(cnx != null){
            cnx.close();
        }
    }
    
    /**
     * <h1>AgregarAHistorial</h1>
     * <p> Agrega los datos al Historial en la base de datos
     * </p> 
     * @param mensaje Lista a ordenar
     */
    public void AgregarAHistorial(Object[] mensaje) throws SQLException{
        this.abrirConexion();
        try 
        {  
            PreparedStatement consulta; 
            consulta = cnx.prepareStatement("INSERT INTO historial (Name , Type, Date, Speed) values ('"+(mensaje[1]).toString()+"', '"+(mensaje[2]).toString()+"', '"+(mensaje[3]).toString()+"', '"+(mensaje[4]).toString()+"');");
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
    
     /**
     * <h1>ObtenerHistorial</h1>
     * <p> Obtiene el Historial de la base de datos
     * </p> 
     * @return ArrayList
     */
    public ArrayList<InformacionAlgoritmo> ObtenerHistorial() throws SQLException{
        this.abrirConexion();
        ArrayList<InformacionAlgoritmo> Temp = new ArrayList<InformacionAlgoritmo>();
        try {
            PreparedStatement consulta = cnx.prepareStatement("SELECT * FROM Historial");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                Temp.add(new InformacionAlgoritmo(resultado.getInt("Id"), resultado.getString("Name"), resultado.getString("Type"), resultado.getDate("Date"), resultado.getLong("Speed")));
                
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        
        return Temp; 
    }
    
    /**
     * <h1>LimpiarHistorial</h1>
     * <p> Borra los datos del Historial en la base de datos
     * </p> 
     */
    public void LimpiarHistorial() throws SQLException{
        this.abrirConexion();
        try {
            PreparedStatement consulta;
            consulta = cnx.prepareStatement("truncate historial");
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
    
}
