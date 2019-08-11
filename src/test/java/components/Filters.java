package components;

import org.openqa.selenium.WebDriver;

public class Filters {

    private DepartmentFilter departmentFilter;
    private CustomerReviewRatingFilter customerReviewRatingFilter;

    public Filters(WebDriver driver) {
        this.departmentFilter = new DepartmentFilter(driver);
        this.customerReviewRatingFilter = new CustomerReviewRatingFilter(driver);
    }

    public DepartmentFilter getDepartmentFilter() {
        return departmentFilter;
    }

    public CustomerReviewRatingFilter getCustomerReviewRatingFilter() {
        return customerReviewRatingFilter;
    }
}
