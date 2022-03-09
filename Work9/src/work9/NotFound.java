package work9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NotFound {
	public void throwSample() throws FileNotFoundException{
		//‘¶İ‚µ‚È‚¢ƒtƒ@ƒCƒ‹‚ğ“Ç‚İ‚Ü‚¹‚éˆ—
		String filePath="";
		File dummy = new File(filePath);
		FileReader f = new FileReader(dummy);
	}
}
