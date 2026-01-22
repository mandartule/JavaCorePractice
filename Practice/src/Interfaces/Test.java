package Interfaces;

public class Test {
	
	
	
	public static void main(String[] args) {
		
//		Runnable r = new Runnable() {
//			public void run() {
//				System.out.println("Running");
//			}
//		};
		
		//or 
		
//		Runnable r = (i) ->{
//			System.out.println(i*i+" ");
//			System.out.println("Running");
//		};
		
		//or
		
		Runnable r = i ->{
			System.out.println(i*i+" ");
			System.out.println("Running");
		};
		
		r.run(2);
	}
}
