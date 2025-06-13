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
		
		
		int opciones;
        do {
            System.out.println("\n--- MENÚ BIBLIOTECA ESCOLAR ---\n");
            System.out.println("1. Añadir material");
            System.out.println("2. Mostrar todos los materiales");
            System.out.println("3. Buscar material por código");
            System.out.println("4. Eliminar material");
            System.out.println("5. Salir\n");
            System.out.print("Selecciona una opción: ");
            opciones = scanner.nextInt();
            scanner.nextLine(); 

            switch (opciones) {
                case 1:
                    
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
            		
                    }
                    
                    break;

                case 2:
                    
                	System.out.println(" ----- Biblioteca ----- \n");
            		for (Biblioteca b : materiales) {
            			b.mostrar();
            		}
            		
                    break;

                case 3:
                    
                	System.out.println("Introduce el código que desea buscar: ");
            		String codigoABuscar = scanner.nextLine();
            		
            		boolean encontrar = false;
            		for (Biblioteca b : materiales) {
            			if (b.codigo.equals(codigoABuscar)) {
            				b.mostrar();
            				encontrar = true;
            				
            			}
            		}
            		
            		if (!encontrar) {
            			System.out.println("El código introducido no existe");
            		}
            		
                    break;

                case 4:
                	
                	System.out.println("Introduce el código a eliminar: ");
                    String codigoEliminado = scanner.nextLine();

                    Iterator<Biblioteca> it = materiales.iterator();
                    
                    while(it.hasNext()) {
                    	if (it.next().codigo.equals(codigoEliminado) ) {
                    		it.remove();
                    		System.out.println("Material eliminado de la biblioteca");
                    	}
                    }
                    
                    break;

                case 5:
                	
                    System.out.println("Saliendo de la aplicación...");
                    
                    break;

                default:
                	
                    System.out.println("Opción no válida.");
            }

        } while (opciones != 5);

        scanner.close();
		
	}

}
