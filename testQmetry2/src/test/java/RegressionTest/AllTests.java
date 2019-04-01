package RegressionTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import SmockeTest.secondTC;

@RunWith(Suite.class)
@SuiteClasses({ TestVerification.class, secondTC.class })
public class AllTests {

}
