package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;



public class MainPageSteps {

    private WebDriver driver;
    private MainPage mainPage;

    public MainPageSteps(WebDriver driver ){
        this.driver = driver;
        mainPage = new MainPage(driver);
    }
    //скролл до 2 кнопки Заказать
    public void scrollButtonOrder() {
        WebElement element = driver.findElement(By.className("Button_Middle__1CSJM"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //клик поля срок аренды
    public void clickFieldRentalTime() {
        driver.findElement(By.className("Dropdown-root")).click();
    }
    //ввод имя фамилия адресс
    public void inputNameLastNameAddress() {
        driver.findElement(By.cssSelector("input[placeholder='* Имя']")).sendKeys("Петр");
        driver.findElement(By.cssSelector("input[placeholder='* Фамилия']")).sendKeys("Петров");
        driver.findElement(By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']")).sendKeys("Советская");
    }

    public void inputStation1() {
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys("Сокольники");
    }
    public void inputComment() {
        driver.findElement(By.xpath(".//input[@placeholder = 'Комментарий для курьера']")).sendKeys("Всё супер !!!");
    }
    //подтверждение заказа
    public void clickproof() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]")).click();
    }

    public void click2ButtonOrder() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]")).click();
    }

    public void chooseColor() {
        driver.findElement(By.id("black")).click();
    }

    public void selectionRentalTime() {
        driver.findElement(By.xpath("//div[@class='Dropdown-option' and @role='option' and @aria-selected='false' and contains(text(), 'трое суток')]")).click();
    }

    public void clickRentalTime() {
        driver.findElement(By.className("Dropdown-root")).click();
    }

    public void clickSelectionDate() {
        driver.findElement(By.className("react-datepicker-wrapper")).click();
    }

    public void selectionDate() {
        driver.findElement(By.className("react-datepicker__day--020")).click();
    }

    public void clickButtonResume() {
        driver.findElement(By.className("Button_Middle__1CSJM")).click();
    }

    public void chooseStation() {
        driver.findElement(By.xpath(".//div[@class = 'select-search__select']")).click();
    }

    public void inputPhoneNumber() {
        driver.findElement(By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']")).sendKeys("89678582256");
    }

    public void inputStation() {
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys("Лубянка");
    }

    public void inputAddress() {
        driver.findElement(By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']")).sendKeys("Ленина");
    }

    public void inputSurname() {
        driver.findElement(By.cssSelector("input[placeholder='* Фамилия']")).sendKeys("Иванов");
    }

    public void inputName() {
        driver.findElement(By.cssSelector("input[placeholder='* Имя']")).sendKeys("Иван");
    }

    public void clickButtonOrder() {
        driver.findElement(By.xpath("//button[text()='Заказать']")).click();
    }
    //открытие страницы
    public void openPageSamokat() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    //проверка на наличие окна подтверждения

// локатор окна подтверждения
    public WebElement getConfirmationWindow() {
        WebElement confirmationWindow = driver.findElement(By.className("Order_Modal__YZ-d3"));
        return confirmationWindow;
    }

}
