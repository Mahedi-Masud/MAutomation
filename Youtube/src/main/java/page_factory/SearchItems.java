package page_factory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mahedi on 9/14/2016.
 */
public class SearchItems {

    WebDriver pageObjectDriver;
    @FindBy(how = How.ID, using = "#masthead-search-term")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement searchSubmit ;

    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }
    public void clearSearchInput(){
        searchInput.clear();
    }
}
