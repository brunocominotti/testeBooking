package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Home {
    WebDriver navegador;

    public Home(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void preencherDadosViagem() {
        navegador.findElement(By.id("ss")).sendKeys("Montevidéu, Uruguai");

        //CLICAR PARA ABRIR O CALENDARIO
        navegador.findElement(By.xpath("(//*[@class='bk-icon -experiments-calendar sb-date-picker_icon-svg'])[1]")).click();
        navegador.findElement(By.xpath("(//*[@class='bui-calendar__date'])[34]")).click();
        navegador.findElement(By.xpath("(//*[@class='bui-calendar__date'])[36]")).click();

        //CLICAR EM PESQUISAR
        navegador.findElement(By.xpath("//*[@class='sb-searchbox__button ']")).click();

    }
    }




