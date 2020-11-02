package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPage;

import java.util.concurrent.TimeUnit;

public class setUps {
    //create Login Object
    protected LoginPage loginPage;
    @BeforeTest
    //create a WebDriver Object
    private WebDriver driver;

    public void setUp()
    {
        //import chromeDriver
        System.setProperty("webDriver.chrome.driver", "resources/chromeDriver.exe");
        // instantiate a webDiver object
        driver = new ChromeDriver();
        //Maximize window size
        driver.manage().window().maximize();
        //lunch the URL
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/app/messages");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Instantiate login page after lunching browser
        loginPage = new LoginPage(driver);

    }

    @AfterTest
    public void cleanup(){
        driver.manage().deleteAllCookies();;

    }
    @Afterclass
    public void closeBrowser(){
        driver.quit();
    }

}
