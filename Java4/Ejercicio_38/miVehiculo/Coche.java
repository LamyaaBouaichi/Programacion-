package miVehiculo;

public class Coche extends Vehiculo {
	
	int puertas;

	public Coche(String marca, String modelo, int puertas) {
		this.marca = marca;
		this.modelo = modelo;
		this.puertas = puertas;
	}
	
	public void mostrarDatos() {
		System.out.println("- Marca: " + marca + "\n- Modelo: " + modelo + "\n- Puertas: " + puertas);
	}
	
	@Override
	void describir() {
		System.out.println("Soy un coche de marca " + marca + " y modelo " + modelo);
	}
}
