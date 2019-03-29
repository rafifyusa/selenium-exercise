package com.mitrais;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Hello world!
 *
 */
public class Runner extends TestReporter
{
    public static void main(String args[])
    {
        Result result = JUnitCore.runClasses(TestSuite.class);
        for (Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
