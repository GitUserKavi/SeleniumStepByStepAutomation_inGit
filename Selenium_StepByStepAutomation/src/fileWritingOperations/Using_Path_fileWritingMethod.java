package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Using_Path_fileWritingMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location ="Using_Path_fileWritingMethod.txt";		
		String content ="Learning is fun!" + 
		"If it is taught in a prpper way";
		
		Path path = Paths.get(location);
		Files.write(path, content.getBytes());
		
		
		
	}

}
