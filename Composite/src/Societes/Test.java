package Societes;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Societe s1 = new SocieteSansFiliales(2000);
		s1.addVehicules(5);		

		Societe s2 = new SocieteAvecFiliales(5000);
		s2.addVehicules(20);

		Societe s3 = new SocieteAvecFiliales(1000);
		s3.addVehicules(10);
		s3.addSociete(s1);
		s3.addSociete(s2);


		Societe s4 = new SocieteSansFiliales(3000);
		s4.addVehicules(5);		
		s2.addSociete(s4);


		List<Societe> Societes = Arrays.asList(s1, s2, s3, s4);

		Societes.forEach(s -> System.out.println(s.calculCout()));
		
	}
}
