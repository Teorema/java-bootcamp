//Example Builder Pattern

public class ConnectionTester {

	public static void main(String a[]){
		DBConnection MySQL = new DBConnectionBuilder().setServer("MySQL server").setDatabase("MySQL database").getConnection();
		DBConnection SQLServer = new DBConnectionBuilder().setServer("SQLServer").setDatabase("SQLServer database").getConnection();
		
		MySQL.toString();
		SQLServer.toString();
	}
	
}
