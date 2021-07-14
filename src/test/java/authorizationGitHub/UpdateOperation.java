package authorizationGitHub;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class UpdateOperation {
	@Test
	public void tc4() {
		JSONObject j=new JSONObject();
		j.put("private",true);
		j.put("description","dummy data");
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(j)
		.patch("https://api.github.com/repos/javaandselenium/wwwwwww09")
		.then().log().all();
		
	}

}
