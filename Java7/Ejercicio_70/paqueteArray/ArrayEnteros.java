package paqueteArray;
import java.util.Scanner;

public class ArrayEnteros implements Muestra{
	Scanner scn = new Scanner(System.in);
	
	@Override
	public void mostrarDatos() {
		int[] numeros = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese 5 números enteros: ");
			numeros[i] = scn.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
