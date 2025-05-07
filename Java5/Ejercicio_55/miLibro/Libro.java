package miLibro;

public class Libro {
	
	String titulo;
    Autor autor;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        autor.mostrarDatos();
    }
}
