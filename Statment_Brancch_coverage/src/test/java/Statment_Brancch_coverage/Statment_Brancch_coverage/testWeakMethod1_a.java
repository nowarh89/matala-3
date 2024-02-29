package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod1_a {
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testZero() {
		
        WeakClass.WeakMethod1(0,1);
        
        
	}
    @Test
    public void test2() {
    	
        assertEquals("2", WeakClass.WeakMethod1(4,8));
    }
}
