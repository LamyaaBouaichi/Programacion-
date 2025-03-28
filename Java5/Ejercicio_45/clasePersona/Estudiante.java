package clasePersona;

public class Estudiante extends Persona {
	private String curso;
	
	public Estudiante(String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Mi curso es " + curso);
	}
}
