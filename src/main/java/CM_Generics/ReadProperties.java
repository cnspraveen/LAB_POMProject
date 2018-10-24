package CM_Generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
}
