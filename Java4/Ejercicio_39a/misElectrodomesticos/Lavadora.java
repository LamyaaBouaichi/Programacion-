package misElectrodomesticos;

public class Lavadora extends Electrodomesticos{
	int capacidadKg;
	
	public Lavadora(String marca, double precio, int capacidadKg) {
		this.marca = marca;
		this.precio = precio;
		this.capacidadKg = capacidadKg;
	}
	
	@Override
	void mostrarDatos() {
		System.out.println("- Marca: " + marca + "\n- Precio: " + precio + "\n- Capacidad en Kg: " + capacidadKg + "\n");
	}
}
