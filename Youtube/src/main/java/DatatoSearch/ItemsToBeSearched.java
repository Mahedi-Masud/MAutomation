package DatatoSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by mahedi on 9/14/2016.
 */
public class ItemsToBeSearched {

    DataReader dr = new DataReader();
    public String [] getData()throws IOException {
        String path = System.getProperty("user.dir")+"/data/file.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
