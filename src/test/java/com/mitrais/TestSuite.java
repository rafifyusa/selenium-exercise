package com.mitrais;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestSelenium.class, CheckSauceLabsHomePageTest.class})
public class TestSuite extends TestReporter{
}
