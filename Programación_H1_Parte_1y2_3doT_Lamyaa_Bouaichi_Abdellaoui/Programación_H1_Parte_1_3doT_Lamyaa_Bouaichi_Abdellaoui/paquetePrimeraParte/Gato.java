package paquetePrimeraParte;

//Clase abstracta que hereda de Animal
public class Gato extends Animal{
	
	// Atributo exclusivo de Gato
	boolean leucemia;
	
	// Constructor de Gato
	public Gato(int numChip, String nombre, int edad, String raza, boolean adoptado, boolean leucemia) {
		super(numChip, nombre, edad, raza, adoptado);
		this.leucemia = leucemia;
	}
	
	// Uso del metodo mostrar() para imprimir los atributos de la clase Gato
	@Override
	public void mostrar() {
		System.out.println("NºChip: " + numChip + ", Nombre: " + nombre + ", Edad: " + edad + 
				", Raza: " + raza + ", Adoptado: " + adoptado + ", ¿Tiene leucemia?: " + leucemia);
	}
	
}
