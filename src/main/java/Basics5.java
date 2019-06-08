import static io.restassured.RestAssured.given;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import files.ReusableMethods;

public class Basics5 {

	public static void main(String[] args) {

		RestAssured.baseURI="https://maps.googleapis.com";
	Response res=	given().
		param("location","-33.8670522,151.1957362").
		param("radius","1500").
		param("key","AIzaSyBKaeWoY8vGyK-d_1S6KzV06sC7u-6-KAA").
		when().
		get("/maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("results[0].name",equalTo("Sydney")).extract().response();
		JsonPath js=ReusableMethods.rawToJson(res);
			int count=	js.get("results.size()");
		for(int i=0;i<count;i++) {
			System.out.println(js.get("results["+i+"].name"));
		}
System.out.println(count);
	}

}
