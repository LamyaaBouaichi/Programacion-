package paquetePrimeraParte;

// Clase abstracta que hereda de Animal
public class Perro extends Animal{
	
	// Atributo exclusivo de Perro
	String tamPerro;
	
	// Constructor de Perro
	public Perro(int numChip, String nombre, int edad, String raza, boolean adoptado, String tamPerro) {
		super(numChip, nombre, edad, raza, adoptado);
		this.tamPerro = tamPerro;
	}
	
	// Uso del metodo mostrar() para imprimir los atributos de la clase Perro
	@Override
	public void mostrar() {
		System.out.println("NºChip: " + numChip + ", Nombre: " + nombre + ", Edad: " + edad + 
				", Raza: " + raza + ", Adoptado: " + adoptado + ", Tamaño: " + tamPerro);
	}
}
