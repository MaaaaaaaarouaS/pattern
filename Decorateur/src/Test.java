
public class Test {
	public static void main(String[] args) {

		//Notificateur personnalisé ayant tous les 3
		Notificateur n1 = new EmailNotificateur();
		n1 = new SMSNotificateur(n1);
		n1 = new FacebookNotificateur(n1);
		
		n1.send("");
		System.out.println(".............");

		//Notificateur personnalisé ayant facebook et sms
		Notificateur n2 = new EmailNotificateur();
		n2 = new SMSNotificateur(n2);
		
		n2.send("");
		System.out.println(".............");

		//Notificateur personnalisé ayant tous les 3
		Notificateur n3 = new EmailNotificateur();
		n3 = new FacebookNotificateur(n3);
		
		n3.send("");
		System.out.println(".............");
		

		//Notificateur personnalisé ayant tous les 3
		Notificateur n4 = new EmailNotificateur();
		
		n4.send("");
	}
}
