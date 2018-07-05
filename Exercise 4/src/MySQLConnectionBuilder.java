
public class MySQLConnectionBuilder implements DBConnectionBuilder{

	private DBConnection dbConnection;
	
	public MySQLConnectionBuilder(){
		dbConnection = new DBConnection();
	}
	
	@Override
	public void buildServer(){
		dbConnection.setServer("MySQL server");
	}

	@Override
	public void buildDatabase(){
		dbConnection.setDatabase("MySQL database");
	}

	@Override
	public void buildUser(){
		dbConnection.setUser("admin");
	}

	@Override
	public void buildPass(){
		dbConnection.setPass("admin");
	}

	@Override
	public DBConnection getConnection(){
		return dbConnection;
	}

}
