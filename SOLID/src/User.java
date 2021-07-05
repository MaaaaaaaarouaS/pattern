
public class User {

	private String nom;
	private String email;
	private int age;

	public User(String nom, String email, int age) {
		super();
		this.setNom(nom);
		this.setEmail(email);
		this.setAge(age);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
