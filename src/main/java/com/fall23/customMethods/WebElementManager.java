package com.fall23.customMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementManager {

    private WebDriver driver;
    // метод для поиска элемента по переданному локатору
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }
    // Метод для поиска элемента по его ID
    public WebElement findById(String id) {
        return findElement(By.id(id));
    }
    // Метод для поиска элемента по его имени
    public WebElement findByName(String name) {
        return findElement(By.name(name));
    }
    // Метод для поиска элемента по его тегу (названию тега)
    public WebElement findByTagName(String tagName) {
        return findElement(By.tagName(tagName));
    }
    // Метод для поиска элемента по его классу
    public WebElement findByClassName(String className) {
        return findElement(By.className(className));
    }
    // Метод для поиска ссылки по полному тексту
    public WebElement findByLinkText(String linkText) {
        return findElement(By.linkText(linkText));
    }
    // Метод для поиска ссылки по частичному тексту
    public WebElement findByPartialLinkText(String partialLinkText) {
        return findElement(By.partialLinkText(partialLinkText));
    }
    // Метод для поиска элемента с использованием XPath выражения
    public WebElement findByXPath(String xpathExpression) {
        return findElement(By.xpath(xpathExpression));
    }
    // Метод для выполнения прокрутки страницы
    public void scrollBy(int offsetX, int offsetY) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = String.format("window.scrollBy(%d, %d)", offsetX, offsetY);
        js.executeScript(script);
    }
    // Конструктор класса, принимает WebDriver и сохраняет его для последующего использования
    public WebElementManager(WebDriver driver) {
        this.driver = driver;
    }
}