package paqueteNomina;

public class EmpleadoPorHoras extends Empleado implements Pagable{
	double horasTrabajadas;
	double tarifaHoras;
	
	public EmpleadoPorHoras(int id, String nombre, double horasTrabajadas, double tarifaHoras) {
		super(id, nombre);
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHoras = tarifaHoras;
	}
	
	@Override
	public double calcularSalarioMensual(){
		return horasTrabajadas * tarifaHoras;
	}
}
