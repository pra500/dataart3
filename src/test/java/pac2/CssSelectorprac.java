package pac2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CssSelectorprac {


    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("https://naveenautomationlabs.com/opencart/");

        boolean b=
driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
        System.out.println(b);





        boolean b1=
driver.findElement(By.cssSelector("input[placeholder='Search']")).isDisplayed();
        System.out.println(b1);

        boolean b2=    driver.findElement(By.cssSelector(".fa.fa-search")).isDisplayed();
        System.out.println(2);


boolean b3=
        driver.findElement(By.cssSelector("img[title='MacBook']")).isDisplayed();
        System.out.println(b3);


        boolean b4=     driver.findElement(By.cssSelector("div[id='content'] h3")).isDisplayed();

        System.out.println(b4);


    }

}
