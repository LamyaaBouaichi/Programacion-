package paquetePrimeraParte;

public class Adopcion extends Animal{
	String nombre;
	String dni;
	
	public Adopcion (int numChip, String nombre, String dni) {
		super(numChip);
		this.nombre = nombre;
		this.dni = dni;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Nº Chip: " + numChip + " Nombre: " + nombre + " DNI: " + dni);
	}
}
