package SocieteTransport;

import java.text.DecimalFormat;

public class SimulateurCout {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Cargaison c = new Cargaison(1200,new CalculCoutAerienne());
		System.out.println("Calcul du cout par voie aerienne : "+df.format(c.calculerCout()));
		c.setCalculator(new CalculCoutRoutiere());
		System.out.println("Calcul du cout par voie routiere : "+df.format(c.calculerCout()));
		c.setCalculator(new CalculCoutMaritime());
		System.out.println("Calcul du cout par voie maritime : "+df.format(c.calculerCout()));
	}

}
