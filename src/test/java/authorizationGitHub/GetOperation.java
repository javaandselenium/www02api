package authorizationGitHub;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class GetOperation {
	@Test
	public void tc1() {
		given()
		.get("https://api.github.com/repos/javaandselenium/Gitproject")
		.then()
		.log().all();
		
	}

}
