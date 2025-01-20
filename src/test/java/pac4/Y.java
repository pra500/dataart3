package pac4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Y {

    WebDriver driver;

    @Test
    public void ge() throws IOException {

        String filepath = "C:\\Users\\pgupta\\IdeaProjects\\Dataprovidercsv\\src\\test\\java\\pac4\\config.properties";
        Properties prop = new Properties();
        FileInputStream fip = new FileInputStream(filepath);
        prop.load(fip);

        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);

        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");

        driver.quit();



//**********
// jhgvbj






    }


}
