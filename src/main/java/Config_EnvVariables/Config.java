package Config_EnvVariables;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	
	
	public static String getProperty(String Key)
	{
		String value="";
		try
		{
		FileInputStream fis= new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\RestAssuredApiAutomation\\src\\main\\java\\Config_EnvVariables\\Config.properties");
		
		Properties props= new Properties();
		
		
		
		props.load(fis);
		
		value=props.getProperty(Key);
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
		
		
		
	}

}
