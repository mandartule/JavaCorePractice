package ExceptionHandling;

public class NumberFormat2 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		String arr[] = {"1","2","3","4"};
		
		String arr2[] = {"1","2","three","4"};
		
		for(String str : arr2) {
			
			try {
				sum += Integer.parseInt(str);
			}
			catch (NumberFormatException e) { //converting a string to numeric type but that does not contain proper value
				System.out.println("exception : "+e);
				
			}
			
		}
		
		System.out.println(sum);
		
	}      
}
 