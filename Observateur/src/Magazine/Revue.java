package Magazine;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Revue {
	private double prix;
	private int numSerie;
	private String titre;
	private boolean disponible;
	private LocalDate date;
	private List<Personne> personnes = new ArrayList<Personne>();

	public Revue(double prix, int numSerie, String titre, boolean disponible, LocalDate date) {
		super();
		this.prix = prix;
		this.numSerie = numSerie;
		this.titre = titre;
		this.disponible = disponible;
		this.date = date;
	}

	public boolean add(Personne e) {
		return personnes.add(e);
	}

	public boolean remove(Object o) {
		return personnes.remove(o);
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;

		changement("prix", prix);

	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
		changement("numSerie", numSerie);

	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
		changement("titre", titre);

	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
		changement("disponible", disponible);
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
		changement("date", date);
	}

	public void changement(String s, Object o) {
		for (Personne personne : personnes) {
			personne.informer(s, o, this);
		}
	}

	@Override
	public String toString() {
		return "Revue [prix=" + prix + ", numSerie=" + numSerie + ", titre=" + titre + ", disponible=" + disponible
				+ ", date=" + date + "]";
	}
	
}
