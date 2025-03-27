package paqueteEncapsulacion;
import java.util.Scanner;

public class CuentaBancaria {
	
	Scanner scanner = new Scanner (System.in);
	private double saldo = 3000;
	double cantidad; 
	
	public double depositar () {
		System.out.println("Ingrese la cantidad que desea depositar ");
		cantidad = scanner.nextDouble();
		
		saldo += cantidad;
		return saldo;
	}
	
	public double retirar() {
		if (saldo >= cantidad) {
			System.out.println("Ingrese la cantidad que desea retirar ");
			cantidad = scanner.nextDouble();
			
			saldo -= cantidad;
		} else {
			System.out.println("No es posible retirar un saldo mayor al de la cuenta");
		}
		return saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
