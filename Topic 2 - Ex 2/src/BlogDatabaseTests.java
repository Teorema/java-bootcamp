import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class BlogDatabaseTests {
	
	//Post new entry
	@Test
	public void testNewEntry(){
		BlogDatabaseFake blog = new BlogDatabaseFake("blog");
		blog.addNewEntry("title", "text");
		assertEquals(1, blog.entriesFake.size());
	}
	
	//Delete existing entry
	@Test
	public void testDeleteEntry(){
		BlogDatabaseFake blog = new BlogDatabaseFake("blog");
		blog.addNewEntry("title", "text");
		blog.removeEntry("title");
		assertEquals(0, blog.entriesFake.size());
	}
	
	//Show 10 most recent entries
	@Test
	public void testShowRecentEntries(){
		BlogDatabaseStub blog = new BlogDatabaseStub("blog");
		blog.addNewEntry("title1", "text");
		blog.addNewEntry("title2", "text");
		blog.addNewEntry("title3", "text");
		blog.addNewEntry("title4", "text");
		blog.addNewEntry("title5", "text");
		blog.addNewEntry("title6", "text");
		blog.addNewEntry("title7", "text");
		blog.addNewEntry("title8", "text");
		blog.addNewEntry("title9", "text");
		blog.addNewEntry("title10", "text");
		ArrayList<EntryDatabase> recentEntries = blog.showRecentEntries(10);
		assertEquals(10, recentEntries.size());
	}
}
