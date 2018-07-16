package trng.samp.core1.demo5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class serializeJSON {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
		ObjectMapper om = new ObjectMapper();
		Customer cust = new Customer(1, "Sachin", "1026 San Jacinto Dr", 120000.0);
		FileOutputStream fos = new FileOutputStream("Customer.json");
		om.writeValue(fos, cust);

	}

}
