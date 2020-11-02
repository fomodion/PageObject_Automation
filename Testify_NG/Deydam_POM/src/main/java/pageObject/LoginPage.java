package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;

public class LoginPage extends setUps {
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    //using By as a locator to identify the login fields
    private By username = By.id("txtUsername");
    private By password = By.id("txtPassword");
    private By forgotPassword = By.linkText("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login/forgot-password");
    private By loginButton = By.id("btnLogin");
    private By CompanyLogo = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/nav/a/img");
    //create a constructor for each field
    public void enterUsername (String uName){
        //find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }
    public void enterPassword (String pWord){
        //find the password field element and enter the password
        driver.findElement(password).sendKeys(pWord);
    }
    public void verifyForgetPassword (){
        //find the forgetPassword element and verify
        driver.findElement(forgotPassword).isDisplayed();
    }
    public void verifyCompanyLogo (){
        //find the company logo element and verify
        driver.findElement(CompanyLogo).isDisplayed();
    }
    public DashboardPage clickLoginButton (){
        //find the loginButton element and click
        driver.findElement(loginButton).click();
        return new DashboardPage (driver);
    }
}
