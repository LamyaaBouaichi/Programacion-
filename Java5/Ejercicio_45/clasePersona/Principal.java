package clasePersona;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona("Lamyaa", 20);
		Estudiante e = new Estudiante("Lamyaa", 20, "Programación");
		
		p.mostrarDatos();
		e.mostrarDatos();
	}

}
