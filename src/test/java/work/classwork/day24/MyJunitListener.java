package work.classwork.day24;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class MyJunitListener extends RunListener {

    boolean isFailed;

    public void testStarted(Description description) throws Exception {
        System.out.println("executung " + description.getDisplayName());
        String id = description.getAnnotation(TestCaseId.class).id();
        System.out.println("Test ID " + id);
    }

    public void testFinished(Description description) throws Exception {
        System.out.println("Finishing " + description.getDisplayName());
        if (!isFailed) {
            String id = description.getAnnotation(TestCaseId.class).id();
            TestRailReporter.reportResult("2207", id, new Result(1));
        }
        isFailed = false;
    }

    public void testFailure(Failure failure) throws Exception {
        isFailed = true;
        System.out.println("Failing " + failure.getDescription().getDisplayName());
        String id = failure.getDescription().getAnnotation(TestCaseId.class).id();
        TestRailReporter.reportResult("2207", id, new Result(5));
    }

}
