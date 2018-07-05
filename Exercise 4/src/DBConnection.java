
public class DBConnection {

	private String server;
	private String database;
	private String user;
	private String pass;
	
	public String getServer(){
		return server;
	}
	
	public void setServer(String server){
		this.server = server;
	}
	
	public String getDatabase(){
		return database;
	}
	
	public void setDatabase(String database){
		this.database = database;
	}
	
	public String getUser(){
		return user;
	}
	
	public void setUser(String user){
		this.user = user;
	}
	
	public String getPass(){
		return pass;
	}
	
	public void setPass(String pass){
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "server:" + server + ", database:" + database + ", user:" + user + ", pass:" + pass;
	}
}
