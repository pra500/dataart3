package pac111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Multipletestcases {


    WebDriver driver;


    @BeforeClass
    public void s()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }



    @AfterClass
    public void teardown()
    {
        driver.quit();
    }


    @Test
    public void geft() {


        driver.findElement(By.xpath("//input[@placeholder='Username']"))
                .sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder='Password']"))
                .sendKeys("admin123");


        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();//button[normalize-space()='Login']
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("t");
//input[@placeholder='Search']


        //button[normalize-space()='Login']
        //button[normalize-space()='Login']


        //a[@class='oxd-main-menu-item active']//span[1]
    }


    @Test(priority = 1, dependsOnMethods = {"geft"})
    public void gett() {


        //search:

      //  driver.findElement(By.xpath(" //a[@class='oxd-main-menu-item active']//span[1]")).click();

        String title = driver.getTitle();

        Assert.assertEquals(title, "OrangeHRM");


    }

   @Test(priority = 2, dependsOnMethods = {"geft", "gett"})
    public void getddt() {

 boolean b=       driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).isDisplayed();
    String s=    driver.findElement(By.xpath("//a[text()='Vacancies']")).getText();
        System.out.println(s);

        //a[text()='Vacancies']
    }

//new things:


    @Test(priority = 3, dependsOnMethods = {"geft", "gett"})
    public void getddcdfft() {

        boolean b=       driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).isDisplayed();
        String s=    driver.findElement(By.xpath("//a[text()='Vacancies']")).getText();
        System.out.println(s);

        //a[text()='Vacancies']
    }
}




