package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver ){
        this.driver = driver;
    }
    // локатор для первой кнопки заказать
    private By firstOrderButton = By.xpath("//button[text()='Заказать']");
    // локатор для второй кнопки заказать
    private By secondOrderButton = By.className("Button_Middle__1CSJM");
    //Стрелка "Сколько это стоит? И как оплатить?"
    private By arrow1 = By.id("accordion__heading-0");
    //Стрелка "Хочу сразу несколько самокатов! Так можно?"
    private By arrow2 = By.id("accordion__heading-1");
    //Стрелка "Как рассчитывается время аренды?"
    private By arrow3 = By.id("accordion__heading-2");
    //Стрелка "Можно ли заказать самокат прямо на сегодня?"
    private By arrow4 = By.id("accordion__heading-3");
    //Стрелка "Можно ли продлить заказ или вернуть самокат раньше?"
    private By arrow5 = By.id("accordion__heading-4");
    //Стрелка "Вы привозите зарядку вместе с самокатом?"
    private By arrow6 = By.id("accordion__heading-5");
    //Стрелка "Можно ли отменить заказ?"
    private By arrow7 = By.id("accordion__heading-6");
    //Стрелка "Я жизу за МКАДом, привезёте?"
    private By arrow8 = By.id("accordion__heading-7");
}
