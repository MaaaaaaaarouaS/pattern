
public class SingletonH {

	private static SingletonH instance = null;

	private SingletonH() {
	}

	public static synchronized SingletonH getInstance() {
		if (instance == null) {
			instance = new SingletonH();
		}
		return instance;
	}
}
