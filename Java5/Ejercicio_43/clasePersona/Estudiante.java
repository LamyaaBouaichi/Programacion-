package clasePersona;

public class Estudiante extends Persona {
	private String curso;
	
	public Estudiante(String nombre, int edad, String curso) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Me llamo " + nombre + ", tengo " + edad + " años y mi curso es " + curso);
	}
}
