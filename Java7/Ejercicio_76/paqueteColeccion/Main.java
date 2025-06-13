package paqueteColeccion;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(230);
		numeros.add(33);
		numeros.add(57);
		
		Collections.sort(numeros);
		System.out.println(numeros);
	}

}
