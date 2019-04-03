package qa.com.utility;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseValidations {

	Response pr;
	
	public ResponseValidations(Response pr)
	{
		this.pr=pr;
	}
	
	public void validatereponse(int statuscode,String contentText)
	{
		int expectedcode=pr.getStatusCode();
		String actualContent=pr.getContentType();
		Assert.assertEquals(statuscode,expectedcode);
		Assert.assertEquals(actualContent, expectedcode);
	}
	
	public String responseParse(String jsonpath)
	{
		
		return pr.jsonPath().get(jsonpath);
		
	}
}
