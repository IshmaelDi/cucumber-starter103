package runner.FuneralPlans;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/SingleGUI/FuneralPlans/FuneralUltimatePlan.feature",
        glue = "StepDefinitions"

)

public class FuneralUltimateTest {
}