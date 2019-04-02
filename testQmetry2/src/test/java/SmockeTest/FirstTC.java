package SmockeTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTC {

	@QmetryTestCase(TC_ID="9")
	@Test
	public void testInvalid() {
		assertEquals(2,2);
	}

}
