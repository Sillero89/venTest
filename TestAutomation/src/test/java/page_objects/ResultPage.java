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
        env = new CommonFunctions();
        PageFactory.initElements(driver, this);
    }/*
    public CarSearchResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean resultsPageVisible(){
        return menuOptionTravels.getText().compareToIgnoreCase("alquiler de coches")==0;
    }

    private void selectCountry(String country){
        List<WebElement> countryElements = panelCountryAirport.findElements(By.className("classNameCountriesList"));
        for(WebElement element : countryElements){
            List<WebElement> spanCountry = element.findElements(By.cssSelector("span"));
            if(country.compareToIgnoreCase(spanCountry.get(0).getText()) == 0){
                spanCountry.get(0).click();
                break;
            }
        }
    }*/
}
