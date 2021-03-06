package io.testproject.generated.tests.exercicio4;

import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: Teste Simples A
 * Generated by: CRISTIANO LEOPOLDO SCHROEDER (cristianoleopoldoschroeder@gmail.com)
 * Generated on Mon Dec 14 05:08:41 GMT 2020.
 */
@DisplayName("Teste Simples A")
public class TesteSimplesa implements ExceptionsReporter {
  public static WebDriver driver;

  /**
   * ApplicationURL test parameter
   */
  public String ApplicationURL = "https://www.blazedemo.com/";

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("YWHZJqJnJYj6IerS-LF3wu9Bw2o_stirNkf_wzQ8_W0", new FirefoxOptions(), "CRISTIANO LEOPOLDO SCHROEDER");
  }

  @DisplayName("Teste Simples A")
  @Test
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Navigate to '{{ApplicationURL}}'
    //    Navigates the specified URL (Auto-generated)
    driver.navigate().to(ApplicationURL);

    // 2. Click 'fromPort'
    by = By.cssSelector("[name='fromPort']");
    driver.findElement(by).click();

    // 3. Select the 'Philadelphia' option in 'fromPort'
    by = By.cssSelector("[name='fromPort']");
    (new Select(driver.findElement(by))).selectByValue("Philadelphia");

    // 4. Click 'fromPort'
    by = By.cssSelector("[name='fromPort']");
    driver.findElement(by).click();

    // 5. Click 'toPort'
    by = By.cssSelector("[name='toPort']");
    driver.findElement(by).click();

    // 6. Select the 'Berlin' option in 'toPort'
    by = By.cssSelector("[name='toPort']");
    (new Select(driver.findElement(by))).selectByValue("Berlin");

    // 7. Click 'toPort'
    by = By.cssSelector("[name='toPort']");
    driver.findElement(by).click();

    // 8. Click 'INPUT'
    by = By.xpath("//input");
    driver.findElement(by).click();

    // 9. Click 'INPUT1'
    by = By.xpath("//tr[1]/td/input");
    driver.findElement(by).click();

    // 10. Click 'inputName'
    by = By.cssSelector("#inputName");
    driver.findElement(by).click();

    // 11. Type 'cristiano' in 'inputName'
    by = By.cssSelector("#inputName");
    driver.findElement(by).sendKeys("cristiano");

    // 12. Type '12' in 'address'
    by = By.cssSelector("#address");
    driver.findElement(by).sendKeys("12");

    // 13. Type 'pomerode' in 'city'
    by = By.cssSelector("#city");
    driver.findElement(by).sendKeys("pomerode");

    // 14. Type 'sc' in 'state'
    by = By.cssSelector("#state");
    driver.findElement(by).sendKeys("sc");

    // 15. Scroll window by ('0','229')
    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,229)","");

    // 16. Type '89107000' in 'zipCode'
    by = By.cssSelector("#zipCode");
    driver.findElement(by).sendKeys("89107000");

    // 17. Click 'creditCardNumber'
    by = By.cssSelector("#creditCardNumber");
    driver.findElement(by).click();

    // 18. Type '121212' in 'creditCardNumber'
    by = By.cssSelector("#creditCardNumber");
    driver.findElement(by).sendKeys("121212");

    // 19. Type 'sabath' in 'nameOnCard'
    by = By.cssSelector("#nameOnCard");
    driver.findElement(by).sendKeys("sabath");

    // 20. Click 'INPUT2'
    by = By.xpath("//div[11]/div/input");
    driver.findElement(by).click();

    // 21. Click 'home'
    by = By.xpath("//a[. = 'home']");
    driver.findElement(by).click();

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }
}
