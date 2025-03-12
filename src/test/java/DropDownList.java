import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.Collection;

//выпадающий список
@RunWith(Parameterized.class)
public class DropDownList {
    private WebDriver driver;
    //переменная для хранения ID раскрывающегося списка
    private final String accordionId;
    //переменная для хранения ожидаемого текста
    private final String expectedText;

    public DropDownList(String accordionId, String expectedText) {
        this.accordionId = accordionId;
        this.expectedText = expectedText;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"accordion__heading-0", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {"accordion__heading-1", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {"accordion__heading-2", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {"accordion__heading-3", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {"accordion__heading-4", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {"accordion__heading-5", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {"accordion__heading-6", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {"accordion__heading-7", "Да, обязательно. Всем самокатов! И Москве, и Московской области."}
        });
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void testDropDownList() {
        WebElement element = driver.findElement(By.id(accordionId));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();

        WebElement textElement = driver.findElement(By.xpath("//p[text()='" + expectedText + "']"));
        String actualText = textElement.getText();

        Assert.assertEquals("Тексты не совпадают!", expectedText, actualText);
    }

    @After
    public void tearDown() {

        driver.quit();

    }
}