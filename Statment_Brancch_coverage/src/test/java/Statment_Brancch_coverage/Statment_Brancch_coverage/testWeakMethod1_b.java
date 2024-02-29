package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod1_b {

	  @Test
	  public void test1() {
	        assertEquals("2", WeakClass.WeakMethod1(4,8));

	  }
	        
	  @Test
	  public void test2() {
	        assertEquals("nothing", WeakClass.WeakMethod1(8,4));

	  }     
	        
	   @Test     
	  public void test3() {
	        assertEquals("illegal", WeakClass.WeakMethod1(-5,-10));

	   }
}
