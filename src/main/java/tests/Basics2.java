package tests;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Basics2 {
@Test
public void postData() {
	RestAssured.baseURI="https://maps.googleapis.com";
	given().queryParam("key", "AIzaSyBKaeWoY8vGyK-d_1S6KzV06sC7u-6-KAA").
	body(" \"geometry\": {\r\n" + 
			"                \"location\": {\r\n" + 
			"                    \"lat\": -33.8713101,\r\n" + 
			"                    \"lng\": 151.1981186\r\n" + 
			"                }}").when().post("/maps/api/place/nearbysearch/json").then().statusCode(200);
}
}
