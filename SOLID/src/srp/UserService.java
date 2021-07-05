package srp;

import java.util.HashMap;
import java.util.Map;

public class UserService {
	
	private UserValidator validator = new UserValidatorImp();
	private UserStorage storage = new RelationalStorage();
	 
	public String createUser(String nom,String email,int age) {
		
		 User newUser = new User(nom, email,age);
		if(!validator.validateUser(newUser))
			return "Error";
		
			storage.storeUser(newUser);
		return "Success";
	}
	
	
	
	
  
}
