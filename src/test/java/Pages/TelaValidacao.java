package Pages;

import org.junit.Assert;
import org.openqa.selenium.*;


public class TelaValidacao {
    WebDriver navegador;

    public TelaValidacao(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void verificarTeste() throws InterruptedException {
        WebElement validacao = navegador.findElement(By.xpath("(//*[@class='bui-button__text js-button__text'])[6]"));
        String texto = validacao.getText();
        Assert.assertEquals("Tudo certo, conclua minha reserva!", texto);
        Thread.sleep(4000);
        navegador.close();

        }


}
