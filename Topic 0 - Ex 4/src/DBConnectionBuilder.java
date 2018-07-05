
public interface DBConnectionBuilder {

	public void buildServer();
	
	public void buildDatabase();
	
	public void buildUser();
	
	public void buildPass();
	
	public DBConnection getConnection();
}
