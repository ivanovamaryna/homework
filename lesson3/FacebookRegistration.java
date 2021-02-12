//Найти все элементы нужные для выполнения регистрации на facebook.com. (Имя, Фамилия, Номер телефона, пароль, Дата рождения, пол, кнопка “создать аккаунт”).
//тут у меня все плохо


package lesson3;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FacebookRegistration {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        List<WebElement> elements = driver.findElements(By.cssSelector(".reg_form_box"));
        for(WebElement element : elements)
            System.out.println(element.getText());
        driver.quit();
    }
}
