package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DadosHospede {
    WebDriver navegador;

    public DadosHospede(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void preencherDadosPessoais() {
        navegador.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Bruno");
        navegador.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Cominotti");
        navegador.findElement(By.xpath("//*[@id='email']")).sendKeys("teste123@gmail.com");
        navegador.findElement(By.xpath("//*[@id='email_confirm']")).sendKeys("teste123@gmail.com");
        navegador.findElement(By.xpath("(//*[@class='bui-radio__label'])[3]")).click();
    }

        public void clicarProximo(){
        //CLICAR NO BOTAO 'Proximo: ultimas informacoes'
        navegador.findElement(By.xpath("(//*[@class='bui-button__text js-button__text'])[2]")).click();

        }
    }

