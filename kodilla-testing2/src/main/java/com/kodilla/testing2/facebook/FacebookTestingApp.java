package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {
    private static final String BUTTON_NEW_ACCOUNT = "//*[@id=\"u_0_2\"]";
    private static final String XPATH_DAY = "//*[@id=\"day\"]";
    private static final String XPATH_MONTH = "//*[@id=\"month\"]";
    private static final String XPATH_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(BUTTON_NEW_ACCOUNT)).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);// 1 minute
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_DAY)));

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByValue("2");

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("11");

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1999");

    }
}
