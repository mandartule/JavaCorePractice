package Collections;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {

//		List<Integer> numbers = new ArrayList<>();
//		numbers.add(10);
//		numbers.add(20);
//		numbers.add(30);
//		numbers.add(40);
//		numbers.add(50);

//        System.out.println("Original List: " + numbers);
//
//       
//        
//        Iterator<Integer> it = numbers.iterator();

		// sequence
//        if (it.hasNext()) {
//            it.next();
//            it.remove(); 
//        }

//        //Cursor starts before first element
//        while (it.hasNext()) {
//            int value = it.next();
//            System.out.println("Reading: " + value);
//        }

//        it = numbers.iterator(); // new iterator
//        
//        //removes last returned element
//        while (it.hasNext()) {
//            int value = it.next();
//
//            if (value == 30) {
//                it.remove(); 
//            }
//        }
//
//        System.out.println("After removing 30: " + numbers);

		// while traversing we cannot modify in for each loop
//        for (int i : numbers) {
//            if (i == 40) {
//                numbers.remove(i); //ConcurrentModificationException
//            }
//        }

		
		
		List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
//		ListIterator<Integer> lit = numbers.listIterator();
//
//		while (lit.hasNext()) {
//			int value = lit.next();
//			System.out.println("Value: " + value + " | NextIndex: " + lit.nextIndex() + " | PreviousIndex: " + lit.previousIndex());
//
//			// Replace 20 with 25
//			if (value == 20) {
//				lit.set(25);
//			}
//
//			// Add 35 after 30
//			if (value == 30) {
//				lit.add(35);
//			}
//		}
		
		ListIterator<Integer> lit = numbers.listIterator(numbers.size());
		
        System.out.println("\nBackward Traversal:");
        
        while (lit.hasPrevious()) {
            int value = lit.previous();
            System.out.println("Value: " + value);

            // Remove 40 safely
            if (value == 40) {
                lit.remove();
            }
        }
        
        System.out.println("final List "+numbers);

	}
}
