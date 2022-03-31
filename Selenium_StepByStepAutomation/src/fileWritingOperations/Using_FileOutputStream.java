package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class Using_FileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location ="Using_FileOutputStream.txt";		
		String content ="I like to learn java for selenium!";
		
		FileOutputStream outputStream = new FileOutputStream(location);
		
		byte[] writeThis =  content.getBytes();
		
		outputStream.write(writeThis);
		outputStream.close();
		
	}

}
