//Abstract Factory Example

public abstract class AbstractFactory {

	public abstract MicrosoftConnection getMicrosoftConnection(String type);
	public abstract OracleConnection getOracleConnection(String type);
}
