package com.atmecs.appium.uicatalog.util;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertyUtil {

	Properties properties = new Properties();
	public PropertyUtil(){
		try {
			properties.load(new FileReader(new File("src/main/resources/config.properties")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getProperty(String propertyName){
		return properties.getProperty(propertyName);
	}
	
}
