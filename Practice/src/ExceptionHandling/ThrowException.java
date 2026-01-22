package ExceptionHandling;
import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {

		try {
			int result = divide(100, 10);
			
			result = divide(100, 0);
			
			//this like skipped because of exception
			System.out.println("result: " + result);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		//this catch only needed when there is IOException
		catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public static int divide(int totalSum, int totalNumber) throws IOException {

		int quotient = -1;
		System.out.println("Computing Division.");

		try {
			if (totalNumber == 0) {
				
				//the below even work without the throws clause
				//throw new ArithmeticException();
				
				//does not work without 'throws' clause as it is a checked exception needs throws IOException
				throw new IOException("this is a checked exception");
			}
			quotient = totalSum / totalNumber;
		}
		
		finally {
			if (quotient != -1) {
				System.out.println("Finally Block Executes");
				System.out.println("Result: " + quotient);
			} else {
				System.out.println("Finally Block Executes. Exception Occurred");
			}
		}
		return quotient;
	}
}
