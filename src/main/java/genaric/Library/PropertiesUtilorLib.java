	package genaric.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtilorLib 
{
	public String getDataFromproperties(String Data) throws Exception
	{
		FileInputStream fis=new FileInputStream(IconstantUtility.Propertiespath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String info=pobj.getProperty(Data);
		return info;
		
			
				}
	}


