package tests;

import tests.optionals.GetStringLengthTests;
import tests.optionals.ParseIntegerTests;
import tests.string_list_tests.StringListTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;


public class TestRunner {
    public static void main (String[] args) {

        List<Class> testList = List.of(
          ParseIntegerTests.class,
          GetStringLengthTests.class,
          StringListTests.class
        );
        for (Class testClass : testList) {
            System.out.println("Running tests for: " + testClass.getName());
            Result result = JUnitCore.runClasses(testClass);
            System.out.println("Total number of tests failed " + result.getFailureCount() + "/" + result.getRunCount());
            for(Failure failure : result.getFailures())
            {
                System.err.println(failure.getTestHeader() + " " +  failure.getMessage());
            }
            if (result.wasSuccessful()) {
                System.out.println("All tests passed");
            } else {
                System.err.println("Tests failed");
            }
        }


    }
}

