package ej90;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int num1;
		int num2;
		
		try {
			System.out.println("Introduce el número para el dividendo: ");
			num1 = scanner.nextInt();
			
			System.out.println("Introduce el número para el divisor: ");
			num2 = scanner.nextInt();
			
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
			
			scanner.close();
			
		} catch (ArithmeticException e) {
			
			System.out.println("Error: no es posible dividir entre 0");
		}
		
	}

}
