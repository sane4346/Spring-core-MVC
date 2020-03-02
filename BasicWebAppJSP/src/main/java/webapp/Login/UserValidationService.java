package webapp.Login;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		
		if (user.equals("sane") && password.equals("dummy"))
			return true;
		return false;
	}

}
