package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Bruno Cominotti\\IdeaProjects\\testeBooking\\src\\test\\java\\Feature", glue = "Steps")
public class CucumberMarker {
}
