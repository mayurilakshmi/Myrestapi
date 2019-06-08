import static io.restassured.RestAssured.given;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

public class Basics {

	public static void main(String[] args) {

		RestAssured.baseURI="https://maps.googleapis.com";
		given().
		param("location","-33.8670522,151.1957362").log().all().
		param("radius","1500").
		param("key","AIzaSyBKaeWoY8vGyK-d_1S6KzV06sC7u-6-KAA").
		when().
		get("/maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("results[0].name",equalTo("Sydney"));
		

	}

}
