
package page_objects;
import library.CommonFunctions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactFormPage {

    private WebDriver driver;
    private CommonFunctions env;

    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    WebElement inputEmail;
    @FindBy(how = How.XPATH, using = "//*[@id=\"age\"]")
    WebElement inputAge;
    @FindBy(how = How.XPATH, using = "//*[@id=\"message\"]")
    WebElement inputMessage;
    @FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
    WebElement inputPhoneNumber;
    @FindBy(how = How.XPATH, using = "/html/body/form/button")
    WebElement buttonSubmit;

    public ContactFormPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setPhoneNumber(String number){
        inputPhoneNumber.clear();
        inputPhoneNumber.sendKeys(number + Keys.ENTER);
    }
    public void setEmail(String email){
        inputEmail.clear();
        inputEmail.sendKeys(email + Keys.ENTER);
    }
    public void setAge(String age){
        inputAge.clear();
        inputAge.sendKeys(age + Keys.ENTER);
    }
    public void setMessage(String message){
        inputMessage.clear();
        inputMessage.sendKeys(message + Keys.ENTER);
    }
    public void clickSubmit(){
        buttonSubmit.click();
        env.sleep(this.driver,env.ONE_SEC);
    }
}