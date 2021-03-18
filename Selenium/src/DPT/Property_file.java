package DPT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_file {
	@Test
	public void common() throws IOException
	{
		FileInputStream files=new FileInputStream("./commondata.properties.txt");
		Properties prop=new Properties();
		prop.load(files);
		 String url = prop.getProperty("url");
		 System.out.println(url);
	}
}
