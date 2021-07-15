package validations;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void tc1() {
		given()
		.get("http://localhost:3000/posts")
		.then()
		.log().all()
		.and().body("[1].title",equalTo("JAVA"))
		.and().body("[3].author",containsString("Bharani"))
		.and().body("[3].id",is(51));
		
	}
}
