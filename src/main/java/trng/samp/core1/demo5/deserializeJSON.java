package trng.samp.core1.demo5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class deserializeJSON {
	
	private static String filePath = "C:\\Users\\GJNRao\\Documents\\STS Workpace\\demo5\\Customer.json";

	public static void main(String[] args) throws JsonParseException, IOException {
		// TODO Auto-generated method stub
		
		ObjectMapper om = new ObjectMapper();
		byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
		Map<String, Object> myMap = new HashMap();
		myMap = om.readValue(jsonData, HashMap.class);
		
		System.out.println(myMap);

	}

}
