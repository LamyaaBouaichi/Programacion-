package paqueteNotificacion;

public class MensajeTexto implements Notificable{
	public void enviarNotificacion() {
		System.out.println("Enviando un mensaje desde el mensaje de texto");
	}
}
