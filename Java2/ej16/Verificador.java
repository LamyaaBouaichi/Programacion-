public class Verificador {

    public void esMayorYPar() {

	int numero = 19;
	
	if (numero > 10 && numero % 2 == 0) {

	    System.out.println("El número " + numero + " es mayor que 10 y es par");

	} else if (numero < 10 && numero % 2 == 0) {

	    System.out.println("El número " + numero + " no es mayor que 10 y es par");

	} else if (numero > 10 && numero % 2 != 0) {

	    System.out.println("El número " + numero + " es mayor que 10 y no es par");

	} else {
	
	    System.out.println("El número " + numero + " no cumple las dos condiciones");
        }

    }

    public static void main (String[] args) {

        Verificador ver = new Verificador();
	ver.esMayorYPar();

    }

}

	