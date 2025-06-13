package comparadorNumero;

public class Comparador {

    public void compararNumeros () {

	int a = 5;
	int b = 8;
	
	boolean mayor = (a > b);
	System.out.println("¿Es el número " + a + " mayor a " + b + " ?: " + mayor);

	boolean menor = (a < b);
	System.out.println("¿Es el número " + a + " menor a " + b + " ?: " + menor);

	boolean igual = (a == b);
	System.out.println("¿Es el número " + a + " igual a " + b + " ?: " + igual);
	
    }
}
	