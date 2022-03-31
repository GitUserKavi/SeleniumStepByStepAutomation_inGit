package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Using_BufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location ="Using_BufferedWriter.txt";		
		String content ="Spring is coming!";
		
		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
	}

}
