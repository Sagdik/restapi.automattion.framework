package qa.com.teststep;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import qa.com.utility.Payload;



public  class HttpMethod {
 
	public Response postRequestTesting(Properties pr)
	{
		
		Payload payload=new Payload();
		payload.setId(1);
		payload.setName("Sagar");
		payload.setAuthor("ramnath");
		
	    Response response=
			  given()
			  .contentType(ContentType.JSON)
			  .body(payload)
			  .post(pr.getProperty("uri"));
	    return response;
	}
}
