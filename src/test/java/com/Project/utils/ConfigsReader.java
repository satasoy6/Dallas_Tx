package com.Project.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
	public static Properties prop;
	/**
	 * This method will read properties file
	 * @param filePath
	 */
public static void readProperties(String filePath) {
	
	FileInputStream fis;
	try {
		fis = new FileInputStream(filePath);
		prop=new Properties();
		prop.load(fis);
		fis.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	
}

/**
 * This method will return value of specified key
 * @param key
 * @return
 */
public static String getProperty(String key) {
	
	return prop.getProperty(key);
}
}
