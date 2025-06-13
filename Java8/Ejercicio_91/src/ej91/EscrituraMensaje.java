package ej91;
import java.io.*;
import java.util.Scanner;

public class EscrituraMensaje {
	
	public void escribirMensaje() {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Escriba su mensaje: ");
		String mensaje = scn.nextLine();
		
		try {
			FileWriter escritor = new FileWriter("mensaje.txt");
			escritor.write(mensaje + "\n");
			escritor.close();
			System.out.println("Mensaje enviado");
			
		} catch (IOException e) {
			
			System.out.println("Error al escribir el mensaje " + e.getMessage());
		}
		
		scn.close();
	}
	
}
