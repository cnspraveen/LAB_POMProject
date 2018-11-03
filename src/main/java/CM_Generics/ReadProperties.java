package CM_Generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.asserts.SoftAssert;

public class ReadProperties
{	
	public static String getPropValue(String path,String key)	
	{
		Properties prop=new Properties();
		try{
		//File file = new File(path);
		InputStream inputstream = new FileInputStream(path);
		//Loading properties file
		prop.load(inputstream);
		}
		catch(Exception e)
		{e.printStackTrace();}
		
	//	{e.printStackTrace();}
		finally{return(prop.getProperty(key));}
		}
	
	public static void assertCheck(String expectedString,String actualString)	
	{
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(expectedString,actualString);
		System.out.println("Assert check complete");
	}
}
