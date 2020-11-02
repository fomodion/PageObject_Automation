package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    //using By to locate DashboardPage elements
    private By admin = By.className("topBar_back");
    private By logoutButton = By.className("topBar_link-title");
    private By forumGroup = By.className("sideBar_link-title");
    private By CompanyLogoImage = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[1]/a");
    private By FreshSongs = By.xpath("//*[@id=\"sidetray\"]/div/div[2]/div/div/div/div[1]/span/h5");



    public void clickAdmin(){
        //find the admin element and click on the admin button
        driver.findElement(admin).click();
    }

    public LoginPage clickLogout(){
        //find the logout element and click on the button
        driver.findElement(logoutButton).click();
        return new LoginPage (driver);
    }

    public void verifyCompanyLogo (){
        //find and verifyCompanyLogo is displayed
        driver.findElement(CompanyLogoImage).isDisplayed();

    }

    public void verifyFreshSongs (){
        //find the element freshSongs and verify it is displayed
        driver.findElement(FreshSongs).getText();
    }

    public ForumGroupPage clickForumGroupLink(){
        //find the element ForumGroup and click on it
        driver.findElement(forumGroup).click();
        return new ForumGroupPage (driver);
    }
    
}
