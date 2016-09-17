package home;

import common.Base;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by mahedi on 9/14/2016.
 */
public class Search extends Base{
    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Politics"},
                {"Tech"},
        };
    }
    @Test(dataProvider = "items")
    public void test1(String data) throws InterruptedException {
        BasicConfigurator.configure();
//        logger.setLevel(Level.INFO);
//        logger.info("Cnn search test started");
        clickByCss("#search-button");
        typeByCss("#search-input-field", data);
        sleepFor(5);
    }
}
