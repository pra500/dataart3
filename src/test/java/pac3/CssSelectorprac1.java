package pac3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CssSelectorprac1 {


    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        driver.get("https://practicetestautomation.com/practice-test-login/");


        boolean b=
driver.findElement(By.cssSelector("section[id='login'] h2")).isDisplayed();
        System.out.println(b);



        boolean b1=
driver.findElement(By.cssSelector("#password")).isDisplayed();
        System.out.println(b1);




    }

}
