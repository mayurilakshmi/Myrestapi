package files;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReusableMethods {
	public static XmlPath rawToXml(Response r) {
		String resp=r.asString();
		XmlPath x=new XmlPath(resp);
		return x;
		
	}
	public static JsonPath rawToJson(Response r) {
		String resp=r.asString();
		JsonPath y=new JsonPath(resp);
		return y;
		
	}
	}


