package page_objects;

import library.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage {

    private WebDriver driver;
    private CommonFunctions env;
    @FindBy(how = How.XPATH, using = "/html/body/hp-app-root/hp-home-container/hp-home/hp-search-widget-container/hp-search-widget/div/hp-search-widget-tabs-container/button[2]/hp-search-widget-tab/div")
    WebElement menuMainCarRent;

    public ResultPage(WebDriver driver){
        this.driver = driver;
        env = new CommonFunctions(this.driver);
        PageFactory.initElements(driver, this);
    }
    public boolean searchText(String text){
        boolean found = false;

        List<WebElement> messages = driver.findElements(By.cssSelector("p"));

        if(messages.size()==0){
            if(driver.findElement(By.tagName("body")).getText().compareTo(text) == 0){
                found = true;
            }
        }else{
            for(WebElement message : messages){
                if(message.getText().compareTo(text) == 0){
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
}
