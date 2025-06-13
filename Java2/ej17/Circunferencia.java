public class Circunferencia {

    public void calcularCircunferencia() {

        final double PI = 3.1416;
	int radio = 25;
	double cirunferencia = 2 * PI * radio;
	
	System.out.println("La circunferencia de radio 25 es de: " + cirunferencia);

    }

    public static void main (String[] args) {

        Circunferencia cir = new Circunferencia();
	cir.calcularCircunferencia();

    }

}