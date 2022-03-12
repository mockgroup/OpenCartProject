package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestUtil {

	static Properties p;
	public TestUtil() throws IOException {
		String path="./src/main/java/com/qa/config/config.properties";
		File src=new File(path);
		FileInputStream file=new FileInputStream(src);
		p=new Properties();
		p.load(file);
	}
	
	public static String getURL() {
		String url=p.getProperty("url");
		return url;
	}
}
