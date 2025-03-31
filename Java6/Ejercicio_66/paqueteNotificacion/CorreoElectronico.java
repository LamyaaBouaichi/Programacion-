package paqueteNotificacion;

public class CorreoElectronico implements Notificable{
	public void enviarNotificacion() {
		System.out.println("Enviando un mensaje desde el Correo");
	}
}
