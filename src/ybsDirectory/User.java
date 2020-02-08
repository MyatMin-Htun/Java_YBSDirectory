package ybsDirectory;

public class User {

	private String username, userType;
	
	public void setUserName(String name) {
		this.username=name;
	}
	
	public String getUserName() {
		return this.username;
	}
	
	public void setType(String type) {
		this.userType=type;
	}
		
	public String getType() {
		return this.userType;
	}
}
