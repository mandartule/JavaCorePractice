package Generics;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList<>();
//		
//		list.add("Hello");
//		list.add(123);
//		
//		String str = (String) list.get(0);
//		
//		//this will give compile time error
//		String integer = (String) list.get(1); 
		
//		Box<Integer> box = new Box<>();
//        box.setValue(1);
//        int i = box.getValue(); // EXCEPTION !!!
//        System.out.println(i);
		
		
		Pair<String,Integer> pair = new Pair<>("Age",30);
		
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
		
		
		 
		
		
	}
}
