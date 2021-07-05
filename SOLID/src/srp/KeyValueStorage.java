package srp;

import java.util.HashMap;
import java.util.Map;

public class KeyValueStorage implements UserStorage{
	 Map<String, User> bd = new HashMap<String, User>();
	 
	 public void storeUser(User user) {
		 this.bd.put(user.getEmail(), user);
		
	}
}
