package Junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertFunctions {
	
	
	@Test
	public void assertFunctionExamples() {
		
		boolean condition = true;
		assertTrue(condition);
		assertFalse(!condition);
		assertNotNull(condition);
		assertNull(!condition);
		
	}

}
