package paqueteNomina;

public abstract class Empleado implements Pagable{
	int id;
	String nombre;
	
	public Empleado(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

}
