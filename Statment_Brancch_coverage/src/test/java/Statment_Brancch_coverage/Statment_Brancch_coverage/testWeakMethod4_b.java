package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod4_b {
	@Test(expected=java.lang.ArithmeticException.class)
	public void testZero() {
    	WeakClass.weakMethod4(30, 10, 0);

	}

}