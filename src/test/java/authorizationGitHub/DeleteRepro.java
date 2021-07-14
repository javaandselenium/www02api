package authorizationGitHub;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class DeleteRepro {
	@Test
	public void tc4() {
		given()
        .auth().oauth2("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")
		.delete("https://api.github.com/repos/javaandselenium/wwwwwww09")
		.then().log().all();
		
	}

}
