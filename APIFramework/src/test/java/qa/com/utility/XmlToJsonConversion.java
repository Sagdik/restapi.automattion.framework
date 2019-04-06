package qa.com.utility;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonConversion {

	
	public static JSONObject xmltojsonchange(String xml) throws JSONException
	{
		JSONObject jsonObject=XML.toJSONObject(xml);
	return jsonObject;
	}
}
