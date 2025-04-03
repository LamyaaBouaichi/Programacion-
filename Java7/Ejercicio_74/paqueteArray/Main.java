package paqueteArray;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> edad = new HashMap<>();
		edad.put("Nombre1", 20);
		edad.put("Nombre2", 19);
		
		System.out.println(edad.get("Nombre1"));
	}

}
