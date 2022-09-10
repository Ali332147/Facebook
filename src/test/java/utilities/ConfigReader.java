package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
private static Properties prop =new Properties();
static {//Static block always be in ready position for execution, another word it is always become first
	
	try {
		FileInputStream file = new FileInputStream("config.properties");
		prop.load(file);
		file.close();
	}catch (IOException e){
		System.out.println("File not found in properties file");
		
	}
}
 public static String getProperty(String keyword) { //this is the property value from config.properties file
	 return prop.getProperty(keyword);
 }
}
