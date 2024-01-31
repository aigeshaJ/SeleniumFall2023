package com.fall23.lacators;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class ByID extends BaseTest {

    @Test
    void byIdTest(){
        openTheSite("https://demoqa.com/text-box");
        WebElement userNameInput =driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddressInput=driver.findElement(By.id("currentAddress"));
        WebElement permanentAddressInput= driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn =driver.findElement(By.id("submit"));

        userNameInput.sendKeys("John");
        email.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("Sovetskaya");
        permanentAddressInput.sendKeys("Sivet 55");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        submitBtn.click();



    }



}
