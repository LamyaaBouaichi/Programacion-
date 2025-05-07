package paqueteNotificacion;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Notificable> notif = new LinkedList<>();
		
		String mensaje = "Envio de mensaje";
		
		notif.add(new NotificacionEmail("correo_de@ejemplo.com"));
		notif.add(new NotificacionSMS("678125439"));
		
		for(Notificable noti : notif) {
			noti.enviar(mensaje);
		}
	}
}
