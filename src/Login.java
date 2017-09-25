import javax.faces.bean.ManagedBean;

@ManagedBean(name="login")
public class Login {
	
	private String Username;
	private String Password;
	
	
	
	public Login(){
		
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	

	public String checkValidity() { 
		if ((Username.equals("admin") || Username.equals("Admin")) && (Password.equals("admin") || Password.equals("Admin"))){ 
			return ("Loginsuccess");
		}
		else{
			return("Loginfail");
		}

	  
	}	
}
