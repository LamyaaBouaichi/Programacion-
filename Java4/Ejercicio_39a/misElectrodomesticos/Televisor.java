package misElectrodomesticos;

public class Televisor extends Electrodomesticos {
	int pulgadas;
	
	public Televisor(String marca, double precio, int pulgadas) {
		this.marca = marca;
		this.precio = precio;
		this.pulgadas = pulgadas;
	}
		
	void mostrarDatos() {
		System.out.println("- Marca: " + marca + "\n- Precio: " + precio + "\n- Pulgadas: " + pulgadas);
	}
}
