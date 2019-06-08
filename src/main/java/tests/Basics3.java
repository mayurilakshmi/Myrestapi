package tests;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import files.PayLoad;
import files.Resources;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Basics3 {
	Properties prop=new Properties();
	@BeforeTest
	public void getData() throws IOException {
		
		FileInputStream fis=new FileInputStream("E:\\GIT Project\\maven\\src\\main\\java\\files\\env.properties");
		prop.load(fis);
	
	
		
	}
@Test
public void AddandDeletePlace() {
	
	RestAssured.baseURI=prop.getProperty("Host");
	Response res=given().
			queryParam("key",prop.getProperty("Key")).
	body(PayLoad.getPostData()).when().post(Resources.placePostData()).then().statusCode(200).body("status", equalTo("OK")).
	
	extract().response();
	String responseString=res.asString();
	System.out.println(responseString);
}
}
