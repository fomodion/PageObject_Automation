package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForumGroupPage {
    public ForumGroupPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    //using By as a locator to identify the login fields
    private By enterFavoriteTopic = By.id("txtFavoriteTopic");
    private By searchButton = By.id("searchButton");
    private By DashboardPage = By.id("");
    private By admin = By.id("");
    private By logoutButton = By.className("");

    public void enterFavoriteTopic(String fName) {
        //find the admin element and click on the admin button
        driver.findElement(enterFavoriteTopic).sendKeys(fName);
    }

    public void clickSearchButton() {
        //find the searchButton element and click
        driver.findElement(searchButton).click();
    }

    public DashboardPage clickDashBoardMenu() {
        driver.findElement(DashboardPage).click();
        return new DashboardPage(driver);

    }
    public void clickAdmin(){
        //find the admin element and click on the admin button
        driver.findElement(admin).click();
    }

    public LoginPage clickLogout() {
        //find the logout element and click on the button
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
}
