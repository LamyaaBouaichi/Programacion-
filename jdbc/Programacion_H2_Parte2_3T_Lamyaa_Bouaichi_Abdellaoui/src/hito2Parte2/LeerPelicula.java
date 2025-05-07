package hito2Parte2;
import java.sql.*; // Uso de la librería de SQL de Java

public class LeerPelicula {
	
	String url = "jdbc:mysql://localhost:3307/cine_Lamyaa_Bouaichi_Abdellaoui"; // Conectando a la BDD con su respectivo puerto
    String usuario = "root"; // Nombre del usuario
    String contraseña = ""; // Contraseña en el caso que tenga
    
    // Método público que me permita visualizar lo atributos 
    
    public void verPelicula () {
    	
    	try {
    		Connection conexion = DriverManager.getConnection(url, usuario, contraseña); // Hacemos uso de la conexion.
    		Statement stmt = conexion.createStatement();
    		ResultSet rs = stmt.executeQuery("SELECT nombre, fecha, categoria, director FROM peliculas JOIN categorias ON categorias.idCategoria = peliculas.idCategoria;"); // Consulta para los datos de SQL
    		
    		while (rs.next()) {
    			System.out.println("Nombre: " + rs.getString("nombre") + " / " + " Fecha: " + rs.getDate("fecha") + " / " + " Categoría: " + rs.getString("categoria") + " / " + " Director: " + rs.getString("director") +  "\n");
    			// Imprimir los datos
    		}
    		
    	} catch (SQLException e) {
    		
    		System.out.println("Error al hacer la consulta: " + e.getMessage()); // En el caso que no inicie, saldrá un mensaje con su error
    		
    	}
    	
    }
}
