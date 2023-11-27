package in.pravakar.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
	public static void main(String[] args) throws Exception {
		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("Robert");
		c.setEmail("robert@gmail.com");
		c.setPhno(7856924315l);
		c.setAddr(addr);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Json file created");
		
	}

}
