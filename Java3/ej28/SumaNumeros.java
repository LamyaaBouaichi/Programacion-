import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	
	int sumaN = 0;
	int n = 0;

	do {
 	 
	    System.out.println("Ingrese un número y/o finaliza con 0: ");
	    n = numero.nextInt();
	    sumaN += n;

	} while (n != 0);
		
	    System.out.println("La suma de todos los numeros es: " + sumaN);

    }

}
	    