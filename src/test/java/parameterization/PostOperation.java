package parameterization;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class PostOperation {
	@Test
	public void demo() {
		JSONObject j=new JSONObject();
		j.put("description","sample");
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.pathParam("ownerName","javaandselenium")
		.pathParam("reproName","WWW01API")
		.body(j)
		.patch("https://api.github.com/repos/{ownerName}/{reproName}")
		.then().log().all();
		
	}

}
