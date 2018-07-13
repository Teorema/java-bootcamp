import java.util.ArrayList;

public class BlogDatabase {

	private String blogName;
	protected ArrayList<EntryDatabase> entries;
	
	public BlogDatabase(String name){
		blogName = name;
		entries = new ArrayList<EntryDatabase>();
	}
	
	public String getBlogName(){
		return blogName;
	}

	public void setBlogName(String blogName){
		this.blogName = blogName;
	}
	
	public void addNewEntry(String title, String text){
		EntryDatabase entry = new EntryDatabase(title, text);
		entries.add(entry);
	}
	
	public void removeEntry(String title){
		for (EntryDatabase entry : entries){
			if (entry.getTitle().equals(title)){
				entries.remove(entry);
				return;
			}
		}
	}
	
	//The most recent files are the ones at the end of entries
	public ArrayList<EntryDatabase> showRecentEntries(int cant){
		ArrayList<EntryDatabase> recent = new ArrayList<EntryDatabase>();
		if (entries.size() < cant)
			return entries;
		recent.addAll(entries.subList(entries.size()-cant, entries.size()-1));
		return recent;
	}
	
}
