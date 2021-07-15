package validations;

import static io.restassured.RestAssured.*;

import  org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void tc1() {
		given()
		.get("http://localhost:3000/posts")
		.then()
		.log().all()
		.and().body("[1].title",Matchers.equalTo("JAVA"))
		.and().body("[3].author",Matchers.containsString("Bharani"))
		.and().body("[3].id",Matchers.is(51));
		
	}
}
