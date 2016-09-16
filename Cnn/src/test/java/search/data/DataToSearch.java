package search.data;

import common.Base;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by mahedi on 9/14/2016.
 */
public class DataToSearch extends Base {



    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Politics"} ,
                {"Money"} ,
                {"Tech"},
        };
    }
    @Test(dataProvider = "items")
    public void test1(String data) throws InterruptedException {
        BasicConfigurator.configure();
//        logger.setLevel(Level.INFO);
//        logger.info("Cnn search test started");
        clickByCss("#search-button");
        sleepFor(5);
        typeByCss("#search-input-field", data);
        sleepFor(5);
        clickByCss("#submit-button");
        sleepFor(5);
    }
}
