package runners;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class TestNG_YAML_Booking_Runner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        List<String> strings = new ArrayList<>();
        strings.add("src/test/java/settings/testngBooking.yaml");
        testNG.setTestSuites(strings);
        testNG.run();
    }
}