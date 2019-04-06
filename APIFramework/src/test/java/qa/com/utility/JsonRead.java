package qa.com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

	public static void main(String[] args) throws ParseException, IOException {
		
		generateString("./apidemofiles/db.json");
	}


	public static void generateString(String path) throws ParseException, IOException
	{
	
		JSONParser jsonParser=new JSONParser();
		File f=new File(path);
		FileReader Reader=new FileReader(f);
		JSONObject obj=(JSONObject)jsonParser.parse(Reader);
		System.out.println(obj.toString());
	//	return path;
		
	}
	
}
