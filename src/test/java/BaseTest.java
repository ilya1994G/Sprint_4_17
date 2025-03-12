import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.MainPageSteps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {
    protected WebDriver driver;
    protected MainPageSteps mainPageSteps;
    protected DropDownList dropDownList;
    @Before
    public void startBrowerChrome(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        mainPageSteps = new MainPageSteps(driver);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}