
public class FacebookNotificateur extends NotificateurPersonnalis� {

	public FacebookNotificateur(Notificateur n) {
		super(n);
	}

	@Override
	public void send(String message) {
		super.send(message);
		System.out.println("Notification facebook envoy�e!");
	}

}
