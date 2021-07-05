package srp;

public class UserValidatorImp implements UserValidator {
   
public boolean validateUser(User user) {
		
		if(user == null || user.getNom().length() < 3)
		  return false;
		
		if(!validEmail(user.getEmail()))
			
			return false;
		if(!isAlphaNumeric(user.getNom()))
			return false;
		
		return true;
	} 
private boolean validEmail(String email) {
	   
	   // implémenter une logique de validation d'email
	   return true;
}

private boolean isAlphaNumeric(String nom) {
	   // implémenter une logique de validation de nom
	   return true;
}
}
