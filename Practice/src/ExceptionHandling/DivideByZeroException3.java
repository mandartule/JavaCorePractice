package ExceptionHandling;


public class DivideByZeroException3 {
	public static void main(String[] args) {

		int totalSum = 100;
		//int num = 10;
		int num = 0;
	
		
		try {
			System.out.println(totalSum / num);
			System.out.println("line below exception");
		} 
		
		catch (ArithmeticException e) {
			
			System.out.println("Exception : " + e);
		} 
		catch(ArrayIndexOutOfBoundsException e ) {
			
		}
		catch(Exception e) {
			
		}
		finally {

		
			System.out.println("Finally Block Executes");
			
			
		}
	
	}
}