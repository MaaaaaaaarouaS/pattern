package VehiculeFactory;
import java.util.Scanner;

public class TestVehiculeFactory {

	public static void main(String[] args) {

		int num ;
		Catalogue c = new Catalogue();
		Scanner input = new Scanner(System.in);
		VehiculeFactory vf;

		System.out.println("Donner un numero: (1: Voiture/ 2: Camion/ 3: AutoCar)  ");
		num = input.nextInt();
		
		while (num >= 1 && num <= 3) {
			if (num == 1) {
				vf = new VoitureFactory();
			}
			else if(num == 2) {
				vf = new CamionFactory();
			}
			else if (num == 3){
				vf = new AutoCarFactory();
			}
			else {
				break;
			}
			c.setVehiculeFactory(vf);
			c.CreerVehicule();
			System.out.println("Donner un numero: (1: Voiture/ 2: Camion/ 3: AutoCar)  ");
			num = input.nextInt();
		};
		System.out.println(c.AfficherListevehicules());

	}
	
/*
	public static void main(String[] args) {

		int num ;
		Catalogue c = new Catalogue();
		Scanner input = new Scanner(System.in);
		

		System.out.println("Donner un numero: (1: Voiture/ 2: Camion/ 3: AutoCar)  ");
		num = input.nextInt();
		
		while (num >= 1 && num <= 3) {
			c.CreerVehicule(num);
			System.out.println("Donner un numero: (1: Voiture/ 2: Camion/ 3: AutoCar)  ");
			num = input.nextInt();
		};
		System.out.println(c.AfficherListevehicules());

	}
*/

}
