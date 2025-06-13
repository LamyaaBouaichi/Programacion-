package misElectrodomesticos;

public class Principal {

	public static void main(String[] args) {
		Lavadora l = new Lavadora("Samsung", 699.99, 8);
		l.mostrarDatos();
		
		Televisor v = new Televisor("LG", 899.99, 80);
		v.mostrarDatos();
	}

}
