package library;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {
    private WebDriver driver;
    public int ONE_SEC = 1000;
    public int TWO_SEC = 2000;
    public int DELAY = 200;
    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    WebElement inputEmail;

    public CommonFunctions(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void waitVisible(WebDriver driver, WebElement element ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(TWO_SEC));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void sleep(WebDriver driver, int time ){
        driver.manage().timeouts().setScriptTimeout(time, TimeUnit.MILLISECONDS);
    }
    public void openWebPage(WebDriver driver) {
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        driver.get("https://test-form.vendon.net/");
        driver.manage().window().setSize(new Dimension(1800, 1200));
        waitVisible(driver, inputEmail);
    }

}
