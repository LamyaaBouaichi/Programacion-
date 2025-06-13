package main;
// Inportar los paquetes dentro del paquete main

import com.akihabara.market.dao.ProductoDAO;
import com.akihabara.market.model.ProductoOtaku;
import com.akihabara.market.view.InterfazConsola;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ProductoDAO dao = new ProductoDAO();
		InterfazConsola vista = new InterfazConsola();

		int opcion;
		
		do {
			
			opcion = vista.menuPrincipal();
			
			switch (opcion) {
			
				case 1:
					ProductoOtaku productoNuevo = vista.leerProductoNuevo();
					dao.agregarProducto(productoNuevo);
					vista.mostrarMensaje("\nProducto agregado");
					break;
					
				case 2:
					ProductoOtaku productoNuevoIa = vista.sugerirNombreProducto();
					dao.agregarProducto(productoNuevoIa);
					vista.mostrarMensaje("\nProducto agregado");
					break;
					
				case 3:
					int id = vista.pedirId();
					ProductoOtaku productoId = dao.obtenerProductoPorId(id);
					vista.mostrarProducto(productoId);
					break;
					
				case 4:
					List<ProductoOtaku> todosProductos = dao.obtenerTodosLosProductos();
					vista.mostrarListaProductos(todosProductos);
					break;
					
				case 5:
					String nombre = vista.pedirNombre();
					List<ProductoOtaku> productoNombre = dao.buscarProductoPorNombre(nombre);
					vista.mostrarListaProductos(productoNombre);
					break;
					
				case 6:
					String categoria = vista.pedirCategoria();
					List<ProductoOtaku> productoCategoria = dao.buscarProductoPorCategoria(categoria);
					vista.mostrarListaProductos(productoCategoria);
					break;
					
				case 7:
					int idActulizado = vista.pedirId();
					ProductoOtaku productoActualizado = vista.productoActualizado(idActulizado);
					if(dao.actualizarProducto(productoActualizado)) {
						vista.mostrarMensaje("Producto actualizado");
					}
					break;
					
				case 8:
					int idEliminado = vista.pedirId();
					if(dao.eliminarProducto(idEliminado)) {
						vista.mostrarMensaje("Producto eliminado");
					}
					break;
					
				case 9:
					System.out.println("Saliendo de la aplicación");
					break;
					
				default:
					System.out.println("Opción no válida");
				
			} 
		} while (opcion != 9);
	}

}
