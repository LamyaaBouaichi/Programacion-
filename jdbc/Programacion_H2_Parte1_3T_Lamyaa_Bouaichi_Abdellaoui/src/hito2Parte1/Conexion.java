package hito2Parte1;
import java.sql.*; // Uso de la librería de SQL de Java

// Crear una clase aparte para la BDD y un método conexion para conectar a la base de datos
public class Conexion {
	
	public void conexion() {
		
		String url = "jdbc:mysql://localhost:3307/cine_Lamyaa_Bouaichi_Abdellaoui"; // Conectando a la BDD con su respectivo puerto
	    String usuario = "root"; // Nombre del usuario
	    String contraseña = ""; // Contraseña en el caso que tenga

	    try {
	        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
	        System.out.println("Iniciando BDD\n"); // Un mensaje que indica el uso de la BDD
	        conexion.close();
	    } catch (SQLException e) {
	        System.out.println("Error de conexión: " + e.getMessage()); // En el caso que no inicie, saldrá un mensaje con su error
	    
	    }
	}
		
    
}
