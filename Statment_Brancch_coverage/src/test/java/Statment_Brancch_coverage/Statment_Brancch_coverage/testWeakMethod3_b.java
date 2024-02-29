package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod3_b {
	@Test
    public void testPositiveXPositiveY() {
        assertEquals("2.0", WeakClass.WeakMethod3(4, 2));}

  
	@Test
    public void testPositiveXPositiveY_XLessThanY() {
        assertEquals("nothing", WeakClass.WeakMethod3(2, 4));
    }

    @Test
    public void testNegativeXPositiveY() {
        assertEquals("nothing",WeakClass.WeakMethod3(-4, 2));
    }

    @Test
    public void testPositiveXNegativeY() {
        assertEquals("nothing", WeakClass.WeakMethod3(4, -2));
    }

  

 
	@Test(expected=java.lang.ArithmeticException.class)
    public void testPositiveXZeroY() {
        assertEquals("nothing",WeakClass.WeakMethod3(4, 0));
    }
    
	
}
