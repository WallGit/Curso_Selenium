package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import runner.RunCucumberTest;


public class DescontosStep extends RunCucumberTest {

    HomePage homePage= new HomePage(driver);

        @Dado("^que estou no site do qazando$")
        public void que_estou_no_site_do_qazando(){
            homePage.acessarAplicacao();


        }


        @Quando("^eu preencher meu e-mail$")
        public void eu_preencher_meu_e_mail() throws InterruptedException {
            homePage.scrollDown();
            homePage.preencheEmail();

//            WebElement email = driver.findElement(By.id("email"));
//            email.click();
//            email.sendKeys("wallace.b.silva@capgemini.com");
//           driver.findElement(By.id("email")).sendKeys("wallace.b.silva@capgemini.com");
////            Thread.sleep(3000);
//            driver.findElement(By.cssSelector(".contact-text")).click();

        }


        @Quando("^clico em ganhar cupom$")
        public void clico_em_ganhar_cupom() throws InterruptedException {
            homePage.clickGanharDesconto();
        }


        @Entao("^eu vejo o código de desconto$")
        public void eu_vejo_o_código_de_desconto() {
           homePage.aplicaDesconto();
        }

    @Dado("^que tenho um cupom gerado$")
    public void gerarCupom() throws InterruptedException {
        homePage.acessarAplicacao();
        homePage.scrollDown();
        homePage.preencheEmail();
        homePage.clickGanharDesconto();
        homePage.aplicaDesconto();
    }

    }

