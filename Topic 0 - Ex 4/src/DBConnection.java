
public class DBConnection {

	private String server;
	private String database;
	private String user;
	private String pass;
	
	public DBConnection(String server, String database, String user, String pass){
		this.server = server;
		this.database = database;
		this.user = user;
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "server:" + server + ", database:" + database + ", user:" + user + ", pass:" + pass;
	}
}
