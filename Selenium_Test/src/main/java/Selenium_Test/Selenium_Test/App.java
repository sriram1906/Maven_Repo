package Selenium_Test.Selenium_Test;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	FirefoxDriver driver = new FirefoxDriver();
    	driver.get("http://www.google.com");
    }
}
