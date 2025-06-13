package paqueteMaterial;

public class Libro extends Biblioteca{
	String autor;
	int paginas;
	
	public Libro(String codigo, String titulo, int anio, String autor, int paginas) {
		super(codigo, titulo, anio);
		this.autor = autor;
		this.paginas = paginas;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Libro - Código: " + codigo + ", Título: " + titulo + ",  Año: " + anio + ", Autor: " + autor + ", Páginas: " + paginas);
	}
}
