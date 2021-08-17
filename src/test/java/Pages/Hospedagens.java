package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hospedagens {
    WebDriver navegador;

    public Hospedagens(WebDriver navegador) { this.navegador = navegador; }
    public void escolherHotel() throws InterruptedException {
        //CLICAR EM VER DISPONIBILIDADE
        navegador.findElement(By.xpath("(//*[@class='bui-button__text js-sr-cta-text'])[1]")).click();

        for (String winHandle : navegador.getWindowHandles()) {
            navegador.switchTo().window(winHandle);
        }

        //CLICAR NO BOTAO Reservar agora
        navegador.findElement(By.xpath("//button[@id='hp_book_now_button']")).click();

        //CLICAR NO BOTAO Vou reservar
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//*[@class='bui-button__text js-reservation-button__text']")).click();
        for (String winHandle : navegador.getWindowHandles()) {
            navegador.switchTo().window(winHandle);}

    }


}
