package miVehiculo;

public class Coche extends Vehiculo{
	
	public int nPuertas;

    public Coche(String marca, String modelo, int nPuertas) {
        super(marca, modelo);
        this.nPuertas = nPuertas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de puertas: " + nPuertas);
    }
}
