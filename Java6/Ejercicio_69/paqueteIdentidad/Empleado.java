package paqueteIdentidad;

public class Empleado implements Identificable{
	
	@Override
	public void mostrarIdentidad(String nombre, int id) {
		System.out.println("Nombre: " + nombre + "\nID: " + id);
	}
}
