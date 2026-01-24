package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        
        System.out.println("After pop: " + stack);
        
        
        
        
        //one based indexing
        System.out.println("Search 20 : " + stack.search(20));
        
        System.out.println("Is stack empty? " + stack.isEmpty());
        
       
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        
       
    			
    	
    	
//        
//        System.out.println("\nIterator traversal:");
//        Iterator<Integer> it = stack.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
////
//        stack.clear();
////        System.out.println("\nAfter clear: " + stack);
//        
        
        
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        ListIterator<Integer> it = stack.listIterator(stack.size());
//
//        while (it.hasPrevious()) {
//            System.out.println(it.previous());
//        }
    	
    	
    }
}
