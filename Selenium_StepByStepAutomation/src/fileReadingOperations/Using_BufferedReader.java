package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Using_BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location ="Using_BufferedWriter.txt";

		FileReader fileReader = new FileReader(location);

		BufferedReader reader = new BufferedReader(fileReader);

		// To read single line
		// String currentLine =  reader.readLine();
		// To read multiple line

		String currentLine;

		while((currentLine=reader.readLine())!= null){

			System.out.println(currentLine);
		}



		reader.close();

	}

}
