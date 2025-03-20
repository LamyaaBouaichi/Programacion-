public class Conversor {

    public void convertirDoubleAInt() {

        double num = 3.6;
        int numero = (int) num;
	System.out.println("El numero " + num + " sin decimales es " + numero);

    }

    public static void main (String[] args) {

	Conversor cambio = new Conversor();
	cambio.convertirDoubleAInt();

    }

}