package ej93;
import java.io.*;

public class SumaNumeros {
	
	public void sumaNum() {
		
		int suma = 0;
		
		if  (!new File("numeros.txt").exists()) {
			
			try {
				
				FileWriter escritor = new FileWriter("numeros.txt");
				escritor.write("45\n");
				escritor.write("5\n");
				escritor.close();
				
				System.out.println("Archivo escrito con éxito\n");
				
			} catch (IOException e) {
				
				System.out.println("Error al escribir el archivo: " + e.getMessage());
				
			}
			
		}
		
		// ----------------------------------------------------------------------------
		
		try {
			BufferedReader lector = new BufferedReader(new FileReader("numeros.txt"));
			String linea;
			
			while ((linea = lector.readLine()) != null) {
				suma += Integer.parseInt(linea);
			}
			lector.close();
			System.out.println("La suma de los números son: " + suma);
			
		} catch (IOException e) {
			
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }

	}
}
