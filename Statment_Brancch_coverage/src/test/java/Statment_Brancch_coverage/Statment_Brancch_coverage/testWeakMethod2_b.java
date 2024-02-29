package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod2_b {
	@Test
    public void test_result_a_bigger_than_z() {
    	
    	assertEquals("result :4", WeakClass.weakMethod2(10,20,5));


}
 @Test
    public void test_result_a_smaller_than_z() {
	assertEquals("result :0", WeakClass.weakMethod2(2,2,2));
 }
}
