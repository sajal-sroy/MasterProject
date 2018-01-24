package sample.web;

public class LoginService {

	
	public boolean validateUser(String uname,
			                String pass){
		if(uname.equals("admin") 
				&& pass.equals("admin")){
			return true;
		}
		return false;
    }
}
