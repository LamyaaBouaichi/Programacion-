package dosInterfaces;

public class Artista implements Cantante, Bailarin{
	public void cantar() {
		System.out.println("Un artista canta");
	}
	
	public void bailar() {
		System.out.println("Un artista también baila");
	}
}
