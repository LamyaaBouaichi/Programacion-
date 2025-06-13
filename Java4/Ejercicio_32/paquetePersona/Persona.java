package paquetePersona;

public class Persona {
	String nombre;
	int edad;
	
	public Persona() {
		this.nombre = "Desconocido";
		this.edad = 0;
		
		System.out.println("Me llamo " + nombre + ", tengo " + edad + " años.");
	}
	
	public Persona(String nombre) {
		this.nombre = "Desconocido";
		this.edad = 0;
		
		System.out.println("Me llamo " + nombre + ", tengo " + edad + " años.");

	}
	
	public Persona(String nombre, int edad) {
		this.nombre = "Desconocido";
		this.edad = 20;
		
		System.out.println("Me llamo " + nombre + ", tengo " + edad + " años.");

	}
}
