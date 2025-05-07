package clasePersona;

public class Principal {

	public static void main(String[] args) {
		
		Persona e = new Persona("Lamyaa", 20);
		e.mostrarDatos();
		
		Persona p = new Profesor("Profe", 45, "Programacion");
		p.mostrarDatos();
	}

}
