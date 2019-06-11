package qa.com.testCases;

import java.util.Properties;
import org.testng.annotations.Test;
import com.jayway.restassured.response.Response;
import qa.com.teststep.HttpMethod;
import qa.com.utility.PropertiesFile;
import qa.com.utility.ResponseValidations;

public class PostRequestTestCasesId_001 {

	@Test
	public void responseTestcaseId_001() throws Exception {
		Properties pr = PropertiesFile.loadpropertyfile();
		HttpMethod httprequest = new HttpMethod();

		Response res = httprequest.postRequestTesting(pr);
		System.out.println(res);
		ResponseValidations validation = new ResponseValidations(res);
<<<<<<< HEAD

		validation.validateReponse(201, "application/json; charset=utf-8");

		validation.validateReponse(201, "application/json; charset=utf-8");
=======
		validation.validatereponse(201, "application/json; charset=utf-8");
>>>>>>> c84ae1009e4f77d524a8c6aafd9db48e44ae7bf4
	}
}
