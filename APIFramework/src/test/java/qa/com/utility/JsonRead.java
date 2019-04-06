package qa.com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class JsonRead {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		
		generateString("C:\\Users\\sagar.tripathi\\eclipse-workspace\\restapi.automattion.framework\\APIFramework\\apidemofiles\\db.json");
	}


	public static String generateString(String path) throws FileNotFoundException, ParseException
	{
	
		JSONParser jsonParser=new JSONParser();
		File f=new File(path);
		FileReader Reader=new FileReader(f);
		JSONObject obj=(JSONObject)jsonParser.parse(Reader);
		System.out.println(obj.toString());
		return path;
		
	}
	
}
