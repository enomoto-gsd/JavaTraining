package work9;

import java.io.FileNotFoundException;

public class NotFoundSample {
	public static void main(String[] args) {
		NotFound n = new NotFound();
		try {
			n.throwSample();
			System.out.println("’Ê—p‚Ìˆ—");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally‚Ìˆ—");
		}
	}

}
