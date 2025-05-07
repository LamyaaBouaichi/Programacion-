import java.util.Scanner;

public class Verificador {

    public static boolean esPositivoYPar(int numero) {

	return numero > 0 && numero % 2 == 0;

    }

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.println("Introduce un número para comprobar si es positivo y par: ");
	int numero = scanner.nextInt();

	boolean respuesta = esPositivoYPar(numero);
	System.out.println("¿Es el número " + numero + " es positivo y par? -> " + respuesta);

    }

}