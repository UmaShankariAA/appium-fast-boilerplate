package pages.apidemos.home;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.apidemos.logtextbox.LogTextBoxPage;

public class APIDemosHomePage extends BasePage {
    private final By textButton = By.xpath("//android.widget.TextView[@content-desc=\"Text\"]");
    private final By contentButton = By.xpath("//android.widget.TextView[@content-desc=\"Content\"]");

    private final By logTextBoxButton = By.xpath("//android.widget.TextView[@content-desc=\"LogTextBox\"]");

    public APIDemosHomePage(AppiumDriver driver) {
        super(driver);
    }

    public APIDemosHomePage openText() {
        WebElement text = getElement(textButton);
        click(text);
        return this;
    }

    public APIDemosHomePage openContent() {
        WebElement content = getElement(contentButton);
        click(content);
        driver.navigate().back();
        return this;
    }

    public LogTextBoxPage tapOnLogTextBox() {
        WebElement logTextBoxButtonElement = getElement(logTextBoxButton);
        waitForElementToBeVisible(logTextBoxButtonElement);

        click(logTextBoxButtonElement);

        return new LogTextBoxPage(driver);
    }



}
