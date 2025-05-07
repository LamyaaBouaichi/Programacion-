package paqueteColores;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		HashSet<String> colores = new HashSet<>();
		
		colores.add("Azul");
		colores.add("Amarillo");
		colores.add("Verde");
		colores.add("Azul");
		
		System.out.println(colores.size());
	}

}
