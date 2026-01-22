 package Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class TestVector {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>(5,3); //default 10, given cap 5,   by 3
        
        System.out.println("vector capacity "+v.capacity()); //capacity function   

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        
        v.add(1,300); //inserting at a index
        
        
        v.insertElementAt(25, 2);  // insert at index

        System.out.println("Vector: " + v);

        System.out.println("First: " + v.firstElement());
        System.out.println("Last: " + v.lastElement());
        
        
        System.out.println("At index 3: " + v.get(3));

        v.remove(2); //at index 2
        v.removeElement(40);

        System.out.println("After removals: " + v);
//        
//        
//        
//
//        System.out.println("\nFor-each:");
//        for (int i : v) {
//            System.out.println(i);
//        }
//
//        
//        
//        System.out.println("Iterator:");
//        Iterator<Integer> it = v.iterator();
//        while (it.hasNext()) {
//            int val = it.next();
//            
//        }
//        
        
        
        
//        System.out.println("ListIterator backward:");
//        
//        ListIterator<Integer> listIt = v.listIterator(v.size());
//        while (listIt.hasPrevious()) {
//            System.out.println(listIt.previous());
//        }
//
//        System.out.println("\nSize: " + v.size());
//       
//        System.out.println("Contains 35? " + v.contains(35));
//
//        v.clear();
//        System.out.println("After clear: " + v);
    }
}