package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OrangeHRMProperty {
	

	public static Properties loadProperty() throws IOException
	{
	FileInputStream OHRMApplicationPropertiesFile=new FileInputStream("D:\\WorkSpace\\OrangeHRM\\src\\main\\java\\com\\config\\OrangeHRMApplicationPropertiesFile.properties");
	Properties properties=new Properties();
	properties.load(OHRMApplicationPropertiesFile);
	return properties;

	}

}
