package paqueteMaterial;

public abstract class Biblioteca {
	String codigo;
	String titulo;
	int anio;
	
	public Biblioteca(String codigo, String titulo, int anio) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anio = anio;
	}
	
	public void mostrar() {
		System.out.println();
	}
}
