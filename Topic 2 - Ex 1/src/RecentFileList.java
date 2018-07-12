import java.util.ArrayList;

public class RecentFileList {

	private ArrayList<String> rfl;
	private static int maxSize = 15;
	
	public RecentFileList(){
		rfl = new ArrayList<String>();
	}
	
	public Object getListSize(){
		return rfl.size();
	}

	public void addFile(String string){
		if (rfl.contains(string))
			rfl.remove(string);
		rfl.add(0, string);
		if (rfl.size() > maxSize)
			rfl.remove(maxSize);
			
	}
	
	@Override
	public String toString(){
		return rfl.toString();
	}

}
