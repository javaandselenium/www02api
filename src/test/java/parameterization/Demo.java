package parameterization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Demo {
	@Test
	public void tc3() {
		given()
		.param("q","WWW01API")
		.param("order","asc")
		.get("https://api.github.com/search/repositories")
		.then().log().all();
	}
}
