package Runners;
import Utilities.GWD;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@CucumberOptions(
            tags = "@ParallelTest",
            features = {"src/test/java/FeatureFiles"},
            glue = {"StepDefinitions"}

)
@Listeners({ExtentITestListenerClassAdapter.class})
public class ExtentReports extends AbstractTestNGCucumberTests {

        @BeforeClass
        @Parameters("browser")
        public void beforeClass(String browser){
            GWD.threadBrowserName.set(browser);

        }



}
