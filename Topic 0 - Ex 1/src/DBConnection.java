//Singleton of a database connection example

public class DBConnection {
	
	private String username;
	private String password;
	
	private static DBConnection instance = null;
	
	private DBConnection(){
	}
	
	public static DBConnection getInstance(){
		if (instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String name){
		username = name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String pass){
		password = pass;
	}

}