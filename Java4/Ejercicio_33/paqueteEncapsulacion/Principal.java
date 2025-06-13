package paqueteEncapsulacion;

public class Principal {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar();
		cuenta.retirar();
		System.out.println("Tiene una cantidad en la cuenta de " + cuenta.getSaldo() + " €");
	}

}
