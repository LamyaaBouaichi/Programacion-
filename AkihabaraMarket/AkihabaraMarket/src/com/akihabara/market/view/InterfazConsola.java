package com.akihabara.market.view;

import java.util.*;
import com.akihabara.market.model.ProductoOtaku;
import com.akihabara.market.view.InterfazConsola;
import llmservice.LlmService;

public class InterfazConsola {
	
	private Scanner scn = new Scanner(System.in);
	LlmService llm = new LlmService();
	
	public int menuPrincipal() {
		
		System.out.println("\n --- Menú principal --- \n");
		System.out.println("1. Añadir producto");
		System.out.println("2. Añadir producto sugerido por IA");
		System.out.println("3. Consultar producto por ID");
		System.out.println("4. Listar todos los productos");
		System.out.println("5. Listar productos por nombre");
		System.out.println("6. Listar productos por categoría");
		System.out.println("7. Actualizar producto");
		System.out.println("8. Eliminar producto");
		System.out.println("9. Salir del programa\n");
		int n = scn.nextInt();
		scn.nextLine(); // Limpia el buffer del teclado recogiendo el retorno de carro.
		return n;
	}
	
	public ProductoOtaku sugerirNombreProducto() {
		
    	System.out.println("Introduce el tipo de categoría (Figura, Manga, Póster, Llavero, Ropa) ");
    	String tipo = scn.nextLine();
    	
    	System.out.println("Introduce la franquicia de dicha categoría ");
    	String franquicia = scn.nextLine();
    	
    	String nombreSugerido = llm.sugerirNombreProducto(tipo, franquicia);
    	
    	String nombre = nombreSugerido;
    	
		System.out.println("Introduce la categoría (Figura, Manga, Póster, Llavero, Ropa): ");
		String categoria = scn.nextLine();
		
		System.out.println("Introduce el precio del producto: ");
		double precio = scn.nextDouble();
		
		System.out.println("Introduce el stock disponible: ");
		int stock = scn.nextInt();
		
		return new ProductoOtaku(0, nombre, categoria, precio, stock);
    	
	}
	
	public ProductoOtaku leerProductoNuevo() {
		
		System.out.println("Introduce el nombre: ");
		String nombre = scn.nextLine();
		
		System.out.println("Introduce la categoría (Figura, Manga, Póster, Llavero, Ropa): ");
		String categoria = scn.nextLine();
		
		System.out.println("Introduce el precio del producto: ");
		double precio = scn.nextDouble();
		
		System.out.println("Introduce el stock disponible: ");
		int stock = scn.nextInt();
		
		return new ProductoOtaku(0, nombre, categoria, precio, stock);
	}
	
	public void mostrarProducto(ProductoOtaku producto) {
		
		if (producto != null) {
			
			System.out.println(producto);
			
		} else {
			
			System.out.println("Producto no encontrado");
		}
	}
	
	public void mostrarListaProductos(List<ProductoOtaku> lista) {
		
		if (lista.isEmpty()) {
			System.out.println("No hay productos");
			
		} else {
			
			for (ProductoOtaku producto : lista) {
				System.out.println(producto);
			}
		}
	}
	
	public int pedirId() {
		
		System.out.println("Ingrese el ID del producto: ");
		return scn.nextInt();
	}
	
	public String pedirNombre() {
		
		System.out.println("Ingrese el nombre del producto a buscar: ");
		return scn.nextLine();
	}
	
	public String pedirCategoria() {
		
		System.out.println("Ingrese la categoría del producto a buscar: ");
		return scn.nextLine();
	}
	
	public ProductoOtaku productoActualizado (int id) {

		scn.nextLine();

		System.out.println("Ingrese la ID a actualizar: " + id);
		
		System.out.println("Nuevo nombre: ");
		String nombre = scn.nextLine();
		
		System.out.println("Nueva categoría: ");
		String categoria = scn.nextLine();
		
		System.out.println("Nuevo precio: ");
		double precio = scn.nextDouble();
		
		System.out.println("Nuevo nº de stock: ");
		int stock = scn.nextInt();
				
		return new ProductoOtaku(id, nombre, categoria, precio, stock);
		
	}
	
	public void mostrarMensaje(String mensaje) {
		
		System.out.println(mensaje);
	}
	
}
