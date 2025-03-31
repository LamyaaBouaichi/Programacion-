package dosInterfaces;

public class Principal {

	public static void main(String[] args) {
		Cantante c = new Artista();
		c.cantar();
		
		Bailarin b = new Artista();
		b.bailar();
	}

}
