package starter.duckduckgo;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchingByKeyword {

    @Managed(driver = "chrome")
    WebDriver webDriver;

    NavigateActions navigateActions;
    SearchActions searchActions;
    SearchResultSidebar searchResultSidebar;

    @Test
    void theKeywordShouldAppearInTheResultsSidebar() {
        navigateActions.toTheDuckDuckGoSearchPage();
        searchActions.byKeyword("Cucumber");
        Serenity.reportThat("The keyword should appear in the sidebar heading", () -> assertThat(searchResultSidebar.heading()).isEqualTo("Cucumber"));
    }
}