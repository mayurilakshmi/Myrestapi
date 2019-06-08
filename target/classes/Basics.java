import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Basics {

	public static void main(String[] args) {

		RestAssured.baseURI="https://maps.googleapis.com";
		given().
		param("location","-33.8670522,151.1957362").
		param("radius","1500").
		param("key","AIzaSyBKaeWoY8vGyK-d_1S6KzV06sC7u-6-KAA").
		when().
		get("/maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
		

	}

}
