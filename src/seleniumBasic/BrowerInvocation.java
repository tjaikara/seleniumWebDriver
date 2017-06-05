package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by tony_aikara on 6/1/17.
 */
public class BrowerInvocation
{
    public static void main(String [] args){

        System.out.println("Selenium world");

        WebDriver webDriver = new ChromeDriver();

        WebDriver webDriver1 = new FirefoxDriver();

    }
}
