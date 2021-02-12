//Вывести в консоль список “Название фильма, рейтинг и ссылка на imdb” на фильм (Брать фильмы со страницы http://www.imdb.com/chart/top)
package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilmInfo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/chart/top");
        WebElement element1 = driver.findElement(By.cssSelector("//*[@data-caller-name='chart-top250movie']/tbody//tr[11]//td[@class='titleColumn']/a"));
        WebElement element2 = driver.findElement(By.cssSelector("//*[@data-caller-name='chart-top250movie']/tbody//tr[11]//td[contains(@class,'imdbRating')]/*"));
        System.out.println("Link "+element1.getAttribute("href")+ ", title "+ element1.getText() + ", rating "+ element2.getText());
        driver.quit();
    }
}
