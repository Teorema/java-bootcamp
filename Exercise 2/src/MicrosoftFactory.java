
public class MicrosoftFactory extends AbstractFactory{

	@Override
	public MicrosoftConnection getMicrosoftConnection(String type){
		if (type == null)
			return null;
		if (type.equals("ODBC"))
			return new MicrosoftODBC();
		if (type.equals("OLEDB"))
			return new MicrosoftOLEDB();
		return null;
	}

	@Override
	public OracleConnection getOracleConnection(String type){
		return null;
	}

}
