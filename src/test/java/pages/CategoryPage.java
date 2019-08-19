package pages;


import components.Breadcrumbs;
import components.Filters;
import org.openqa.selenium.WebDriver;

public class CategoryPage {

    private Filters filters;
    private Breadcrumbs breadcrumbs;

    public CategoryPage(WebDriver driver) {
        this.filters = new Filters(driver);
        this.breadcrumbs = new Breadcrumbs(driver);
    }

    public Filters getFilters() {
        return filters;
    }

    public Breadcrumbs getBreadcrumbs() {
        return breadcrumbs;
    }
}
