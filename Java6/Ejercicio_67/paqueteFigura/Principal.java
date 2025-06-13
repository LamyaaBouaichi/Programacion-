package paqueteFigura;

public class Principal {

	public static void main(String[] args) {
		Figura cuadrado = new Cuadrado();
		cuadrado.calcularArea();
		
		Figura triangulo = new Triangulo();
		triangulo.calcularArea();
	}

}
