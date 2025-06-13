package paqueteNotificacion;

public class Principal {

	public static void main(String[] args) {
		Notificable correo = new CorreoElectronico();
		correo.enviarNotificacion();
		
		Notificable mensaje = new MensajeTexto();
		mensaje.enviarNotificacion();
	}

}
