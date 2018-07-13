import java.util.ArrayList;
import java.util.Date;

public class EntryDatabase {
	
	private String title;
	private String text;
	private Date date;
	private ArrayList<String> comments;
	
	public EntryDatabase(String title, String text){
		this.title = title;
		this.text = text;
		this.date = new Date();
		comments = new ArrayList<String>();
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getText(){
		return text;
	}

	public void setText(String text){
		this.text = text;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void addComment(String comment){
		comments.add(comment);
	}
	
	public void removeComment(String comment){
		if (comments.contains(comment))
			comments.remove(comment);
	}

}
