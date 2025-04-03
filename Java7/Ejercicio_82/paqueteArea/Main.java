package paqueteArea;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Calculable> areas = new ArrayList<>();
		
		areas.add(new Circulo("Verde", 8));
		areas.add(new Rectangulo("Amarillo", 4, 5));
		
		double areaFinal = 0;
		for(Calculable area : areas) {
			areaFinal += area.calcularArea();
		}
		
		System.out.println("Resultado de las areas: " + areaFinal);
		
	}

}
