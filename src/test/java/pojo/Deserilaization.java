package pojo;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Deserilaization {

@Test
public void tc2() throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper mapper=new ObjectMapper();
	Project p = mapper.readValue(new File("./data.json"),Project.class);
System.out.println(p.author);
System.out.println(p.id);
System.out.println(p.title);

}

}
