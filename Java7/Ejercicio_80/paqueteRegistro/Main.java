package paqueteRegistro;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Movible> vehiculos =  new ArrayList<>();
		
		// ---------- //
		vehiculos.add(new Coche ("1234-MVP"));
		vehiculos.add(new Coche ("2454-GGS"));
		vehiculos.add(new Bicicleta ("9339"));
		vehiculos.add(new Bicicleta ("0010"));
		
		for (Movible vehiculo : vehiculos) {
			vehiculo.mover();
		}
		
	}

}
