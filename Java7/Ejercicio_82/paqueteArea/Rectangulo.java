package paqueteArea;

public class Rectangulo extends Figura implements Calculable{
	
	double ancho;
	double alto;
	
	public Rectangulo(String color, double ancho, double alto) {
		super(color);
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public double calcularArea() {
		return ancho * alto;
	}
}
