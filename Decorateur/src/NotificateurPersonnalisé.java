
public abstract class NotificateurPersonnalis� extends Notificateur {
	Notificateur notificateur;

	public NotificateurPersonnalis�(Notificateur n) {
		notificateur = n;
	}
	
	public void send(String message) {
		notificateur.send(message);
	}	
}
