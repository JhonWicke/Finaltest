import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class TestClass {
    ChromeDriver chromeDriver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }
    @Test(groups = "group1")
    public void testNavigation_A() {

        chromeDriver.get("http://localhost:8080/user/home");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Xử lý hoặc báo cáo lỗi khi có Exception
            e.printStackTrace();
        }
        WebElement cartIcon = chromeDriver.findElement(By.cssSelector("i.zmdi.zmdi-shopping-cart"));
        cartIcon.click();
    }
    @Test(groups = "group2", dependsOnGroups = "group1")
    public void TestLoginAdmin_B(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys("admin1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys("admin1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(groups = "group3", dependsOnGroups = "group2")
    public void Loginuser_C(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys("user1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys("user1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(groups = "group4", dependsOnGroups = "group3")
    public void Loginsale_D(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys("sale1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys("sale1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test(groups = "group5", dependsOnGroups = "group4")
    public void LoginStock_E(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys("stock1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys("stock1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test(groups = "group6", dependsOnGroups = "group5")
    public void Loginvalidate(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys(" ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys("user1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test(groups = "group7", dependsOnGroups = "group6")
    public void LoginvalidateP(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys("user1 ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys(" ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test(groups = "group8", dependsOnGroups = "group7")
    public void ForgotPserro(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement resetPasswordLink = chromeDriver.findElement(By.cssSelector("a.resetpass"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", resetPasswordLink);
        resetPasswordLink.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameInput = chromeDriver.findElement(By.cssSelector("input.ip-rs-pw"));
        usernameInput.sendKeys(" ");
        WebElement passwordInput = chromeDriver.findElement(By.cssSelector("input.ip-rs-pw"));
        passwordInput.sendKeys(" ");
        WebElement sendOTPButton = chromeDriver.findElement(By.cssSelector("button.button-resetpass"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", sendOTPButton);
        sendOTPButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test(groups = "group9", dependsOnGroups = "group8")
    public void ForgotPs(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement resetPasswordLink = chromeDriver.findElement(By.cssSelector("a.resetpass"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", resetPasswordLink);
        resetPasswordLink.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameInput = chromeDriver.findElement(By.cssSelector("input.ip-rs-pw"));
        usernameInput.sendKeys("user1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement passwordInput = chromeDriver.findElement(By.id("password-reset"));
        passwordInput.sendKeys("user1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement passwordConfirmInput = chromeDriver.findElement(By.id("password-reset-confirm"));
        passwordConfirmInput.sendKeys("user1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement sendOTPButton = chromeDriver.findElement(By.cssSelector("button.button-resetpass"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", sendOTPButton);
        sendOTPButton.click();
        try {
            Thread.sleep(22000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement otpContainer = chromeDriver.findElement(By.cssSelector("div.otp-container"));
        WebElement inputsOTP = otpContainer.findElement(By.id("inputs-otp"));
        WebElement[] otpInputs = inputsOTP.findElements(By.cssSelector("input.input-otp")).toArray(new WebElement[0]);
        String otpValue = "123456";
        for (int i = 0; i < otpValue.length(); i++) {
            otpInputs[i].sendKeys(String.valueOf(otpValue.charAt(i)));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test(groups = "group10", dependsOnGroups = "group9")
    public void CheckSigup(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement signUpButton = chromeDriver.findElement(By.id("sign-up-btn"));
        signUpButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.username']"));
        usernameField.sendKeys(" ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement passwordField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.password']"));
        passwordField.sendKeys("12345");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement confirmPassField = chromeDriver.findElement(By.cssSelector("input[ng-model='confirmPass']"));
        confirmPassField.sendKeys("12345");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement firstNameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.surname']"));
        firstNameField.sendKeys("Devit");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement nameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.name']"));
        nameField.sendKeys("Dovit");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement emailField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.email']"));
        emailField.sendKeys("email@example.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement signUpButtonn = chromeDriver.findElement(By.cssSelector("input[ng-click='create()'][type='button']"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", signUpButtonn);
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].click();", signUpButtonn);
        WebElement errorMessage = chromeDriver.findElement(By.cssSelector("div.error-message.ng-binding[ng-show='errors.username']"));

        if (errorMessage.isDisplayed()) {
            System.out.println("Eroor: " + errorMessage.getText());
        } else {
            System.out.println("No erro");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(groups = "group11", dependsOnGroups = "group10")
    public void CheckSigupP(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement signUpButton = chromeDriver.findElement(By.id("sign-up-btn"));
        signUpButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.username']"));
        usernameField.sendKeys("user2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement passwordField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.password']"));
        passwordField.sendKeys("123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement confirmPassField = chromeDriver.findElement(By.cssSelector("input[ng-model='confirmPass']"));
        confirmPassField.sendKeys("123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement firstNameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.surname']"));
        firstNameField.sendKeys("Devit");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement nameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.name']"));
        nameField.sendKeys("Dovit");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement emailField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.email']"));
        emailField.sendKeys("email@example.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement signUpButtonn = chromeDriver.findElement(By.cssSelector("input[ng-click='create()'][type='button']"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", signUpButtonn);
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].click();", signUpButtonn);

        WebElement errorMessage = chromeDriver.findElement(By.cssSelector("div.error-message.ng-binding[ng-show='errors.password']"));
        if (errorMessage.isDisplayed()) {
            System.out.println("Eroor: " + errorMessage.getText());
        } else {
            System.out.println("No erro");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(groups = "group12", dependsOnGroups = "group11")
    public void CheckSigupCrmps(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement signUpButton = chromeDriver.findElement(By.id("sign-up-btn"));
        signUpButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.username']"));
        usernameField.sendKeys("user2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement passwordField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.password']"));
        passwordField.sendKeys("12345");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement confirmPassField = chromeDriver.findElement(By.cssSelector("input[ng-model='confirmPass']"));
        confirmPassField.sendKeys("123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement firstNameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.surname']"));
        firstNameField.sendKeys("Devit");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement nameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.name']"));
        nameField.sendKeys("Dovit");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement emailField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.email']"));
        emailField.sendKeys("email@example.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement signUpButtonn = chromeDriver.findElement(By.cssSelector("input[ng-click='create()'][type='button']"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", signUpButtonn);
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].click();", signUpButtonn);

        WebElement errorMessage = chromeDriver.findElement(By.cssSelector("div.error-message.ng-binding"));
        if (errorMessage.isDisplayed()) {
            System.out.println("Eroor: " + errorMessage.getText());
        } else {
            System.out.println("No erro");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(groups = "group13", dependsOnGroups = "group12")
    public void SigupLogin(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement signUpButton = chromeDriver.findElement(By.id("sign-up-btn"));
        signUpButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.username']"));
        usernameField.sendKeys("user5");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement passwordField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.password']"));
        passwordField.sendKeys("user5");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement confirmPassField = chromeDriver.findElement(By.cssSelector("input[ng-model='confirmPass']"));
        confirmPassField.sendKeys("user5");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement firstNameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.surname']"));
        firstNameField.sendKeys("Devit");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement nameField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.name']"));
        nameField.sendKeys("Dovit");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement emailField = chromeDriver.findElement(By.cssSelector("input[ng-model='form.email']"));
        emailField.sendKeys("5email@example.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement signUpButtonn = chromeDriver.findElement(By.cssSelector("input[ng-click='create()'][type='button']"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", signUpButtonn);
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].click();", signUpButtonn);
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement signInButton = chromeDriver.findElement(By.cssSelector("button#sign-in-btn.btn.transparent"));
        signInButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameInputElement = chromeDriver.findElement(By.name("username"));
        usernameInputElement.sendKeys("user5");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement passwordInputElement = chromeDriver.findElement(By.name("password"));
        passwordInputElement.sendKeys("user5");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
    }
//    @Test@Test(groups = "group13", dependsOnGroups = "group12")
//    public void FailGG(){
//        chromeDriver.get("http://localhost:8080/auth/login/form");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        chromeDriver.findElement(By.cssSelector("a[href='#']")).click();
//    }
//    @Test
//    public void FailFB(){
//        chromeDriver.get("http://localhost:8080/auth/login/form");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        chromeDriver.findElement(By.cssSelector("a[href='#']")).click();
//    }
@Test(groups = "group14", dependsOnGroups = "group13")
    public void GioHang() {
        chromeDriver.get("http://localhost:8080/user/home");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys("user1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys("user1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/user/detail/4");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement addToCartButton = chromeDriver.findElement(By.cssSelector("button[ng-click='cart.add(4)']"));
        addToCartButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement okButton = chromeDriver.findElement(By.className("swal-button--confirm"));
        okButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cartIcon = chromeDriver.findElement(By.className("zmdi-shopping-cart"));
        cartIcon.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/cart/view");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement quantityField = chromeDriver.findElement(By.name("quantityField"));
        quantityField.clear();
        quantityField.sendKeys("5");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement removeButton = chromeDriver.findElement(By.cssSelector("button[ng-click='cart.remove(item.id)']"));
        removeButton.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test(groups = "group15", dependsOnGroups = "group14")
    public void GioHangPayment() {
        chromeDriver.get("http://localhost:8080/user/home");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys("user1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys("user1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/user/detail/4");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement addToCartButton = chromeDriver.findElement(By.cssSelector("button[ng-click='cart.add(4)']"));
        addToCartButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement okButton = chromeDriver.findElement(By.className("swal-button--confirm"));
        okButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cartIcon = chromeDriver.findElement(By.className("zmdi-shopping-cart"));
        cartIcon.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/cart/view");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/order/checkout");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement phoneNumberInput = chromeDriver.findElement(By.id("deliveryPhone"));
        phoneNumberInput.clear();
        phoneNumberInput.sendKeys("0987654321");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement addressTextarea = chromeDriver.findElement(By.id("deliveryAddress"));
        addressTextarea.sendKeys("123 Duong Nguyen Hue,Quan 1 , thanh pho Ho Chi Minh ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement codButtonn = chromeDriver.findElement(By.cssSelector("input.submit-btn.cod"));
        codButtonn.click();
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", codButtonn);
        try {
            Thread.sleep(22000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement otpContainer = chromeDriver.findElement(By.cssSelector("div.otp-container"));
        WebElement inputsOTP = otpContainer.findElement(By.id("inputs-otp"));
        WebElement[] otpInputs = inputsOTP.findElements(By.cssSelector("input.input-otp")).toArray(new WebElement[0]);
        String otpValue = "123456";
        for (int i = 0; i < otpValue.length(); i++) {
            otpInputs[i].sendKeys(String.valueOf(otpValue.charAt(i)));
        }
        WebElement verifyOTPButton = chromeDriver.findElement(By.cssSelector("button[ng-click='comfirmOTP()']"));
        verifyOTPButton.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    @Test(groups = "group16", dependsOnGroups = "group15")
    public void Changedetalaccount() {
        chromeDriver.get("http://localhost:8080/user/home");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys("user1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys("user1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/account/detail");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement inputField = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].surname']"));
        inputField.clear();
        inputField.sendKeys("Test1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement labelElement = chromeDriver.findElement(By.xpath("//label[@for='inputLastName' and text()='Last Name']"));
        WebElement inputFieldd = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].name']"));
        inputFieldd.clear();
        inputFieldd.sendKeys("Er");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement labelElementt = chromeDriver.findElement(By.xpath("//label[@for='inputBirthDay' and text()='Birth Day']"));
        WebElement inputFields = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].dateOfBirth']"));
        inputFields.sendKeys("12-12-1999");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        WebElement labelElements = chromeDriver.findElement(By.xpath("//label[@for='gender-select' and text()='Gender']"));
        WebElement radioButtonMale = chromeDriver.findElement(By.cssSelector("[type='radio'][value='MALE']"));
        WebElement radioButtonFemale = chromeDriver.findElement(By.cssSelector("[type='radio'][value='FEMALE']"));
        WebElement warningIcon = chromeDriver.findElement(By.cssSelector("i.fa-solid.fa-triangle-exclamation"));
        radioButtonMale.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        WebElement inputElement = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].phoneNumber']"));
        inputElement.sendKeys("0987654321");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement inputElements = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].idCard']"));
        inputElements.clear();
        inputElements.sendKeys("0313822512");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement hometows = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].hometown']"));
        hometows.sendKeys("Ha Noi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement textareaElement = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].deliveryAddress']"));
        textareaElement.sendKeys("distress 1 ,Ha Noi city");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement textareaRElement = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].residentialAddress']"));
        textareaRElement.sendKeys("distress 1 ,Ha Noi city");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement containerElement = chromeDriver.findElement(By.cssSelector(".button-account-detail "));
        WebElement submitButtons = containerElement.findElement(By.cssSelector(".button-50.submit-btn50"));
        submitButtons.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement okButton = chromeDriver.findElement(By.cssSelector("[ng-click='accDetail.updateDataAccount()']"));
        okButton.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test(groups = "group17", dependsOnGroups = "group16")
    public void TestErroEmail() {
        chromeDriver.get("http://localhost:8080/user/home");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys("user5");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys("user5");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.get("http://localhost:8080/account/detail");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement inputField = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].surname']"));
        inputField.clear();
        inputField.sendKeys("Test1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement labelElement = chromeDriver.findElement(By.xpath("//label[@for='inputLastName' and text()='Last Name']"));
        WebElement inputFieldd = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].name']"));
        inputFieldd.clear();
        inputFieldd.sendKeys("Er");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement labelElementt = chromeDriver.findElement(By.xpath("//label[@for='inputBirthDay' and text()='Birth Day']"));
        WebElement inputFields = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].dateOfBirth']"));
        inputFields.sendKeys("12-12-1999");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        WebElement labelElements = chromeDriver.findElement(By.xpath("//label[@for='gender-select' and text()='Gender']"));
        WebElement radioButtonMale = chromeDriver.findElement(By.cssSelector("[type='radio'][value='MALE']"));
        WebElement radioButtonFemale = chromeDriver.findElement(By.cssSelector("[type='radio'][value='FEMALE']"));
        WebElement warningIcon = chromeDriver.findElement(By.cssSelector("i.fa-solid.fa-triangle-exclamation"));
        radioButtonMale.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        WebElement inputElement = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].phoneNumber']"));
        inputElement.sendKeys("0909222391");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement inputElements = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].idCard']"));
        inputElements.clear();
        inputElements.sendKeys("0313822512");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    WebElement emailElement = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].email']"));
    String placeholder = emailElement.getAttribute("placeholder");
    emailElement.clear();
    emailElement.sendKeys("khoivip37@gmail.com");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    WebElement hometows = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].hometown']"));
        hometows.sendKeys("Ha Noi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement textareaElement = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].deliveryAddress']"));
        textareaElement.sendKeys("distress 1 ,Ha Noi city");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement textareaRElement = chromeDriver.findElement(By.cssSelector("[ng-model='accDetail.userData[0].residentialAddress']"));
        textareaRElement.sendKeys("distress 1 ,Ha Noi city");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement containerElement = chromeDriver.findElement(By.cssSelector(".button-account-detail "));
        WebElement submitButtons = containerElement.findElement(By.cssSelector(".button-50.submit-btn50"));
        submitButtons.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement okButton = chromeDriver.findElement(By.cssSelector("[ng-click='accDetail.updateDataAccount()']"));
        okButton.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test(groups = "group18", dependsOnGroups = "group17")
    public void TestLoginAdminOderFill(){
    chromeDriver.get("http://localhost:8080/auth/login/form");
    WebElement usernameField = chromeDriver.findElement(By.name("username"));
    usernameField.sendKeys("admin1");
    WebElement passwordField = chromeDriver.findElement(By.name("password"));
    passwordField.sendKeys("admin1");
    WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
    submitButton.click();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement editButton = chromeDriver.findElement(By.cssSelector("[ng-click='detail(pro.id)']"));
    editButton.click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
    @Test
    public void TestLoginAdminOderCreart(){
        chromeDriver.get("http://localhost:8080/auth/login/form");
        WebElement usernameField = chromeDriver.findElement(By.name("username"));
        usernameField.sendKeys("admin1");
        WebElement passwordField = chromeDriver.findElement(By.name("password"));
        passwordField.sendKeys("admin1");
        WebElement submitButton = chromeDriver.findElement(By.cssSelector("input[type='submit'][name='submit'].btn.solid"));
        submitButton.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement nameField = chromeDriver.findElement(By.cssSelector("[ng-model='form.name']"));
        nameField.clear();
        nameField.sendKeys("Mo Hinh trai banh");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement categorySelect = chromeDriver.findElement(By.cssSelector("[ng-model='form.category.id']"));
        Select select = new Select(categorySelect);
        select.selectByValue("string:CT001");
        String selectedOptionValue = select.getFirstSelectedOption().getAttribute("value");
        Assert.assertEquals(selectedOptionValue, "string:CT001");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement priceField = chromeDriver.findElement(By.cssSelector("[ng-model='form.price']"));
        priceField.sendKeys("250000");
        String actualPrice = chromeDriver.findElement(By.cssSelector("[ng-model='form.price']")).getAttribute("value");
        Assert.assertEquals(Integer.parseInt(actualPrice), 250000);
        Assert.assertTrue(chromeDriver.findElement(By.cssSelector("[ng-model='form.price']")).getAttribute("class").contains("ng-invalid"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement saleField = chromeDriver.findElement(By.cssSelector("[ng-model='form.sale']"));
        saleField.sendKeys("5");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement dateImportField = chromeDriver.findElement(By.cssSelector("[ng-model='form.date_import']"));
        Assert.assertEquals(dateImportField.getAttribute("class"), "form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required");
        dateImportField.sendKeys("12-12-2022");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement quantityField = chromeDriver.findElement(By.cssSelector("[ng-model='form.quantity']"));
        Assert.assertEquals(quantityField.getAttribute("class"), "form-control ng-pristine ng-untouched ng-empty ng-valid-step ng-invalid ng-invalid-required");
        quantityField.sendKeys("");
        Assert.assertTrue(chromeDriver.findElement(By.cssSelector("[ng-model='form.quantity']")).getAttribute("class").contains("ng-invalid-required"));
        quantityField.sendKeys("2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement mainImageFieldd = chromeDriver.findElement(By.cssSelector("[ng-model='form.main_image']"));
        mainImageFieldd.clear();
        Assert.assertTrue(mainImageFieldd.getAttribute("class").contains("ng-invalid-required"));
        mainImageFieldd.sendKeys("https://tuyenquangtv.vn/file/fb9e3a036ab59c2c016ac3618a0d3aec/fb9e3a036ab59c2c016b2c08c1835d52/122021/soccer_20211221080209.jpg");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement productInfoFieldd = chromeDriver.findElement(By.cssSelector("[ng-model='form.product_information']"));
        productInfoFieldd.clear();
        Assert.assertTrue(productInfoFieldd.getAttribute("class").contains("ng-invalid-required"));
        productInfoFieldd.sendKeys("Trai banh de da bong");
        Assert.assertFalse(productInfoFieldd.getAttribute("class").contains("ng-invalid-required"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement descriptionFieldd = chromeDriver.findElement(By.cssSelector("[ng-model='form.description']"));
        descriptionFieldd.clear();
        Assert.assertTrue(descriptionFieldd.getAttribute("class").contains("ng-invalid-required"));
        descriptionFieldd.sendKeys("Trai bong de da banh");
        Assert.assertFalse(descriptionFieldd.getAttribute("class").contains("ng-invalid-required"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement warrantyPeriodField = chromeDriver.findElement(By.cssSelector("[ng-model='form.warranty_period']"));
        String minAttr = warrantyPeriodField.getAttribute("min");
        Assert.assertEquals("1", minAttr);
        warrantyPeriodField.sendKeys("2");
        Assert.assertTrue(warrantyPeriodField.getAttribute("class").contains("ng-valid"));
        warrantyPeriodField.clear();
        warrantyPeriodField.sendKeys("0");
        Assert.assertTrue(warrantyPeriodField.getAttribute("class").contains("ng-invalid"));
        warrantyPeriodField.clear();
        warrantyPeriodField.sendKeys("10");
        Assert.assertTrue(warrantyPeriodField.getAttribute("class").contains("ng-valid"));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @AfterMethod
    public void tearDown() {
        if (chromeDriver != null) {
            chromeDriver.quit();
        }
    }
}
