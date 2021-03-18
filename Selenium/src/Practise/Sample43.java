package Practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Sample43{
	@Test
	public void linkk() throws IOException
	{
	FileInputStream fil=new FileInputStream("./commondata.properties.txt");
	Properties pro=new Properties();
	pro.load(fil);
	String url = pro.getProperty("url");
	String un = pro.getProperty("username");
	String pwd = pro.getProperty("password");
	System.out.println(url);
	}
}
