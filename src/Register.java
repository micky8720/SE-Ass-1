import javax.faces.bean.ManagedBean;

@ManagedBean
public class Register {
	
	private String Firstname;
	private String Lastname;
	private String Address;
	private String Phonenumber;
	private String Email;
	private String Username;
	private String Password;
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		this.Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		this.Lastname = lastname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.Phonenumber = phonenumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
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
	
	
	

}
