package pac3;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class AllanotationsTest {


    @BeforeSuite
    public void methodName1() {

        System.out.println("one");
    }


    @BeforeTest
    public void methodName2() {
        System.out.println("one1");

    }

    @AfterTest
    public void methodName4() {

        System.out.println("one2");
    }


    @Test
    public void geft() {

        System.out.println("hello");

    }



    @Test
    public void gefts() {

        System.out.println("hello1");

    }


    @Test
    public void geftd() {

        System.out.println("hello2");

    }

}