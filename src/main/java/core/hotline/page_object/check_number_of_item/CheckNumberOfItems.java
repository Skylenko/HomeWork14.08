package core.hotline.page_object.check_number_of_item;

import core.hotline.page_object.home_page.HomePageHotline;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckNumberOfItems extends HomePageHotline {

    @FindAll({@FindBy(xpath = "//*[@id='scrollbar1']/div[2]/div/ul/li/div[2]/a")})

    private List<WebElement> items;

    public CheckNumberOfItems(WebDriver webDriver) {
        super(webDriver);
    }



    public List<String> getViewResults() {

        List<WebElement> viewResults = driver.findElements(By.xpath("//*[@id='scrollbar1']/div[2]/div/ul/li/div[2]/a"));
        return viewResults.stream()
                .map(element -> element.getText().replaceFirst("Смартфон", "").trim())
                .collect(Collectors.toList());

}
}