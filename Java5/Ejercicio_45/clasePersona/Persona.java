package clasePersona;

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void getNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void getEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.println("Me llamo " + nombre + ", y tengo " + edad + " años.");
	}
}
