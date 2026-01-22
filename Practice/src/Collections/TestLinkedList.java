 package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


class Node{
	
	public int value;
	public Node next;
}



public class TestLinkedList {

    public static void main(String[] args) {

//        
        LinkedList<Integer> ll = new LinkedList<>();

         
        ll.add(10);                 // add at end
        ll.add(20);
        ll.add(30);

        ll.addFirst(5);             // add at beginning O(n)
        ll.addLast(40);             // add at end
        
        //ll.removeIf(x -> x%2 == 0); //pedicate 

        System.out.println("After adding elements: " + ll);
//
//        
        
        System.out.println("First element: " + ll.getFirst());
        
        System.out.println("Last element: " + ll.getLast());
        
        System.out.println("Element at index 2: " + ll.get(2));
        
        System.out.println("-------------------------------------");
        
        
       
        ll.remove();                // removes first element
        ll.removeFirst();           // removes first element
        ll.removeLast();            // removes last element
        ll.remove(1);               // removes element at index

        System.out.println("After removals: " + ll);
        
        
        LinkedList<String> animals = new LinkedList<String>(Arrays.asList("Cat","Dog","Lion"));
        LinkedList<String> animalsToRemove = new LinkedList<String>(Arrays.asList("Cat","Dog"));
        
        System.out.println("before removal "+ animals);
        
        animals.removeAll(animalsToRemove);
        
        System.out.println("after remove all "+animals);
        

//        
//        
//        
//        
//        
//        
        ll.add(100);
        ll.add(200);
        ll.add(300);

//        System.out.println("Before traversal: " + ll);
//
//      
//        System.out.println("For-each loop: ---- ");
//        for (int i : ll) {
//            System.out.println(i);
//        }
//        
//
        //iterator
        
//        System.out.println("\nIterator traversal:");
//        
//        Iterator<Integer> it = ll.iterator();
//        
//        while (it.hasNext()) {
//        	
//            int val = it.next();
//            
//            System.out.println(val);
//
//            
//            if (val == 200) {
//                it.remove();
//            }
//        }
//
//        System.out.println("After iterator removal: " + ll);
//
        
        
//        System.out.println("\nListIterator backward:");
//        ListIterator<Integer> listIt = ll.listIterator(ll.size());
//
//        while (listIt.hasPrevious()) {
//            int val = listIt.previous();
//            System.out.println(val);
//
//            // Replace element
//            if (val == 300) {
//                listIt.set(350);
//            }
//
//            // Add element during iteration
//            if (val == 100) {
//                listIt.add(150);
//            }
//        }
//
//        System.out.println("After ListIterator backward ops: " + ll);

        
        
        
    }
}
