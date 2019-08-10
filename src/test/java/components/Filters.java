package components;

import org.openqa.selenium.WebDriver;

public class Filters {

    private DepartmentFilter departmentFilter;

    public Filters(WebDriver driver) {
        this.departmentFilter = new DepartmentFilter(driver);
    }

    public DepartmentFilter getDepartmentFilter() {
        return departmentFilter;
    }
}
