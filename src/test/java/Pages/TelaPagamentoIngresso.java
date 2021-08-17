package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TelaPagamentoIngresso {
    WebDriver navegador;

    public TelaPagamentoIngresso(WebDriver navegador) {this.navegador = navegador;}
    public void pagamentoIngresso() throws InterruptedException {
        navegador.switchTo().frame(navegador.findElement(By.xpath("//iframe[@title='Payment']")));
        Thread.sleep(3000);
        navegador.findElement(By.xpath("//input[@class='bui-form__control payin-form__bank-card-number-field']")).sendKeys("5374311346202508");
        navegador.findElement(By.xpath("//input[@class='bui-form__control']")).sendKeys("06/22");
        navegador.findElement(By.xpath("//input[@class='bui-form__control payin-form__bank-card-code-field ']")).sendKeys("638");
        navegador.switchTo().defaultContent();
    }
        public void validacao() throws InterruptedException {
        //VALIDACAO
        WebElement ativo = navegador.findElement(By.xpath("(//button[@class='Actionable-module__root___3GRl0 Button-module__root___1g71n Button-module__root--variant-primary___2a3l5 Button-module__root--size-large___2ajBg Button-module__root--wide___1ZP7k Button-module__root--variant-primary-action___3vxYJ'])[1]"));
        String texto = ativo.getText();
        Assert.assertEquals("Pagar agora", texto);
        System.out.println("="+texto+"=");
        Thread.sleep(4000);
        navegador.close();


    }

}
