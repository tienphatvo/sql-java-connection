package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBPropertiesUtil {
	private static final String FILE_CONFIG = "database-info.properties";
	private static DBPropertiesUtil instance = null;
	private Properties properties = new Properties();

	public static DBPropertiesUtil getInstance() {
		if (instance == null) {
			instance = new DBPropertiesUtil();
			instance.readConfig();
		}
		return instance;
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	private void readConfig() {
		InputStream in = getClass().getClassLoader().getResourceAsStream(FILE_CONFIG);
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
