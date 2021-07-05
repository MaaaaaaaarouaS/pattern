package Magazine;
import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		Revue r = new Revue(12.00, 148635, "revue 1", true, LocalDate.now());

		Personne lecteur1 = new Lecteur();
		Personne libraire1 = new Libraire();
		
		r.add(lecteur1);
		r.add(libraire1);

		r.setPrix(13.00);
		r.setDisponible(false);
	}

}
