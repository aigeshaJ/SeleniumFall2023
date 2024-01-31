package com.fall23.customMethods;


import com.fall23.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MyTestClass {
    @Test
    void demo() throws InterruptedException {
        // Инициализация WebDriver
        WebDriverManager.initChromeDriver();
        // Создание экземпляра WebElementManager
        WebElementManager elementManager = new WebElementManager(WebDriverManager.driver);
        // Открытие веб-сайта
        WebDriverManager.openTheSite("https://demoqa.com/links");
        WebElement unauth = elementManager.findByPartialLinkText("Unauth");
        // Прокрутка страницы
        elementManager.scrollBy(0, 600);
        unauth.click();
        Thread.sleep(5000);
        // Закрытие и завершение работы с WebDriver
        WebDriverManager.closeDriver();
    }
    @Test
    void test123() throws InterruptedException {
        // Инициализация WebDriver
        WebDriverManager.initChromeDriver();

        // Создание экземпляра WebElementManager
        WebElementManager elementManager = new WebElementManager(WebDriverManager.driver);

        // Открытие веб-сайта
        WebDriverManager.openTheSite("https://demoqa.com/links");

        // Пример использования метода findByLinkText из WebElementManager
        WebElement home = elementManager.findByLinkText("Home");
        home.click();
        Thread.sleep(5000);

        // Закрытие и завершение работы с WebDriver
        WebDriverManager.closeDriver();
    }
    @Test
    void byIdTest() {
        // Инициализация WebDriver
        WebDriverManager.initChromeDriver();
        // Создание экземпляра WebElementManager
        WebElementManager elementManager = new WebElementManager(WebDriverManager.driver);
        // Открытие веб-сайта
        WebDriverManager.openTheSite("https://demoqa.com/text-box");
        // Пример использования методов findById и scrollBy из WebElementManager
        WebElement userNameInput = elementManager.findById("userName");
        WebElement email = elementManager.findById("userEmail");
        WebElement currentAddressInput = elementManager.findById("currentAddress");
        WebElement permanentAddressInput = elementManager.findById("permanentAddress");
        userNameInput.sendKeys("John");
        email.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("Sovetskaya");
        permanentAddressInput.sendKeys("Sivet 55");
        // Прокрутка страницы
        elementManager.scrollBy(0, 600);
        WebElement submitBtn = elementManager.findById("submit");
        submitBtn.click();
        // Закрытие и завершение работы с WebDriver
        WebDriverManager.closeDriver();
    }



}