package work.classwork.day18Cucumber;

import org.junit.Test;

public class DemoJunitTest {

    DemoSteps demoSteps = new DemoSteps();
@Test
    public void Demotest(){
demoSteps.iOpenDemoGSite();
demoSteps.iFillInTheForm("bugaga");
demoSteps.iNeedToSeeSomething();


    }
}
