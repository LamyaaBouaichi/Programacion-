public class Comparador {

    public void comparar() {

	int a = 5;
	int b = 8;

	if (a > b) {

	    System.out.println("El número mayor es: " + a);

	} else if (b > a) {

	    System.out.println("El número mayor es: " + b);

	} else {

	    System.out.println("Los dos números " + a + " y " + b + " son iguales");

	}

    }

    public static void main(String[] args) {

	Comparador comp = new Comparador();
	comp.comparar();

    }

}