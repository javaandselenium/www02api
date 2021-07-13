package curd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostOperation {
@Test
public void tc2() {
	JSONObject j=new JSONObject();
	j.put("id",1000);
	j.put("title","Demoapi");
	
	
	RequestSpecification req = RestAssured.given().baseUri("http://localhost:3000")
	                .contentType(ContentType.JSON)
	                .body(j);
	Response response = req.post("/posts");
	response.prettyPrint();
}
}
