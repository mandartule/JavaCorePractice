package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {


	public static void main(String[] args) {

//        List list = new ArrayList();
//
//        list.add(10);          // int → Integer (autoboxing)
//        list.add(20);
//        list.add(10);          // duplicate allowed
//        list.add("Hello");     // different type allowed (no generics yet)
//		
//		 /* uses toString method */
//        System.out.println(list);
//
//        System.out.println("Element at index 1: " + list.get(1));
//        
//        System.out.println(list.get(3));
        
		

//		List<Integer> list = new ArrayList();
//
//		int arr[] = { 1, 2, 3, 4, 5, 6 };
//
//		for (int i : arr) list.add(i);
//
//		System.out.println(list);
//
//		System.out.println(list.size());
//		
		

	//	String str[] = { "abc", "omp", "zero" };
//		
//		/* this returns a fixed size of list cannot add  or remove*/
//		List<String> list = Arrays.asList(str);
//	
//		List<Integer> list2 = Arrays.asList(1,2,3,4,5); 
//		//list2.add(7);//this will give compilation error
//	
//		System.out.println(list.get(1));
//		
//		System.out.println(list.size());
//		
//		for(String str1 : list) System.out.print(str1+" ");
//		
//		System.out.println(list.contains("omp")); //O(n)
		
		
		
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> numbers2 = new ArrayList<>();
		
		numbers2.add(99);
		numbers2.add(88);
		numbers2.add(77);
		
		//add elements together
		numbers.addAll(numbers2);
		
		
		System.out.println(numbers);
		
		numbers.remove(2); //index
		
		
		
		System.out.println("After removing at given index"+numbers);
		
		numbers.add(3,40);
		
		System.out.println("After adding element at idx 3 : "+numbers);
		
		numbers.set(2,100);
		
		
		/*
		 * 1) Dynamic in size
		 * 2) Initial capacity is 10 
		 */
		
		/*ArrayList with capacity so don't need resizing till there*/
//		ArrayList<Integer> list = new ArrayList<>(10);
 
		
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		
		list.remove(1); // this removes at 1st index;
		
		
		
		
		
		/* this removes the same value element first reference
		 * because it takes the object as parameter */
		
		list.remove(Integer.valueOf(1)); 
		
		
		Integer[] arr = list.toArray(new Integer[0]);  // new Integer[0] tells the type 
		String[] arr2 = list.toArray(new String[0]);
		
		
		
		
		
		
	}

}
