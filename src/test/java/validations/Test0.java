package validations;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void tc1() {
		given()
		.get("https://api.github.com/repos/javaandselenium/Gitproject")
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.assertThat().header("Server","GitHub.com")
		.assertThat().header("X-Content-Type-Options","nosniff");
		
		
	}

}
