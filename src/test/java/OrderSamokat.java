
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

//заказ самоката
public class  OrderSamokat extends BaseTest {

    @Test
    public void openPage(){
        //открытие страницы Самокат
        mainPageSteps.openPageSamokat();
        //клик по кнопке заказать в верхнем правом углу
        mainPageSteps.clickButtonOrder();
        //ввод имени
        mainPageSteps.inputName();
        //ввод фамилии
        mainPageSteps.inputSurname();
        //ввод адреса
        mainPageSteps.inputAddress();
        //ввод станции
        mainPageSteps.inputStation();
        //выбор станции
        mainPageSteps.chooseStation();
        //ввод номера телефона
        mainPageSteps.inputPhoneNumber();
        //клик кнопки далее
        mainPageSteps.clickButtonResume();
        //клик поля когда привезти самокат
        mainPageSteps.clickSelectionDate();
        //выбор даты когда привезти самокат
        mainPageSteps.selectionDate();
        // срок аренды
        mainPageSteps.clickRentalTime();
        //выбор срока аренды
        mainPageSteps.selectionRentalTime();
        //выбор цвета
        mainPageSteps.chooseColor();
        //ввод комментариев
        mainPageSteps.inputComment();
        //нажил кнопку Заказать
        mainPageSteps.click2ButtonOrder();
        //Подтвердили заказ
        mainPageSteps.clickproof();
        //Окно подтверждение заказа
        WebElement confirmationWindow = driver.findElement(By.className("Order_Modal__YZ-d3"));
        //проверка на наличие окна подтверждения
        assertTrue("Картинки с подтверждением нет",confirmationWindow.isDisplayed());
    }

    @Test
    public void openPage1() {
        //открытие страницы Самокат
        mainPageSteps.openPageSamokat();
        //Скрол
        mainPageSteps.scrollButtonOrder();
        //нажать кнопку Заказать
        mainPageSteps.clickButtonResume();
        //ввод имя фамилия адрес
        mainPageSteps.inputNameLastNameAddress();
        //ввод станции
        mainPageSteps.inputStation1();
        //выбор станции
        mainPageSteps.chooseStation();
        //ввод номера телефона
        mainPageSteps.inputPhoneNumber();
        //клик кнопки далее
        mainPageSteps.clickButtonResume();
        //клин поля когда привезти самокат
        mainPageSteps.clickSelectionDate();
        //выбор даты когда привезти самокат
        mainPageSteps.selectionDate();
        //клик поля срок аренды
        mainPageSteps.clickFieldRentalTime();
        //выбор срока аренды
        mainPageSteps.selectionRentalTime();
        //выбор цвета
        mainPageSteps.chooseColor();
        //ввод комментария
        mainPageSteps.inputComment();
        //нажил кнопку Заказать
        mainPageSteps.click2ButtonOrder();
        //Подтвердили заказ
        mainPageSteps.clickproof();
        //Окно подтверждение заказа
        WebElement confirmationWindow = driver.findElement(By.className("Order_Modal__YZ-d3"));
        //проверка на наличие окна подтверждения
        assertTrue("Картинки с подтверждением нет",confirmationWindow.isDisplayed());

    }


}