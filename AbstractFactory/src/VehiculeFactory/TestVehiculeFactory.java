package VehiculeFactory;
import java.util.Scanner;

public class TestVehiculeFactory {

	public static void main(String[] args) {

		int num ;
		Catalogue c = new Catalogue();
		Scanner input = new Scanner(System.in);
		VehiculeFactory vf;

		System.out.println("Donner un numero: (1:Essence/ 2: Hybride)  ");
		num = input.nextInt();
		
		while (num >= 1 && num <= 2) {
			if (num == 1) {
				vf = new VehiculeEssenceFactory();
			}
			else if (num == 2) {
				vf = new VehiculeHybrideFactory();
			}
			else {
				break;
			}
			c.setVehiculeFactory(vf);
			c.CreerVehicule();
			System.out.println("Donner un numero: (1:Essence/ 2: Hybride)  ");
			num = input.nextInt();
		};
		System.out.println(c.AfficherListevehicules());

	}
	
}
