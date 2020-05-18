package exceptions;

public class NormalTryCatch {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int x = 10;
		int y = 2;
		int sum = calculator.add(x, y);
		System.out.println(sum);

		int myRes = calculator.divide(x, y);
		System.out.println(myRes);

		// Throws an error
		x = 10;
		y = 1;
		myRes = calculator.divide(x, y);// This is runtime exception

		x = 5;
		y = 0;
		try {
			myRes = calculator.divide(x, y);// This is runtime exception but caught
		} catch (Exception e) {
			e.printStackTrace();
		}

		x = 5;
		y = 0;
		try {
			myRes = calculator.divideWithCheckedException(x, y);
		} catch (Exception e) {			
			e.printStackTrace();
		}

		System.out.println("Main program ends here");
	}
}
