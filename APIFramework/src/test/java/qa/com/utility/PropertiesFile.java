package qa.com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFile {

	public static Properties loadpropertyfile() throws Exception {

		File file = new File("./config/env.properties");
		FileInputStream inputStreamFile = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(inputStreamFile);
		return pro;

	}
}
