
public class SMSNotificateur extends NotificateurPersonnalis�{

	public SMSNotificateur(Notificateur n) {
		super(n);
	}

	@Override
	public void send(String message) {
		super.send(message);
		System.out.println("Notification SMS envoy�e!");
		
	}
	
}
