package paqueteFrutas;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<>();
		frutas.add("Platano");
		frutas.add("Fresa");
		frutas.add("Naranja");
		
		Iterator<String> iter = frutas.iterator();
		while(iter.hasNext( )) {
			String fruta = iter.next();
			if (fruta.equals("Naranja")) {
				iter.remove();
			}
			System.out.print("\n" + frutas);
		}
	}
}
