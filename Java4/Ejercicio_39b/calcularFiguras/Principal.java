package calcularFiguras;

public class Principal {

	public static void main(String[] args) {
		Figura circulo = new Circulo(25);
		Figura rectangulo = new Rectangulo(5, 20);
		
		circulo.mostrarAreaFigura();
		System.out.println("Area del circulo: " + circulo.calcularArea());
		
		System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
	}

}
