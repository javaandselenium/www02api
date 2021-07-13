package curd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateOperation {
@Test
public void tc3() {
	JSONObject j=new JSONObject();
	j.put("title","demoapitesting6");
	
	RequestSpecification update = RestAssured.given().baseUri("http://localhost:3000")
	.contentType(ContentType.JSON)
	.body(j);
	Response resp = update.put("/posts/1000");
	System.out.println(resp.prettyPrint());
	
}
}
