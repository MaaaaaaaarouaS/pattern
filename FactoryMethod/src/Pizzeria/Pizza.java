package Pizzeria;

public abstract class Pizza {

	private String taille;
	private double prix;

	public Pizza () {
	}
	
	public Pizza (String taille, double prix) {
		this.setTaille(taille);
		this.setPrix(prix);
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}
