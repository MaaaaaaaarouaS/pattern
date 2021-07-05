import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class UserService {
	Map<String, User> bd = new HashMap<String, User>();

	public String createUser(String nom, String email, int age) {

		return "Success";
	}

	public boolean validateUser(User user) {
		if (user == null || user.getNom().length() < 3) {
			return false;
		}
		if (!validateEmail(user.getEmail())) {
			return false;
		}
		return true;
	}

	public void storeUser(User user) {

		bd.put(user.getEmail(), user);
	}

	public boolean validateEmail(String email) {
		String emailFormate = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\."
				+ "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

		Pattern p = Pattern.compile(emailFormate);
		if (email == null) {
			return false;
		}
		return p.matcher(email).matches();
	}
}
