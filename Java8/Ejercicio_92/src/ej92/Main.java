package ej92;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		Animal a = new Animal("Gato", "Felino");
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("animal.ser"));
			out.writeObject(a);
			out.close();
			System.out.println("Animal guardado correctamente.");
			
		} catch (IOException e) {
			
			System.out.println("Error al guardar animal: " + e.getMessage());
			
		}
		
		// -----------------------------------------------------------------------------------------
		
		try {
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("animal.ser"));
            Animal animal = (Animal) in.readObject();
            in.close();
            System.out.println("Datos del animal recuperados:");
            System.out.println("Nombre: " + animal.nombre);
            System.out.println("Especie: " + animal.especie);
            
			
		} catch (IOException | ClassNotFoundException e) {
			
			System.out.println("Error leyendo el objeto: " + e.getMessage());
			
		}
		
	}

}
