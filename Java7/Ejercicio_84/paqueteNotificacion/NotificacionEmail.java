package paqueteNotificacion;

public class NotificacionEmail implements Notificable {
	String direccionCorreo;
	
	public NotificacionEmail(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}
	
	@Override
	public void enviar(String mensaje) {
		System.out.println("Direccion Email: " + direccionCorreo + "\nMensaje: " + mensaje);
	}
	
}
