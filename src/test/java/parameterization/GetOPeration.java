package parameterization;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class GetOPeration {
	@Test
	public void tc3() {
		given()
		.queryParam("q","WWW01API")
		.queryParam("order","asc")
		.get("https://api.github.com/search/repositories")
		.then().log().all();
	}

}
