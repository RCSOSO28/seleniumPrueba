package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class SearchActions extends UIInteractions {
    @Step("Search for '{0}'")
    public void byKeyword(String keyword) {
        $("#search_form_input_homepage").sendKeys(keyword);
        $(".search__button").click();
    }
}
