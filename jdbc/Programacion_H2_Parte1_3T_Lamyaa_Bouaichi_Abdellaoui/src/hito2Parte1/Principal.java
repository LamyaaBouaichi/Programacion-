package hito2Parte1;
import java.util.Scanner; // Uso de la librería de Scanner para poder escribir en el terminal

public class Principal {

	public static void main(String[] args) {
		
		// Hacemos uso de la librería
		
		Scanner scn = new Scanner(System.in);
		
		Conexion conexion = new Conexion();
		conexion.conexion();
		
		// Atributo que necesitamos para la selección del menu y el switch
		int opciones;
		
		do {
			// Menú que indica las opciones que hay.
			
			System.out.println("\n Gestor de Películas \n");
			System.out.println("1. Ver Películas \n");
			System.out.println("2. Agregar Películas \n");
			System.out.println("3. Editar Películas \n");
			System.out.println("4. Eliminar Películas \n");
			System.out.println("5. Salir \n");
			System.out.println("Eliga una opción\n");
			
			// Salto de linea
			opciones = scn.nextInt();
			
			switch (opciones) {
				
				case 1:
					// Usamos la clase LeerPelicula que ha sido creada
					System.out.println("\n PELÍCULAS \n");
					LeerPelicula ver = new LeerPelicula();
					ver.verPelicula();
					System.out.println("\n");
					
					break;
					
				case 2:
					
					System.out.println("Ingrese la película");
					break;
					
				case 3:
					
					System.out.println("Edite la película");
					break;
					
				case 4:
					
					System.out.println("Elimina la ID de la película");
					break;
					
				case 5:
					
					// Mensaje que indica la salida de la aplicación.
					System.out.println("Saliendo de la aplicacion...");
					break;
					
				default:
					
					// Opción predeterminada en el caso que no sean los números del 1 al 5
					
					System.out.println("Opción no válida. Elija una de las opciones.");
					break;
			
			}
			
		} while (opciones != 5); // Finalizar el bucle si seleccionamos en número 5
		
		scn.close(); // Cerramos el Scanner.
	}

}
