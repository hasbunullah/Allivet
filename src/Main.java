import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {


        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement Username= driver.findElement(By.id("user-name"));
        Username.sendKeys("standard_user");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Password= driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement LoginButton= driver.findElement(By.id("login-button"));
        LoginButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement button= driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        button.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement item= driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        item.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement cart= driver.findElement(By.xpath(" //a[@class='shopping_cart_link']"));
        cart.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Checkout= driver.findElement(By.id("checkout"));
        Checkout.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement FirstName= driver.findElement(By.id("first-name"));
        FirstName.sendKeys("Babar");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement LastName= driver.findElement(By.id("last-name"));
        LastName.sendKeys("Azam");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement ZipCode= driver.findElement(By.id("postal-code"));
        ZipCode.sendKeys("12345");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement CheckoutButton= driver.findElement(By.id("continue"));
        CheckoutButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Finish= driver.findElement(By.id("finish"));
        Finish.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement HomePage= driver.findElement(By.id("back-to-products"));
        HomePage.click();
//
////        WebElement Menu= driver.findElement(By.id("react-burger-menu-btn"));
////        Menu.click();
////
////        WebElement Menu2= driver.findElement(By.xpath("//select[@class='product_sort_container']"));
////        Menu2.click();
////
////        try {
////            Thread.sleep(2000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////
////        Select dropdown = new Select(Menu2);
////
////        // Option 1: Select by visible text
////        dropdown.selectByIndex(1);
////
////        WebElement LoginButton= driver.findElement(By.id("login-button"));
////        LoginButton.click();
//
////        WebElement errorMessage= driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]"));
////
////
////        String actualResult= errorMessage.getText();
////        String expectedResult= "Epic sadface: Usernam is required";
////
////        if (actualResult.equals(expectedResult)){
////            System.out.println("Test case has been passed");
////        }
////        else{
////            System.out.println("Test case has been failed");
////        }
    }
}


