
public abstract class NotificateurPersonnalisé extends Notificateur {
	Notificateur notificateur;

	public NotificateurPersonnalisé(Notificateur n) {
		notificateur = n;
	}
	
	public void send(String message) {
		notificateur.send(message);
	}	
}
