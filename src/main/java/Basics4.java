/*
 * import static io.restassured.RestAssured.given;
 * 
 * import java.io.IOException; import java.nio.file.Files; import
 * java.nio.file.Paths;
 * 
 * import org.testng.annotations.Test;
 * 
 * import io.restassured.RestAssured; import io.restassured.response.Response;
 * 
 * public class Basics4 {
 * 
 * @Test public void postData() {
 * RestAssured.baseURI="https://maps.googleapis.com"; Response
 * res=given().queryParam("key", "AIzaSyBKaeWoY8vGyK-d_1S6KzV06sC7u-6-KAA").
 * body(postdata).when().post("/maps/api/place/nearbysearch/json").then().
 * statusCode(200). //to get output response extract().response(); String
 * resp=res.asString(); System.out.println(resp); } public static String
 * GenerateStringFromResource(String path) throws IOException { return new
 * String(Files.readAllBytes(Paths.get(path))); //THEN COPY XML DATA OF PLACE
 * ADD AND COPY IT TO NOTEPAD AND SAVE IT AS ABC.XML //String
 * postdata=GenerateStringFromResource("path of that ABC.XML"); } }
 */