package validations;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test4 {
	@Test
	public void tc1() {
		
		Response resp = given()
		.get("http://localhost:3000/posts");
		 ArrayList<String> list = resp.jsonPath().get("title");
		
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		
}}
