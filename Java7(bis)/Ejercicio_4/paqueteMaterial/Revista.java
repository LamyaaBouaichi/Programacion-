package paqueteMaterial;

public class Revista extends Biblioteca{
	
	int numEdicion;
	boolean mensual;
	
	public Revista(String codigo, String titulo, int anio, int numEdicion, boolean mensual) {
		super(codigo, titulo, anio);
		this.numEdicion = numEdicion;
		this.mensual = mensual;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Revista - Código: " + codigo + ", Título: " + titulo + ",  Año: " + anio + ", Nº edición: " + numEdicion + ", Mensual: " + mensual);
	}
}
