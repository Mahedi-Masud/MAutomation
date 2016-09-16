package search.data.reader;

import common.Base;

/**
 * Created by mahedi on 9/14/2016.
 */
public class TestAction extends Base{

    public void ClickOnSearch() {
        clickByCss("#search-button");
    }
    public void TypeOnSearch(){
        typeByCss("#search-input-field", "tech");
    }
}
