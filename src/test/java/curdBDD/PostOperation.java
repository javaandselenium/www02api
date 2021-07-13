package curdBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class PostOperation {
	@Test
	public void tc3() {
		JSONObject j=new JSONObject();
		j.put("id",600);
		j.put("title","www02");
		
		given()
		.contentType(ContentType.JSON)
		.body(j)
		.post("http://localhost:3000/posts")
		.then()
		.log().all();
		
		
		
		
	}

}
