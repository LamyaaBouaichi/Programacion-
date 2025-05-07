public class Operaciones {

    int num1 = 68;
    int num2 = 7;
    int resultado;

    public void Suma() {

        resultado = num1 + num2;
 	System.out.println("Suma: " + resultado);

    }

    public void Resta() {

        resultado = num1 - num2;
 	System.out.println("Resta: " + resultado);

    }

    public void Multiplicacion() {

        resultado = num1 * num2;
 	System.out.println("Multiplicación: " + resultado);

    }

    public void Division() {

	if (num2 != 0) {

            resultado = num1 + num2;
       	    System.out.println("Resultado: " + resultado);

	} else {

	    System.out.println("No es posible dividir entre 0");
	}

    }

    public static void main (String[]args) {
	
	Operaciones s = new Operaciones();
	s.Suma();

	Operaciones r = new Operaciones();
	r.Resta();

	Operaciones m = new Operaciones();
	m.Multiplicacion();

	Operaciones d = new Operaciones();
	d.Division();

    }

}