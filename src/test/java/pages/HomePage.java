package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {

        driver.get("https://qazando.com.br/curso.html");
        esperarElentoEstarPresente(By.id("btn-ver-cursos"), 10);
        Assert.assertEquals(true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());

    }
    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(  "window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }
    public void preencheEmail(){
        driver.findElement(By.id("email")).sendKeys("wallace.b.silva@capgemini.com");
        driver.findElement(By.cssSelector(".contact-text")).click();

    }
    public void clickGanharDesconto(){
        driver.findElement(By.id("button")).click();
    }
    public  void aplicaDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("QAZANDO15OFF", texto_cupom);
        System.out.println(texto_cupom);

    }

}
