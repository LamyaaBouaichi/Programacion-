package paqueteFigura;

public class Cuadrado implements Figura{
	double base = 5;

	public double mostrarDatos() {
		return base * 2; 
	}
	
	public void calcularArea() {
		System.out.println("Area del cuadrado: " + mostrarDatos());
	}
}
