package paqueteArray;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> tareas = new ArrayList<>();
		tareas.add("Tarea 1");
		tareas.add("Tareas 2");
		tareas.add("Tareas 3");
		tareas.add("Tareas 4");
		tareas.add("Tareas 5");
		
		System.out.println(tareas.get(2));
		tareas.remove("Tareas 3");
		System.out.println(tareas.size());
	}

}
