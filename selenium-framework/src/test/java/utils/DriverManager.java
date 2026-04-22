package utils;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	
	public static void setDriver(WebDriver driver) {
		dr.set(driver);
	}
	
	public static WebDriver getDriver()
	{
		return dr.get();
	}
	
	public static void unload()
	{
		dr.remove();
	}
}
