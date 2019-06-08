package files;

import static org.hamcrest.Matchers.equalTo;

public class PayLoad {
	public static String getPostData() {
		String b=" \"geometry\": {\r\n" + 
				"                \"location\": {\r\n" + 
				"                    \"lat\": -33.8713101,\r\n" + 
				"                    \"lng\": 151.1981186\r\n" + 
				"                }}";
		return b;
	}

}
