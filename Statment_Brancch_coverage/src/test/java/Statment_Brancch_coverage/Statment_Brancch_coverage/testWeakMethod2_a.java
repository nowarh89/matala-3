package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod2_a {
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testZero() {
        WeakClass.weakMethod2(10,2,0);
	}

}
