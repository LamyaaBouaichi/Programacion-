package ej91;
import java.io.*;

public class LecturaMensaje {
	
	public void leerMensaje() {
		
		try {
            BufferedReader lector = new BufferedReader(new FileReader("mensaje.txt"));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println("Enviado: " + linea);
            }
            lector.close();
            
        } catch (IOException e) {
        	
            System.out.println("Error al leer: " + e.getMessage());
        }
		
	}
}
