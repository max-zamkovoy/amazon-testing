package util;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Utils {

    public static void selectRandom(List<WebElement> elements) {
        if (CollectionUtils.isNotEmpty(elements)) {
            int randomSubcategoryIndex = new Random().nextInt(elements.size());
            elements.get(randomSubcategoryIndex).click();
        }
    }
}
