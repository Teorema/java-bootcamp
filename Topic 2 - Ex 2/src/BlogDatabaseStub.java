import java.util.ArrayList;

//Simple implementation of showRecentEntries for testing
public class BlogDatabaseStub extends BlogDatabase{
	
	public BlogDatabaseStub(String name) {
		super(name);
	}
	
	@Override
	public ArrayList<EntryDatabase> showRecentEntries(int cant){
		return this.entries;
	}

}
