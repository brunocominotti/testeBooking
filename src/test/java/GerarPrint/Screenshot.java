package GerarPrint;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void take(WebDriver navegador, String arquivo) throws IOException {
        File screenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File(arquivo));
        } catch (Exception e) {
            System.out.println("Houveram problemas ao copiar o arquivo para a pasta." + e.getMessage());
        }

    }
}
