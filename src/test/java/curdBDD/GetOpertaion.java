package curdBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class GetOpertaion {
	@Test
	public void tc1() {
		given()
		.get("http://localhost:3000/posts")
		.then()
		.log().all();
	}

}
