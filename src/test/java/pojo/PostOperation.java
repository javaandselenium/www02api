package pojo;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostOperation {
	@Test
	public void tc3() {
		Project p=new Project(9000,"qwsedrty","Bharanigramesh");
		
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.post("http://localhost:3000/posts")
		.then()
		.log().all();
		
		
		
		
	}
}
