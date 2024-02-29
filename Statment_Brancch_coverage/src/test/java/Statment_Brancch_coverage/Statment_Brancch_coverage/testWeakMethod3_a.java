package Statment_Brancch_coverage.Statment_Brancch_coverage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod3_a {
	
	@Test
	public void test1() {
    	assertEquals("2.0", WeakClass.WeakMethod3(20,10));

	}
	
	@Test
    public void test2() {
    	assertEquals("nothing", WeakClass.WeakMethod3(-20,-10));

	}

}
