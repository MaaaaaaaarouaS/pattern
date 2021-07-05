
public class Programme {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		

		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		

		Singleton s3 = Singleton.getInstance();
		System.out.println(s3);


		SingletonH sh = SingletonH.getInstance();
		System.out.println(sh);
		

		SingletonH ssh = SingletonH.getInstance();
		System.out.println(ssh);
		

		SingletonH sssh = SingletonH.getInstance();
		System.out.println(sssh);
	}

}
