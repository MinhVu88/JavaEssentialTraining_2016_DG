package ExerciseFiles.Ch11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

// manage files with the original File class

public class CopyFile_1101 {

	public static void main(String[] args) {
		
		String sourceFile = "files/loremipsum.txt";
		
		String targetFile = "files/target.txt";
		
		try(
				FileReader fReader = new FileReader(sourceFile);
				
				BufferedReader bReader = new BufferedReader(fReader);
				
				FileWriter fWriter = new FileWriter(targetFile);
				) {
			
			while (true) {
				String line = bReader.readLine();
				
				if(line == null) {
					break;
				}else {
					fWriter.write(line + "\n");
				}
			}
			
			System.out.println("\nfile copied");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
