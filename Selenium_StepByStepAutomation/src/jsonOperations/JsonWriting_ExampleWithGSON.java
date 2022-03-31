package jsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonWriting_ExampleWithGSON {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	JsonObject jsonObject = new JsonObject();
	jsonObject.addProperty("Name", "Kavitha");
	jsonObject.addProperty("Age", 20);
	
	//["magical smile", "magnetic eyes"]
	
	JsonArray array = new JsonArray();
	array.add("magical smile");
	array.add("magnetic eyes");
	
	jsonObject.add("Special Qualities", array);
	
	FileWriter fileWriter = new FileWriter("kavithaMasters_1.json");
	fileWriter.write(jsonObject.toString());
	fileWriter.close();
	
	}

}
