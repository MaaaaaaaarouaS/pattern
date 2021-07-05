
public class SMSNotificateur extends NotificateurPersonnalisé{

	public SMSNotificateur(Notificateur n) {
		super(n);
	}

	@Override
	public void send(String message) {
		super.send(message);
		System.out.println("Notification SMS envoyée!");
		
	}
	
}
