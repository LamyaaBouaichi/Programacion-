package hito2Parte2;
import java.sql.*; // Uso de la librería de SQL de Java
import java.util.Scanner;

public class InsertarPelicula {
	
	void añadirPelicula() {
		
		String url = "jdbc:mysql://localhost:3307/cine_Lamyaa_Bouaichi_Abdellaoui"; // Conectando a la BDD con su respectivo puerto
	    String usuario = "root"; // Nombre del usuario
	    String contraseña = ""; // Contraseña en el caso que tenga
	    
	    // Utilizamos la libreria
	    Scanner scanner = new Scanner(System.in);
	    
	    // Un submenú con 2 opciones
	    int opcion;
	    System.out.println("\n Eliga la tabla que desee añadir\n ");
	    System.out.println(" 1. Categorias\n 2. Peliculas\n");
	    
	    opcion = scanner.nextInt();
	    
	    if (opcion == 1) {
	    	
	    	int idCategoria;
	    	String categoria;
	    	
	    	try {
		    	// Conexión de la BDD  
		    	Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
		    	String sql = "INSERT INTO categorias (idCategoria, categoria) VALUES (?, ?);";
		    	PreparedStatement pstmt = conexion.prepareStatement(sql);
		    	
		    	// Introducir la ID
		    	System.out.println("Introduce el ID de la categoria: ");
		    	idCategoria = scanner.nextInt();
		    	pstmt.setInt(1, idCategoria);
		    	
		    	// Introducir la categoría
		    	System.out.println("Introduce la categoría que desea ingresar: ");
		    	categoria = scanner.next();
		    	pstmt.setString(2, categoria);
		    	
		    	System.out.println("¡Categoria agregada exitosamente!");
		    	
		    	 pstmt.executeUpdate();

		         pstmt.close();
		         conexion.close();

		    	
		    } catch (SQLException e) {
		    	// Mensaje de error en el caso que no funcione
		    	System.out.println("Error al añadir categoria: " + e.getMessage());
		    }
	    	
	    } else if (opcion == 2) {
	    	
	    	int idPelicula;
	    	String nombre;
	    	String fecha;
	    	String director;
	    	int idCategoria;
	    	
	    	try {
		    	
	    		// Conexión de la BDD  
		    	Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
		    	String sql = "INSERT INTO peliculas (idPelicula, nombre, fecha, director, idCategoria) VALUES (?, ?, ?, ?, ?);";
		    	PreparedStatement pstmt = conexion.prepareStatement(sql);
		    	
		    	// Introducir la ID de la película
		    	System.out.println("Introduce el ID de la película: ");
		    	idPelicula = scanner.nextInt();
		    	pstmt.setInt(1, idPelicula);
		    	
		    	// Introducir el nombre de la película
		    	System.out.println("Introduce el nombre de la película: ");
		    	nombre = scanner.next();
		    	pstmt.setString(2, nombre);
		    	
		    	// Introducir la fecha de la película
		    	System.out.println("Introduce la fecha que ha sido publicada: ");
		    	fecha = scanner.next();
		    	pstmt.setString(3, fecha);
		    	
		    	// Introducir el nombre del director de la película
		    	System.out.println("Introduce el nombre del director: ");
		    	director = scanner.next();
		    	pstmt.setString(4, director);
		    	
		    	// Introducir el ID de la categoría
		    	System.out.println("Introduce el ID de la categoria: ");
		    	idCategoria = scanner.nextInt();
		    	pstmt.setInt(5, idCategoria);
		    	
		    	System.out.println("¡Película agregada exitosamente!");
		    	
		    	 pstmt.executeUpdate();

		         pstmt.close();
		         conexion.close();

		    	
		    } catch (SQLException e) {
		    	
		    	System.out.println("Error al añadir pelicula: " + e.getMessage());
		    }
	    	
	    } else {
	    	
	    	System.out.println("Opción no válida. Eliga una opción");
	    	
	    }
	    
	    scanner.close();
	}
}
