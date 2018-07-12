import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecentFileListTests {

	//When the program is run for the first time, the list is empty.
	@Test
	public void testNewIsEmpty(){
		RecentFileList rfl = new RecentFileList();
		assertEquals(0, rfl.getListSize());
	}
	
	//When a file is opened, it is added to the recent file list.
	@Test
	public void testAddFile(){
		RecentFileList rfl = new RecentFileList();
		rfl.addFile("testFile");
		assertEquals("[testFile]", rfl.toString());
	}
	
	//If an opened file already exists in the recent file list, it is bumped to the top,
	//not duplicated in the list.
	@Test
	public void testBumpTop(){
		RecentFileList rfl = new RecentFileList();
		rfl.addFile("testFile1");
		rfl.addFile("testFile2");
		rfl.addFile("testFile3");
		rfl.addFile("testFile2");
		assertEquals("[testFile2, testFile3, testFile1]", rfl.toString());
	}
	
	//If the recent file list gets full (typical number of items is 15), the oldest
	//item is removed when a new item is added.
	@Test
	public void testRemoveOldest(){
		RecentFileList rfl = new RecentFileList();
		rfl.addFile("testFile1");
		rfl.addFile("testFile2");
		rfl.addFile("testFile3");
		rfl.addFile("testFile4");
		rfl.addFile("testFile5");
		rfl.addFile("testFile6");
		rfl.addFile("testFile7");
		rfl.addFile("testFile8");
		rfl.addFile("testFile9");
		rfl.addFile("testFile10");
		rfl.addFile("testFile11");
		rfl.addFile("testFile12");
		rfl.addFile("testFile13");
		rfl.addFile("testFile14");
		rfl.addFile("testFile15");
		rfl.addFile("testFile16");
		assertEquals(15, rfl.getListSize());
		assertEquals("[testFile16, testFile15, testFile14, testFile13, "
				+ "testFile12, testFile11, testFile10, testFile9, testFile8, "
				+ "testFile7, testFile6, testFile5, testFile4, testFile3, testFile2]", rfl.toString());
	}
}
