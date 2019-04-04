package qa.com.teststep;

import static com.jayway.restassured.RestAssured.*;
import java.util.Properties;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import qa.com.utility.Payload;

public class HttpMethod {

	public Response postRequestTesting(Properties pr)

	{

		Payload payload = new Payload();
		payload.setId(4);
		payload.setTitle("Ram Kathar1");
		payload.setAuthor("Ramnath2");

		Response response = given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.post("http://localhost:3000/posts/");
		System.out.println("status code " + response.statusCode());
		System.out.println(response.asString());
		return response;
	
	}
}
