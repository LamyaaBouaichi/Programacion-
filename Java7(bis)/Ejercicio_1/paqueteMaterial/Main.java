package paqueteMaterial;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		ArrayList<Biblioteca> materiales = new ArrayList<>();
		materiales.add(new Libro("L001", "Programación en Java", 2021, "Ana García", 350)); 
		materiales.add(new Revista("R010", "Ciencia Escolar", 2023, 12, true)); 
		materiales.add(new Libro("L002", "Matemáticas Básicas", 2019, "Carlos Ruiz", 200)); 
		materiales.add(new Revista("R011", "Arte y Diseño", 2022, 7, false));
		
		
		System.out.println("Introduce el código del libro/revista: ");
        String codigo = scanner.nextLine();

        boolean existe = false;
        for (Biblioteca b : materiales) {
            if (b.codigo.equals(codigo)) {
                existe = true;
                break;
            }
        }
        
        if (existe) {
            
        	System.out.println("Ya existe un material con ese código");
            
        } else {
		
			System.out.println("Introduce el título: ");
			String titulo = scanner.next();
			scanner.nextLine();
	
			
			System.out.println("Introduce el año: ");
			int anio = scanner.nextInt();
			scanner.nextLine();
	
			
			System.out.println("Es un: 1-> Libro o 2-> Revista ");
			int opcion = scanner.nextInt();
			scanner.nextLine();
	
			
			if (opcion == 1) {
				System.out.println("Introduce el autor: ");
				String autor = scanner.next();
				scanner.nextLine();
	
				
				System.out.println("Introduce las páginas que tiene el libro: ");
				int paginas = scanner.nextInt();
				scanner.nextLine();
	
				
				Biblioteca libro = new Libro(codigo, titulo, anio, autor, paginas);
				libro.mostrar();
				
			} else if (opcion == 2) {
				System.out.println("Número de ediciones: ");
				int numEdicion = scanner.nextInt();
				
				
				System.out.println("Mensualidad: ");
				boolean mensual = scanner.nextBoolean();
				scanner.nextLine();
	
				
				Biblioteca revista = new Revista(codigo, titulo, anio, numEdicion, mensual);
				revista.mostrar();
				
			} else {
				System.out.println("Opción no válida");
			}
			
		scanner.close();
		
        }
		
	}

}
