package hito2Parte2;
import java.sql.*; // Uso de la librería de SQL de Java
import java.util.Scanner;

public class ActualizarPelicula {

	void modificarPelicula () {
		
		String url = "jdbc:mysql://localhost:3307/cine_Lamyaa_Bouaichi_Abdellaoui"; // Conectando a la BDD con su respectivo puerto
	    String usuario = "root"; // Nombre del usuario
	    String contraseña = ""; // Contraseña en el caso que tenga
		
	    Scanner scanner = new Scanner(System.in);

	    try {
	    	
	    	int idPelicula;
	    	String fecha;
	    	int idCategoria;
	    	
	    	// Conexión de la BDD  
	    	Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
	    	String sql = "UPDATE peliculas SET fecha = ?, idCategoria = ? WHERE idPelicula = ?;";
	    	PreparedStatement pstmt = conexion.prepareStatement(sql);
	    	
	    	// Introduir el ID para modificar
	    	System.out.println("Introduce el ID de la película a actualizar/modificar: ");
	    	idPelicula = scanner.nextInt();
	    	pstmt.setInt(1, idPelicula);
	    	
	    	// Introduir la fecha para modificar
	    	System.out.println("Introduce la fecha a modificar: ");
	    	fecha = scanner.next();
	    	pstmt.setString(2, fecha);
	    	
	    	// Introduir la categoría para modificar
	    	System.out.println("Introduce la categoría (ID) a actualizar: ");
	    	idCategoria = scanner.nextInt();
	    	pstmt.setInt(3, idCategoria);
	    	
	    	System.out.println("¡Película modificada exitosamente!");
	    	
	    	pstmt.executeUpdate();

	        pstmt.close();
	        conexion.close();

	    } catch (SQLException e) {
	    	// Mensaje de error en el caso que no funcione
	    	System.out.println("Error al actualizar película: " + e.getMessage());
	    	
	    }
	    
	    scanner.close();
	}
	
}
