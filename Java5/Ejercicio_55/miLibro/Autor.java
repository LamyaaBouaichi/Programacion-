package miLibro;

public class Autor {
	
	 String nombre;
	 String nacionalidad;

	 public Autor(String nombre, String nacionalidad) {
	     this.nombre = nombre;
	     this.nacionalidad = nacionalidad;
	 }

	 public void mostrarDatos() {
	     System.out.println("Autor: " + nombre + "\nNacionalidad: " + nacionalidad);
	 }
}
