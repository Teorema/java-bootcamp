
public class OracleFactory extends AbstractFactory{

	@Override
	public MicrosoftConnection getMicrosoftConnection(String type){
		return null;
	}

	@Override
	public OracleConnection getOracleConnection(String type){
		if (type == null)
			return null;
		if (type.equals("ODBC"))
			return new OracleODBC();
		if (type.equals("OLEDB"))
			return new OracleOLEDB();
		return null;
	}

}
