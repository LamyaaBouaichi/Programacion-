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
		
		
		System.out.println("Introduce el código a eliminar: ");
        String codigoEliminado = scanner.nextLine();

        Iterator<Biblioteca> it = materiales.iterator();
        
        while(it.hasNext()) {
        	if (it.next().codigo.equals(codigoEliminado) ) {
        		it.remove();
        		System.out.println("Material eliminado de la biblioteca");
        	}
        }
		
        scanner.close();
	}

}
