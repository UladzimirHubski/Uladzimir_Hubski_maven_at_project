package work.classwork.day24;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.RunListener;

public class JunitTestRunner {
    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        runner.addListener(new MyJunitListener());
        runner.run(TestRailTests.class);
    }
}
