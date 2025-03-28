package misAnimales;

public class Principal {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.hacerSonido();
		
		Animal p = new Perro();
		p.hacerSonido();
		
		Animal g = new Gato();
		g.hacerSonido();

	}

}
