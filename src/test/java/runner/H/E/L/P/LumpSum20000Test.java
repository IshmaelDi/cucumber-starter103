package runner.H.E.L.P;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SingleGUI/LumpSumCover20000.feature",
        glue = "StepDefinitions"

)

public class LumpSum20000Test {
}