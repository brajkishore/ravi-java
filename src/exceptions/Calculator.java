package exceptions;

public class Calculator {
	
	
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public int divide(int numerator,int denominator) {
		int result=numerator/denominator;
		return result;
	}
	
	public int divideWithCheckedException(int numerator,int denominator) throws Exception {
		int result=numerator/denominator;
		return result;
	}

}
