package curdBDD;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class DeleteOperation {
@Test
public void tc3() {
	given()
	.delete("http://localhost:3000/posts/600")
	.then()
	.log().all();
}
}
