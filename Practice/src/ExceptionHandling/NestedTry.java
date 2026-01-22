package ExceptionHandling;

public class NestedTry {
	public static void main(String[] args) {

		int arr[] = {1,2,3};
		
		try {
			System.out.println("Outer try starts");

			//ArrayIndexOutOfBoundsException
			
			//int x = arr[5]-1;
			
			int x = arr[2]-3;

			try {
				//ArithmeticException
				int result = 10 / x;
				System.out.println("Result: " + result);
				
			} 
			catch (ArithmeticException e) {
				System.out.println("Inner catch: Division by zero");
			}

			System.out.println("Outer try ends");

		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer catch: "+e);
		}
		catch (Exception e) {
			System.out.println("Outer catch: Some other exception");
		}
		finally {
			System.out.println("Finally block");
			
		}
	}
}
