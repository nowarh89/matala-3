package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testCheckOutMethod {

	@Test
	public void test1() {
        assertEquals(true, CheckOutclass.checkOut(300,50,statusClass.Status.gold));

	}
	@Test
	public void test2() {
        assertEquals(true, CheckOutclass.checkOut(3600,750,statusClass.Status.gold));

	}
	@Test
	public void test3() {
        assertEquals(true, CheckOutclass.checkOut(1000,50,statusClass.Status.silver));

	}
	@Test
	public void test4() {
        assertEquals(true, CheckOutclass.checkOut(1000,950,statusClass.Status.bronze));

	}
	@Test
	public void test5() {
        assertEquals(true, CheckOutclass.checkOut(2600,801,statusClass.Status.silver));

	}
	@Test
	public void test6() {
        assertEquals(false, CheckOutclass.checkOut(4000,50,statusClass.Status.gold));

	}
	@Test
	public void test7() {
        assertEquals(false, CheckOutclass.checkOut(3000,42,statusClass.Status.silver));

	}
	@Test
	public void test8() {
        assertEquals(false, CheckOutclass.checkOut(1501,750,statusClass.Status.bronze));

	}
	@Test
	public void test9() {
        assertEquals(true, CheckOutclass.checkOut(1501,950,statusClass.Status.bronze));

	}
}
