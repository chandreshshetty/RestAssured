package restAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PractiseSecondTest {

	@Test
	public void dummyExam() {
	RestAssured.baseURI="http://dummy.restapiexample.com";
	
	Response res = given().
	when().
	get("/api/v1/employees").
	then().
	assertThat().statusCode(200).and().body("data[0].employee_age",equalTo("61")).and().
	header("X-Vcache", "Miss").and().extract().response();
	System.out.println(res.asString());
	
}

}
