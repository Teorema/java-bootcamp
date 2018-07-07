
public class DBConnectionBuilder{

	private String server;
	private String database;
	private String user;
	private String pass;

	public DBConnectionBuilder setServer(String server){
		this.server = server;
		return this;
	}

	public DBConnectionBuilder setDatabase(String database){
		this.database = database;
		return this;
	}

	public DBConnectionBuilder setUser(String user){
		this.user = user;
		return this;
	}

	public DBConnectionBuilder setPass(String pass){
		this.pass = pass;
		return this;
	}

	public DBConnection getConnection(){
		return new DBConnection(server, database, user, pass);
	}
}
