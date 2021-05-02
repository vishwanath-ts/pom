package pom.sample.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	
	public String getProperty(String key) {
		String propValue = null;
		try {
			FileInputStream testInput = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\configProperties\\testConfig.properties");
			Properties prop = new Properties();
			prop.load(testInput);
			propValue = prop.getProperty(key);
			System.out.println(propValue);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propValue;
	}

}
