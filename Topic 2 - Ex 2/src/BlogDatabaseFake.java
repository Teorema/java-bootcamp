import java.util.ArrayList;

//No "connection" with the Entry Database
public class BlogDatabaseFake extends BlogDatabase{

	public ArrayList<String> entriesFake;
	
	public BlogDatabaseFake(String name) {
		super(name);
		entriesFake = new ArrayList<String>();
	}
	
	@Override
	public void addNewEntry(String title, String text){
		entriesFake.add(title);
	}
	
	@Override
	public void removeEntry(String title){
		entriesFake.remove(title);
	}

}
