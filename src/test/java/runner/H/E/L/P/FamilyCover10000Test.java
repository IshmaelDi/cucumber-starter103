package runner.H.E.L.P;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SingleGUI/FamilyCover10000.feature",
        glue = "StepDefinitions"
)

public class FamilyCover10000Test {
}
