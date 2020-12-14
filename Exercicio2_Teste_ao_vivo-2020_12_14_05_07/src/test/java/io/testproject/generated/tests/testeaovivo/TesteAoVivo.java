package io.testproject.generated.tests.testeaovivo;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: Teste ao vivo
 * Generated by: CRISTIANO LEOPOLDO SCHROEDER (cristianoleopoldoschroeder@gmail.com)
 * Generated on Mon Dec 14 05:07:03 GMT 2020.
 */
@DisplayName("Teste ao vivo")
public class TesteAoVivo implements ExceptionsReporter {
  public static WebDriver driver;

  /**
   * ApplicationURL test parameter
   */
  public String ApplicationURL = "https://www.petz.com.br";

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("YWHZJqJnJYj6IerS-LF3wu9Bw2o_stirNkf_wzQ8_W0", new FirefoxOptions(), "CRISTIANO LEOPOLDO SCHROEDER");
  }

  @DisplayName("Teste ao vivo")
  @Test
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Navigate to '{{ApplicationURL}}'
    //    Navigates the specified URL (Auto-generated)
    driver.navigate().to(ApplicationURL);

    // 2. Click 'q1'
    by = By.cssSelector("#search");
    driver.findElement(by).click();

    // 3. Type 'Ração' in 'q1'
    by = By.cssSelector("#search");
    driver.findElement(by).sendKeys("Ração");

    // 4. Click '1'
    by = By.xpath("//button[. = '\n							\n						']");
    driver.findElement(by).click();

    // 5. Click 'Ra&ccedil;&atilde;o Royal Canin Maxi ...'
    by = By.xpath("//h3[. = 'Ração Royal Canin Maxi - Cães Adultos - 15kg']");
    driver.findElement(by).click();

    // 6. Click 'Adicionar ao carrinho1'
    by = By.cssSelector("#adicionarAoCarrinho");
    driver.findElement(by).click();

    // 7. Click 'SPAN'
    by = By.xpath("//button[2]/span");
    driver.findElement(by).click();

    // 8. Click 'SPAN1'
    by = By.xpath("//button[2]/span");
    driver.findElement(by).click();

    // 9. Click 'SPAN'
    by = By.xpath("//button[2]/span");
    driver.findElement(by).click();

    // 10. Click 'insira seu cupom/vale'
    by = By.cssSelector("#botaoCupom");
    driver.findElement(by).click();

    // 11. Click 'cupomDesconto'
    by = By.cssSelector("#cupomDesconto");
    driver.findElement(by).click();

    // 12. Type '1212' in 'cupomDesconto'
    by = By.cssSelector("#cupomDesconto");
    driver.findElement(by).sendKeys("1212");

    // 13. Click 'Aplicar'
    by = By.cssSelector("#aplicaCupom");
    driver.findElement(by).click();

    // 14. Click 'Entendi'
    by = By.xpath("//a[. = 'Entendi']");
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
