package miVehiculo;

public class Principal {

	public static void main(String[] args) {
		Vehiculo v = new Vehiculo();
		v.describir();
		Coche c = new Coche("Toyota", "Corolla", 5);
		c.describir();
	}

}
