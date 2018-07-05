//Example Builder Pattern

public class DBConnectionDirector {

	private DBConnectionBuilder dbBuilder = null;
	
	public DBConnectionDirector(DBConnectionBuilder dbBuilder){
		this.dbBuilder = dbBuilder;
	}
	
	public void ConstructConnection(){
		dbBuilder.buildServer();
		dbBuilder.buildDatabase();
		dbBuilder.buildUser();
		dbBuilder.buildPass();
	}
	
	public DBConnection getConnection(){
		return dbBuilder.getConnection();
	}
}
