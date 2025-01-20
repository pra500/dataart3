package pac3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Orange {


    WebDriver driver;


    @BeforeClass
    public void set() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.amazon.in/");


    }


    @AfterClass
    public void tear() {


        driver.quit();
    }

    @Test
    public void title() {

        System.out.println(driver.getTitle());
//driver.getTitle();


    }


    @Test(priority = 1)
    public void url() {
        System.out.println(driver.getCurrentUrl());
//driver.getCurrentUrl();

    }


    @Test(priority = 2)
    public void links() {

        List<WebElement> list =
                driver.findElements(By.tagName("a"));

        System.out.println(list.size());


    }


    @Test(priority = 3)
    public void input() {

        List<WebElement> list =
                driver.findElements(By.tagName("input"));

        System.out.println(list.size());


    }

    @Test(priority = 4)
    public void buttons() {

        List<WebElement> list =
                driver.findElements(By.tagName("button"));

        System.out.println(list.size());


    }


    @Test(priority = 5)
    public void tbody() {

        List<WebElement> list =
                driver.findElements(By.tagName("tbody"));

        System.out.println(list.size());


    }


    @Test(priority = 6)
    public void images() {

        List<WebElement> list =
                driver.findElements(By.tagName("img"));

        System.out.println(list.size());


    }

    @Test(priority = 7)
    public void windowid() {

        System.out.println(driver.getWindowHandle());
//driver.getWindowHandle()


    }


    @Test(priority = 8)
    public void getwindowid() {

        System.out.println(driver.getWindowHandle());
//driver.getWindowHandle()


    }

    @Test(priority = 10)
    public void windowids() {

        Set<String> set = driver.getWindowHandles();
        System.out.println(set.size());
//driver.getWindowHandle()


    }

    @Test(priority = 10)
    public void wi() {

        boolean s = driver.getTitle().contains("ama");
        System.out.println(s);
//driver.getWindowHandle()









    }


}
