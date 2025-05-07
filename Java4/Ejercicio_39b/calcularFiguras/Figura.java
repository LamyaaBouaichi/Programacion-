package calcularFiguras;

public abstract class Figura {
	void mostrarAreaFigura() {
		System.out.println("Area de las figuras.");
	}
	
	abstract double calcularArea();
}
