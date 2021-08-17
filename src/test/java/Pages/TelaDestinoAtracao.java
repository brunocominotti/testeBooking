package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaDestinoAtracao {
    WebDriver navegador;

    public TelaDestinoAtracao(WebDriver navegador) {this.navegador = navegador;}
    public void escolherDestinoAtracao() throws InterruptedException {
        //Clico em atração
        navegador.findElement(By.xpath("(//*[@class='bui-tab__link'])[3]")).click();

        //Clico em Paris
            Thread.sleep(2000);
            navegador.findElement(By.xpath("(//*[@class='css-kr5ech'])[3]")).click();

    }
}
