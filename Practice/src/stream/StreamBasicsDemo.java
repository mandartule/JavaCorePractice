package stream;

import java.util.*;
import java.util.stream.*;

public class StreamBasicsDemo {

    public static void main(String[] args) {

    		
        List<Integer> numbers =  new ArrayList<Integer>();
        for(int i = 1; i<=10; i++) numbers.add(i);
        

        Stream<Integer> numberStream = numbers.stream();

//        // Terminal operation
//        numberStream.forEach(System.out::print);
//        
//        System.out.println();
//
//        // Original collection is NOT affected
//        System.out.println("Original List: " + numbers);
//        
//        //once the terminal operations runs steam cannot be reused
//        numberStream.forEach(System.out::print);
//        
        
        //SOURCE → INTERMEDIATE → TERMINAL
        
        numbers.stream()
        .filter(n -> n % 2 == 0)
        
        .map(n -> n * n)
        
        .forEach(System.out::println);

        
        
        
    }
}
