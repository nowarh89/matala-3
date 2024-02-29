package Statment_Brancch_coverage.Statment_Brancch_coverage;

import java.util.Arrays;

public class WeakClass {

		public static String WeakMethod1(int divisor,int dividend) {
			 if(dividend < 0 || divisor < 0) {
				 return "illegal";
			 }
			 if(dividend>divisor) {
				 return""+dividend / divisor;
			 }
			 else {
				 return"nothing";
			 }
			 }
		
		public static String weakMethod2(int a,int b,int z){
			if(a>z) {

				return "result :" +b/z;
			}else {
				return "result :" +(z-a);
			}
		}
		
		public static String WeakMethod3(int[] array) {
			double avg=0;
	        int sum = Arrays.stream(array).sum();

	        if(array.length>10) {
	        	return "length too large";
	         
	        }else {
				 avg= sum/array.length;
			 }
			 
			 if (avg>40) {
				 return "average too large";}
			 else {
				 return "average less than 40";
			 }
			 
			 }
		public static String WeakMethod3(int x,int y) {
			double result=0;
			if(x>=0&&y>=0) {
				if(x>y) {
					 result=x/y;
					 return ""+result;
				}
				
			}
			return "nothing";
		}
		
		public static String weakMethod4(int a, int b, int c) {
	        int quotientA = a / c;
	        int quotientB = b / c;

	        // Branch 1
	        if (quotientA > quotientB) {
	            return "Quotient of a is greater than quotient of b";
	        } else {
	            return "Quotient of b is greater than or equal to quotient of a";
	        }
		}
		
}
		    
	


