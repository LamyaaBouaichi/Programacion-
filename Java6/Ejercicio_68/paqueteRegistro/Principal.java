package paqueteRegistro;

public class Principal {

	public static void main(String[] args) {
		Logger logger = new ConsolaLogger();
		
		logger.registrar("Usuario registrado");
		logger.separador();
	}

}
