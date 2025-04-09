package paquetePrimeraParte;

// Clase abtracta publica  
public abstract class Animal{
	
	// Atributos de la clase padre (Animal)
	int numChip;
	String nombre;
	int edad;
	String raza;
	boolean adoptado;
	
	//Constructor de la clase Animal 
	public Animal (int numChip, String nombre, int edad, String raza, boolean adoptado){
		this.numChip = numChip;
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.adoptado = adoptado;
	}
	
	//Metodo abtracto mostrar()
	public abstract void mostrar();
}
