package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TelaDadosIngresso {
    WebDriver navegador;

    public TelaDadosIngresso(WebDriver navegador) {this.navegador = navegador;}
    public void preencherDadosIngresso(){
        navegador.findElement(By.xpath("(//*[@class='css-qlqxn2'])[1]")).sendKeys("Bruno");
        navegador.findElement(By.xpath("(//*[@class='css-qlqxn2'])[2]")).sendKeys("Cominotti");
        navegador.findElement(By.xpath("(//*[@class='css-qlqxn2'])[3]")).sendKeys("teste123@gmail.com");
        navegador.findElement(By.xpath("(//*[@class='css-qlqxn2'])[4]")).sendKeys("teste123@gmail.com");
        navegador.findElement(By.xpath("(//*[@class='css-qlqxn2'])[5]")).sendKeys("11912345678");
        //CLICAR NO BOTAO PROXIMO
        navegador.findElement(By.xpath("(//*[@class='Actionable-module__root___3GRl0 Button-module__root___1g71n Button-module__root--variant-primary___2a3l5 Button-module__root--size-large___2ajBg Button-module__root--wide___1ZP7k Button-module__root--variant-primary-action___3vxYJ'])[1]")).click();

    }
}
