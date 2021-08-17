package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pagamento {
    WebDriver navegador;

    public Pagamento(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void preencherDadosPagamento() throws InterruptedException {
        navegador.findElement(By.xpath("//*[@id='phone']")).sendKeys("11912345678");

        //CLICAR PARA SELECIONAR A BANDEIRA DO CARTAO DE CREDITO
        navegador.findElement(By.xpath("//*[@id='cc_type']")).click();

        //SELECIONA A BANDEIRA DO CARTAO DE CREDITO
        navegador.findElement(By.xpath("//*[@id='cc_type']/option[2]")).click();

        //PREENCHE O NUMERO DO CARTAO DE CREDITO
        navegador.findElement(By.xpath("//*[@id='cc_number']")).sendKeys("5374311346202508");

        //CLICA PARA SELECIONAR A DATA DE VALIDADE DO CARTAO DE CREDITO
        navegador.findElement(By.xpath("//*[@id='cc_month']")).click();

        //CLICA NA DATA DE VALIDADE
        navegador.findElement(By.xpath("//*[@id='cc_month']/option[12]")).click();
        navegador.findElement(By.xpath("//*[@id='ccYear']")).click();
        navegador.findElement(By.xpath("//*[@id='ccYear']/option[2]")).click();
        navegador.findElement(By.xpath("//*[@id='cc_cvc']")).sendKeys("638");

        //CLICA NA CHECK BOX "Tenha acesso a nossas newsletters com ofertas exclusivas, selecionadas especialmente para você."
        navegador.findElement(By.xpath("(//*[@class='bui-checkbox__label'])[2]")).click();
    }

        public void verifiqueDadosPagamento(){
        //CLICA NO BOTAO "VERIFIQUE SEUS DADOS"
        navegador.findElement(By.xpath("(//*[@class='bui-button__text js-button__text'])[2]")).click();
    }


    }


