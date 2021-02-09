//вывести название первого документа в спсике документов в сайнНау


package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignNowLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.signnow.com/");
        driver.findElement(By.cssSelector("[id='login']")).clear();
        driver.findElement(By.cssSelector("[id='login']")).sendKeys("hromova.tetiana+sn@airslate.com");
        driver.findElement(By.cssSelector("[id='pswd']")).clear();
        driver.findElement(By.cssSelector("[id='pswd']")).sendKeys("1234qweR");
        driver.findElement(By.cssSelector("[id='pswd']")).sendKeys(Keys.ENTER);
       // driver.findElement(By.cssSelector("//*[@data-autotest='doc-list__card']/div[1]//*[@class='snr-doc-card__name']")).click();
        WebElement element = driver.findElement(By.cssSelector("//*[@data-autotest='doc-list__card']/div[1]//*[@class='snr-doc-card__name']"));
        System.out.println(element.getAttribute("a"));
        // System.out.println(driver.getTitle());
        // driver.quit();
    }
}
