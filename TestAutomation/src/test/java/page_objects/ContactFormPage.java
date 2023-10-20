
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
    public String validEmail = "user@server.de";
    public String message = "my email is user@server.de";

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
        env = new CommonFunctions(this.driver);
    }
    public void setPhoneNumber(String number){
        inputPhoneNumber.clear();
        inputPhoneNumber.sendKeys(number + Keys.TAB);
    }
    public void setEmail(String email){
        inputEmail.clear();
        inputEmail.sendKeys(email + Keys.TAB);
    }
    public void setAge(String age){
        inputAge.clear();
        inputAge.sendKeys(age + Keys.TAB);
    }
    public void setMessage(String message){
        inputMessage.clear();
        inputMessage.sendKeys(message + Keys.TAB);
    }
    public void clickSubmit(){
        buttonSubmit.click();
        env.sleep(this.driver,env.ONE_SEC);
    }
}