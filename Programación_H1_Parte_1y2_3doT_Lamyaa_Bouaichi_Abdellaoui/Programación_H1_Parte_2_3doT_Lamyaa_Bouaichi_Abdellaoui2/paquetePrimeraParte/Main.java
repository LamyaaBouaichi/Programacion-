package paquetePrimeraParte;
// Importar la libreria java.util
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Perro> perros;
		ArrayList<Gato> gatos;
		
		System.out.println("--- Menu ---");
		System.out.println("1 - Dar de alta animal");
		System.out.println("2 - Listar animales");
		System.out.println("3 - Buscar animal");
		System.out.println("4 - Realizar adopción");
		System.out.println("5 - Dar de baja");
		System.out.println("6 - Mostrar estadísticas de gatos");
		System.out.println("7 - Salir");
		System.out.println("Elige una opción: ");
		int opcion = scanner.nextInt();
		scanner.nextLine();
		
		while (true) {
			if (opcion == 1) {
				System.out.println("¿Es un perro o un gato?: ");
				String animal = scanner.next();
				
				if (animal == "perro") {
					
					System.out.println("Numero del Chip: ");
					int numChip = scanner.nextInt();
					
				}
				
				
			} else if (opcion == 2) {
				
			} else if (opcion == 3) {
				
			} else if (opcion == 4) {
				
			} else if (opcion == 5) {
				
			} else if (opcion == 6) {
				
			} else if (opcion == 7) {
				
			} else {
				
			}
		}
		
	}
	
}
