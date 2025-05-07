package misFiguras;

public class Principal {

	public static void main(String[] args) {
		Figura c = new Circulo(7);
		System.out.println("Area de la figura: " + c.calcularArea());
		
		Figura r = new Rectangulo(4, 5);
		System.out.println("Area de la figura: " + r.calcularArea());
		
		Figura cu = new Cuadrado(8);
		System.out.println("Area de la figura: " + cu.calcularArea());
		
		Figura t = new Triangulo(2, 6);
		System.out.println("Area de la figura: " + t.calcularArea());
		
	}

}
