package SpringMVC;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class customer {

	@NotEmpty(message="This field cannot be empty")
	@Size(min=8, max=20, message= "user name should be between 8 to 20")
	String username;
	
	int password;
	String email;
	long contact;
	String city;
	long zip;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "customer [username=" + username + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ ", city=" + city + ", zip=" + zip + "]";
	}
	
	
		
		
	}

