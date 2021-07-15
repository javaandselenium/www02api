package validations;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.ValidatableResponse;

public class Test3 {
	@Test
	public void tc1() {
		
		 String data = given()
		.get("http://localhost:3000/posts")
		.jsonPath().get("[0].title");
		System.out.println(data);
		
		
	}}
