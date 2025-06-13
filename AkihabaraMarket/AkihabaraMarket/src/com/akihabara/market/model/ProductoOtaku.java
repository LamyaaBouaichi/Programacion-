// Nombre del paquete que se encuentra la clase

package com.akihabara.market.model;

//Clase pública de la tabla productos

public class ProductoOtaku {
	
	// Atributos de los productos con sus respectivos tipos de datos
	
	int id;
	String nombre;
	String categoria;
	double precio;
	int stock;
	
	// Constructor vacío
	
	public ProductoOtaku() {
		
	}
	
	// Constructor con sus atributos 
	
	public ProductoOtaku(int id, String nombre, String categoria, double precio, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	
	// Uso de encapsulamientos para acceder en cada método y protege los atributos de la clase
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	// Método que sobreescribe con la información de los productos
	
	@Override
	public String toString() {
		return "--- PRODUCTO ---\n" + 
				"Nombre: " + nombre + "\n" +
				"Categoría: " + categoria + "\n" +
				"Precio: " + precio + "\n" +
				"Stock: " + stock + "\n";
		
	}
	
	
}
