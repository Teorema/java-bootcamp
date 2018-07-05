
public class SQLServerConnectionBuilder implements DBConnectionBuilder{

	private DBConnection dbConnection;
	
	public SQLServerConnectionBuilder(){
		dbConnection = new DBConnection();
	}
	
	@Override
	public void buildServer(){
		dbConnection.setServer("SQLServer");
	}

	@Override
	public void buildDatabase(){
		dbConnection.setDatabase("SQLServer database");
	}

	@Override
	public void buildUser(){
		dbConnection.setUser("admin");
	}

	@Override
	public void buildPass(){
		dbConnection.setPass("1234");
	}

	@Override
	public DBConnection getConnection(){
		return dbConnection;
	}

}
