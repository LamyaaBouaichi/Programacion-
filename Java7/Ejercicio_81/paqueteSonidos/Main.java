package paqueteSonidos;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<>();
		
		animales.add(new Perro("Zam"));
		animales.add(new Gato("Roman"));
		
		for (Animal animal : animales) {
			System.out.println("Soy " + animal.nombre);
			System.out.println(animal.hacerSonido() + "\n");
		}
	}

}
