package clasePersona;

public class Profesor extends Persona{
	private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Asignatura: " + asignatura);
    }
}
