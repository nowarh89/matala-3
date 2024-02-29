package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod4_a {

    @Test
    public void Quotient_A_greater_than_B() {

    // Test case 1: Quotient of a is greater than quotient of b
    assertEquals("Quotient of a is greater than quotient of b", WeakClass.weakMethod4(20, 10, 2));

    
    }
    @Test
    public void Quotient_B_greater_than_A() {
 // Test case 2: Quotient of b is greater than or equal to quotient of a
    assertEquals("Quotient of b is greater than or equal to quotient of a", WeakClass.weakMethod4(10, 20, 2));

}}
