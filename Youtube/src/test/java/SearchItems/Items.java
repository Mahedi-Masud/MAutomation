package SearchItems;

import DatatoSearch.ItemsToBeSearched;
import common.Base;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import page_factory.SearchItems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahedi on 9/14/2016.
 */
public class Items extends Base {

@Test
    public void searchUsingExcelFile()throws IOException,InterruptedException {
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        //Read search.data from excel file
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String[] value = itemsToBeSearched.getData();

        List<String> list = new ArrayList<String>();

        for (String read : value) {
            search.searchFor(read);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
