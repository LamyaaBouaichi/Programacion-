package paqueteArrayInverso;

public class ArrayInverso implements Muestra{
	@Override
	public void mostrarDatos() {
		String[] nombres = {"Rania", "Dris", "Sanah"};
		
		for (int i = nombres.length -1; i >= 0; i--) {
			System.out.println(nombres[i]);
		}
	}
}
