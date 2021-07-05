
public class FacebookNotificateur extends NotificateurPersonnalisé {

	public FacebookNotificateur(Notificateur n) {
		super(n);
	}

	@Override
	public void send(String message) {
		super.send(message);
		System.out.println("Notification facebook envoyée!");
	}

}
