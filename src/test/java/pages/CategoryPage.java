package pages;


import components.Filters;
import org.openqa.selenium.WebDriver;

public class CategoryPage {

    private Filters filters;

    public CategoryPage(WebDriver driver) {
        this.filters = new Filters(driver);
    }

    public Filters getFilters() {
        return filters;
    }
}
