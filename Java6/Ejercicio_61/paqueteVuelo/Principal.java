package paqueteVuelo;

public class Principal {

	public static void main(String[] args) {
		Volador a = new Avion();
		a.volar();
		
		Volador p = new Pajaro();
		p.volar();
	}

}
