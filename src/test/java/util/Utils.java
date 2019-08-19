package util;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Utils {

    /*
     * TODO - Move to specified class and remove driver from arguments
     *  */
    public static void selectRandom(List<WebElement> elements, WebDriver driver) {
        if (CollectionUtils.isNotEmpty(elements)) {
            int randomSubcategoryIndex = new Random().nextInt(elements.size());
            WebElement element = elements.get(randomSubcategoryIndex);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }
}
