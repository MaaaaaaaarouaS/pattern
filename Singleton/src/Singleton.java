import java.util.Optional;

public class Singleton {

	private static Optional<Singleton> instance = Optional.empty();

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		return instance.orElseGet(() -> {
			instance = Optional.of(new Singleton());
			return instance.get();
		});
	}
}
