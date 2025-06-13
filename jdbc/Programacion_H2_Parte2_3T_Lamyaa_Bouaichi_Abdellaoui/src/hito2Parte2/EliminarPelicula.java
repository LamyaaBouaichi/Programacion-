package hito2Parte2;
import java.sql.*; // Uso de la librería de SQL de Java
import java.util.Scanner;

public class EliminarPelicula {
	
	void eliminarPelicula() {
		
		String url = "jdbc:mysql://localhost:3307/cine_Lamyaa_Bouaichi_Abdellaoui"; // Conectando a la BDD con su respectivo puerto
	    String usuario = "root"; // Nombre del usuario
	    String contraseña = ""; // Contraseña en el caso que tenga
		
	    Scanner scanner = new Scanner(System.in);
	    
	    try {
	    	
	    	int idPelicula;
	    	 // Conectar la BDD
	    	Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
	    	String sql = "DELETE FROM peliculas WHERE idPelicula = ?;";
	    	PreparedStatement pstmt = conexion.prepareStatement(sql);
	    	
	    	// Introdicir el ID para eliminar de la BDD
	    	System.out.println("Introduce el ID de la película a a eliminar: ");
	    	idPelicula = scanner.nextInt();
	    	pstmt.setInt(1, idPelicula);
	    	
	    	System.out.println("¡Película eliminada exitosamente!");
	    	
	    	pstmt.executeUpdate();
	    	
	        pstmt.close();
	        conexion.close();
	    	
	    } catch(SQLException e) {
	    	// Mensaje de error en el caso que no funcione
	    	System.out.println("Error al eliminar película: " + e.getMessage());
	    	
	    }
	    
	    scanner.close();
		
	}
}
