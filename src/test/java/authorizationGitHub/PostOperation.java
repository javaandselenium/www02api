package authorizationGitHub;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class PostOperation {
	@Test
	public void tc2() {
		JSONObject j=new JSONObject();
		j.put("name","wwwwwww09");
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(j)
		.post("https://api.github.com/user/repos")
		.then().log().all();
		
	}

}
