package paqueteNomina;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, Empleado> empleados = new HashMap<>();
		
		empleados.put(01, new EmpleadoFijo(02, "E_Fijo", 2500));
		empleados.put(02, new EmpleadoPorHoras(02, "E_Por_Horas", 200, 10));

		for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
			Integer id = entry.getKey();
			Empleado empleado = entry.getValue();
			System.out.println("ID: " + id + ", Nombre: " + empleado.nombre + ", Salario Mensual: " + empleado.calcularSalarioMensual());
		}

	}

}
