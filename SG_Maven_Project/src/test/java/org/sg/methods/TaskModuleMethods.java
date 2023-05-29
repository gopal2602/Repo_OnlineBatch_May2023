package org.sg.methods;

import java.io.FileInputStream;
import java.util.Properties;

import org.sg.driver.DriverScript;

public class TaskModuleMethods extends DriverScript{
	/******************************************
	 * Method Name		: getPropData
	 * 
	 * 
	 * 
	 ******************************************/
	public String getPropData(String keyName) {
		FileInputStream fin = null;
		Properties prop = null;
		try {
			fin = new FileInputStream(System.getProperty("user.dir") + "\\Configuration\\configuration.properties");
			prop = new Properties();
			prop.load(fin);
			return prop.getProperty(keyName);
		}catch(Exception e) {
			System.out.println("Exception in the 'getPropData()' method " + e);
			return null;
		}finally
		{
			try {
				fin.close();
				fin = null;
				prop = null;
			}catch(Exception e) {}
		}
	}
}
