package curd;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Test0 {
	@Test
	public void getData() {
		Response resp = RestAssured.get("http://localhost:3000/posts");
      System.out.println(resp.asString());
	//json format
	resp.prettyPrint();
	//all the response 
	resp.then().log().all();
	}
	
	

}
