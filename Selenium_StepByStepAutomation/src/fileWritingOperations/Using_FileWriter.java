package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class Using_FileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.file location 2. content
		
		String location ="Using_FileWriter.txt";		
		String content ="Learing java is simple";
		
		FileWriter fileWriter = new FileWriter(location);
	
		fileWriter.write(content);
		
		fileWriter.close();
	}

}
