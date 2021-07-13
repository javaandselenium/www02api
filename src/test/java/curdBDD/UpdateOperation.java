package curdBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class UpdateOperation {
	@Test
	public void tc3() {
		JSONObject j=new JSONObject();
		j.put("title","www02765768");
		
		given()
		.contentType(ContentType.JSON)
		.body(j)
		.patch("http://localhost:3000/posts/600")
		.then()
		.log().all();
		
}}
