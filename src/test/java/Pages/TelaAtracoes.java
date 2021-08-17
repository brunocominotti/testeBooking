package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaAtracoes {
    WebDriver navegador;

    public TelaAtracoes(WebDriver navegador) {this.navegador = navegador;}
    public void selecionarAtracaoeIngresso() throws InterruptedException {
        //CLICAR NA ATRACAO
        navegador.findElement(By.xpath("(//*[@class='css-1qasygf'])[4]")).click();

        Thread.sleep(3000);
        //CLICA NO BOTAO SELECIONAR
        navegador.findElement(By.xpath("(//*[@class='Button-module__text___3l2y1'])[8]")).click();
        //SELECIONA A QUANTIDADE DE INGRESSOS
        navegador.findElement(By.xpath("(//*[@class='Actionable-module__root___3GRl0 Button-module__root___1g71n Button-module__root--variant-secondary___3bOKl Button-module__root--size-medium___2hcsc Button-module__root--variant-secondary-action___35o54 css-1xok4pd'])[1]")).click();
        //CLICAR NO BOTAO PROXIMO
        navegador.findElement(By.xpath("(//*[@class='Button-module__text___3l2y1'])[8]")).click();
    }

}
