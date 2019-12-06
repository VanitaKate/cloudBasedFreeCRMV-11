

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerifyConfig {
	Logger logger=LogManager.getLogger();
	static Properties pro;
	public static void main(String[] args) {	
			try {
			File src=new File("./Configuration/config.properties");
			FileInputStream fis=new FileInputStream(src);
		    pro=new Properties();
			pro.load(fis);
			}catch(Exception e) {
				System.out.println(e.getMessage());	
			}
String chromePath=getChromePath();
System.out.println(chromePath);
	}


	public static String getChromePath() {
		String chromePath=pro.getProperty("chromePath");
		return chromePath;
	}
	public String getFireFoxPath() {
		String fireFoxPath=pro.getProperty("fireFoxPath");
		return fireFoxPath;
	}
}
