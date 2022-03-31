package jsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JsonWritingExample_withJSON {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Kavitha");
		jsonObject.put("Age", 20);
		
		//["magical smile", "magnetic eyes"]
		
		JSONArray array = new JSONArray();
		array.add("magical smile");
		array.add("magnetic eyes");
		
		jsonObject.put("Special Qualities", array);
		
		FileWriter fileWriter = new FileWriter("kavithaMasters_JSON.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
		
	}

}
