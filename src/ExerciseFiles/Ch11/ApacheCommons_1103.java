package ExerciseFiles.Ch11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ApacheCommons_1103 {

	public static void main(String[] args) {
		
		File sourceFile = new File("files/loremipsum.txt");
		
		File targetFile = new File("files/target.txt");
		
		try {
			FileUtils.copyFile(sourceFile, targetFile);
			
			System.out.println("\nfile copied");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
