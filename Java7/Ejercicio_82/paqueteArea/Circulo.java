package paqueteArea;
import java.lang.Math;

public class Circulo extends Figura implements Calculable{
	
	double radio;
	
	public Circulo (String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * radio * radio;
	}
}
