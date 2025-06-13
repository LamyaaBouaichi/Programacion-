package com.akihabara.market.dao;

import com.akihabara.market.model.*;
import java.util.*;
import java.sql.*;

public class ProductoDAO {
	
	// Acceso a la conexion de la BDD
	
	private DatabaseConnection conexion;
	
	// Uso de la BDD 
	
	public ProductoDAO() {
		conexion = new DatabaseConnection();
	}
	
	/* Añadir productos usando el constructor ProductoOtaku y acceder mediante una variable
		donde accedemos dichos atributos con la variable que ha sido nombrado (uso de getters)
	*/
	public void agregarProducto(ProductoOtaku producto) {
		
		try {
			
			String sql = "INSERT INTO productos (nombre, categoria, precio, stock) VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = conexion.getConexion().prepareStatement(sql);
			
			pstmt.setString(1, producto.getNombre());
			pstmt.setString(2, producto.getCategoria());
			pstmt.setDouble(3, producto.getPrecio());
			pstmt.setInt(4, producto.getStock());
			
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("Error al agregar un producto: " + e.getMessage());
		}
		
	}
	
	// Obtiene el producto utilizando la id 
	 
	public ProductoOtaku obtenerProductoPorId(int id) {
		
		ProductoOtaku productoBuscado = null;
		
		try {
			
			String sql = "SELECT * FROM productos WHERE id = ?";
			PreparedStatement pstmt = conexion.getConexion().prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				productoBuscado = new ProductoOtaku();
				productoBuscado.setId(rs.getInt("id"));
				productoBuscado.setNombre(rs.getString("nombre"));
				productoBuscado.setCategoria(rs.getString("categoria"));
				productoBuscado.setPrecio(rs.getDouble("precio"));
				productoBuscado.setStock(rs.getInt("stock"));
			}
			
			rs.close();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("Error al obtener el producto por ID: " + e.getMessage());
			return null;
		}
		
		return productoBuscado;
	}
	
	// Lista que permite obtener todos los productos
	
	public List<ProductoOtaku> obtenerTodosLosProductos() {
		
		List<ProductoOtaku> todosLosProductos = new ArrayList<ProductoOtaku>();
		
		try {
			
			String sql = "SELECT * FROM productos";
			PreparedStatement pstmt = conexion.getConexion().prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {	
				
				ProductoOtaku producto = new ProductoOtaku();
				
				producto.setId(rs.getInt("id"));
				producto.setNombre(rs.getString("nombre"));
				producto.setCategoria(rs.getString("categoria"));
				producto.setPrecio(rs.getDouble("precio"));
				producto.setStock(rs.getInt("stock"));
				
				todosLosProductos.add(producto);
			}
			
			rs.close();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("Error al obtener todos los productos: " + e.getMessage());
			return null;
		}
		
		return todosLosProductos;
		
	}
	
	/* Modifica dicho producto en donde retorna true en el caso que se haya encontrado el producto
	mediante su Id, y en el caso contrario retorna false
	*/
	public boolean actualizarProducto(ProductoOtaku producto) {
		
		try {
			
			String sql = "UPDATE productos SET nombre = ?, categoria = ?, precio = ?, stock = ? WHERE id = ?";
			PreparedStatement pstmt = conexion.getConexion().prepareStatement(sql);
			
			pstmt.setString(1, producto.getNombre());
			pstmt.setString(2, producto.getCategoria());
			pstmt.setDouble(3, producto.getPrecio());
			pstmt.setInt(4, producto.getStock());
			pstmt.setInt(5, producto.getId());
		    
			pstmt.executeUpdate();
			
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("Error al actualizar el producto: " + e.getMessage());
			return false;
		}
		
		return true;
	
	}
	
	// Elimina el producto por su Id
	
	public boolean eliminarProducto(int id) {
		
		try {

			String sql = "DELETE FROM productos WHERE id = ?";
			PreparedStatement pstmt = conexion.getConexion().prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			pstmt.executeUpdate();
			
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("Error al eliminar el producto: " + e.getMessage());
			return false;
		}
		
		return true;
	}
	
	// Busca los productos mediante su nombre y muestra el resultado 
	
	public List<ProductoOtaku> buscarProductoPorNombre(String nombre) {
		
		List<ProductoOtaku> buscarProductoNombre = new ArrayList<ProductoOtaku>();
		
		try {
			
			String sql = "SELECT *FROM productos WHERE nombre = ?";
			PreparedStatement pstmt = conexion.getConexion().prepareStatement(sql);
			
			pstmt.setString(1, nombre);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				ProductoOtaku productoBuscado = new ProductoOtaku();
				
				productoBuscado.setId(rs.getInt("id"));
				productoBuscado.setNombre(rs.getString("nombre"));
				productoBuscado.setCategoria(rs.getString("categoria"));
				productoBuscado.setPrecio(rs.getDouble("precio"));
				productoBuscado.setStock(rs.getInt("stock"));
				
				buscarProductoNombre.add(productoBuscado);
				
			}
			
			rs.close();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("Error al buscar el producto por nombre: " + e.getMessage());
		}
		
		return buscarProductoNombre;
	}
	
	// Busca los productos por su categoria y muestra el resultado
	
	public List<ProductoOtaku> buscarProductoPorCategoria(String categoria) {
		
		List<ProductoOtaku> buscarProductoCategoria = new ArrayList<ProductoOtaku>();
		
		try {
			
			String sql = "SELECT *FROM productos WHERE categoria = ?";
			PreparedStatement pstmt = conexion.getConexion().prepareStatement(sql);
			
			pstmt.setString(1, categoria);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				ProductoOtaku productoBuscado = new ProductoOtaku();
				
				productoBuscado.setId(rs.getInt("id"));
				productoBuscado.setNombre(rs.getString("nombre"));
				productoBuscado.setCategoria(rs.getString("categoria"));
				productoBuscado.setPrecio(rs.getDouble("precio"));
				productoBuscado.setStock(rs.getInt("stock"));
				
				buscarProductoCategoria.add(productoBuscado);
				
			}
			
			rs.close();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("Error al buscar el producto por nombre: " + e.getMessage());
		}
		
		return buscarProductoCategoria;
	}
	
	// Cierra la conexión a la BDD 
	
	public void cerrar() {
		conexion.cerrarConexion();
	}
	
}
