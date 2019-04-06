package qa.com.utility;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class JsonToXmlConversion {

	
	public static String jsonToXmlConersion(String json) throws JSONException
	{
		JSONObject js =new JSONObject(json);
		String s=XML.toString(js);
		return s;
	}
	
}
