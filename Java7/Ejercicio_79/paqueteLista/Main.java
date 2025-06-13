package paqueteLista;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Nombre 1");
		nombres.add("Nombre 2");
		nombres.add("Nombre 3");
		nombres.add("Nombre 4");
		nombres.add("Nombre 5");
		
		for(String nombre : nombres) {
			System.out.println(nombre.toUpperCase());
		}

	}

}
