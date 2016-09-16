package search.data;

import common.Base;
import org.testng.annotations.Test;
import search.data.reader.ReadData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahedi on 9/14/2016.
 */
public class SearchNews extends Base {

    ReadData readData = new ReadData();
    List<String> list = new ArrayList<String>();

    @Test
    public List<String> getNewsData() throws Exception{
        String [] st = readData.getData();
        String data = "";
        for(String fetch:st){
            list.add(fetch);
        }
        return list;
    }

    public void ClickOnSearch() { clickByCss("#search-button");}
    public void TypeOnSearch() throws Exception {
        for(int i=0; i<list.size(); i++){
            typeByCss("#search-input-field", getNewsData().get(i));
        }

    }
}
