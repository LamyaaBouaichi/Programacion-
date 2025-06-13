// Paquete que se encuentra dicha clase

package com.akihabara.market.dao;
// Uso de las librerías para las conexion de la base de datos

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	// Variable estáticos con sus respectivos datos (url, usuario, contraseña)
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/akihabara_db";
	static final String USER = "userAkihabara";
	static final String PASSWORD = "akihabara";
	
	// Propiedad privada conexion de tipo Connection
	
	private Connection conexion;
	
	// Constructor que permite acceder a la base de datos
	
	public DatabaseConnection() {
		try {
			
			conexion = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("Se ha establecido con éxito la conexión a la base de datos.\n");
			
			
		} catch (SQLException e) {
			
			System.out.println("Error de conexion: " + e.getMessage());
		}
	}
	
	// Retorna la instancia (Connection)
	
	public Connection getConexion() {
		return conexion;
	}
	
	// Cierra la conexión en el caso que esté activa, en el caso contrario muestra un mensaje que indica el error
	
	public void cerrarConexion() {
		System.out.println("\nSe ha cerrado la conexion.");
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
