package work9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NotFound {
	public void throwSample() throws FileNotFoundException{
		//���݂��Ȃ��t�@�C����ǂݍ��܂��鏈��
		String filePath="";
		File dummy = new File(filePath);
		FileReader f = new FileReader(dummy);
	}
}
