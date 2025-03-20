public class OperacionesBasicas {

    static int n1 = 25;
    static int n2 = 5;

    public static int sumar () {

        return n1 + n2;

    }

    public static int restar () {

        return n1 - n2;

    }

    public static int multiplicar () {

        return n1 * n2;

    }

    public static void dividir () {

	if (n2 != 0) {

            System.out.println("División: " + (n1 / n2));

        } else {

            System.out.println("No es posible dividir entre 0");

        }

    }

    public static void main(String[]args) {

        System.out.println("Suma: " + sumar());
	System.out.println("Resta: " + restar());
	System.out.println("Multiplicación: " + multiplicar());
	dividir();
    }

}
