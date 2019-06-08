package tests;
import org.testng.annotations.Test;

import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Basics6 {
	Properties prop=new Properties();
	
@Test
public void jiraApi() throws IOException {
	
	FileInputStream fis=new FileInputStream("E:\\GIT Project\\maven\\src\\main\\java\\files\\env.properties");
	prop.load(fis);
	RestAssured.baseURI=prop.getProperty("JiraHost");
	Response res=given().header("Content-Type","application/json").body("{ \"username\": \"Mayuridurga\", \"password\": \"lpmayu33\" }").
	when().post("/rest/auth/1/session").
	then().statusCode(200).extract().response();
	
	JsonPath js=ReusableMethods.rawToJson(res);
	String sessionid=js.get("sessionid.value");
	System.out.println(sessionid);
	
	
	
}
}
