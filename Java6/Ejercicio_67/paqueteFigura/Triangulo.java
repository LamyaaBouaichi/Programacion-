package paqueteFigura;

public class Triangulo implements Figura{
	double base = 8;
	double altura = 4.5;
	
	public double mostrarDatos() {
		return base*altura/2;
	}
	
	public void calcularArea() {
		System.out.println("Area del triangulo: " + mostrarDatos());
	}
}
