package curd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteOperation {
@Test
public void tc3() {
	Response delete = RestAssured.delete(" http://localhost:3000/posts/1000");
delete.prettyPrint();

}
}
