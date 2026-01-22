package ExceptionHandling;


public class NumberFormat {
	public static void main(String[] args) {
		
		int sum = 0;
		
		String arr[] = {"1","2","3","4"};
		String arr2[] = {"1","2","three","4"};
		
		for(String str : arr) {
			sum += Integer.parseInt(str);
		}
		
		System.out.println(sum);
		
	}      
}
