package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PractiseFirstTest {
	
	@Test
	public void googlePlaceSearch() {
		RestAssured.baseURI = "https://maps.googleapis.com";

		/*
		 * given(). param("location", "-33.8670522,151.1957362").
		 * param("radius","1500"). param("key",
		 * "AIzaSyAPwXsowehx1jYob9c0K7smXPfZQ1tfTY0"). when().
		 * get("/maps/api/place/nearbysearch/json"). then().
		 * assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		 * body("results[0].viewport.northeast.lat", equalTo("-33.8688197"));
		 */

		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get(
				"/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=1500&key=AIzaSyAPwXsowehx1jYob9c0K7smXPfZQ1tfTY0");
		System.out.println("Response Body is =>  " + response.asString());
	}

}
