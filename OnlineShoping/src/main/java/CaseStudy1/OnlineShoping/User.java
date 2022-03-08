package CaseStudy1.OnlineShoping;

public class User {
	private String username;
	private String email;
	private String password;
	private String shipping_address;
	private String billing_address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}
	public String getBilling_address() {
		return billing_address;
	}
	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	public User(String username, String email, String password, String shipping_address, String billing_address) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.shipping_address = shipping_address;
		this.billing_address = billing_address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
