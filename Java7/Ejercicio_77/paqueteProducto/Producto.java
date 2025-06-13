package paqueteProducto;
import java.util.HashMap;
import java.util.Map;

public class Producto {
	public void precioMayor() {
		HashMap<String, Integer> precios = new HashMap<>();
		precios.put("Smartphone", 550);
		precios.put("Teclado", 120);
		precios.put("Targeta regalo", 20);
		
		for (Map.Entry<String, Integer> entry : precios.entrySet()) {
			
			String nombre = entry.getKey();
			Integer precio = entry.getValue();
			
			if(precio >= 50 ) {
				System.out.println("Nombre: " + nombre + ", Precio: " + precio);
			}
		}
	}
}
