package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {



////Predicate -------------------------------------------------
//		// it just hold a condition
//
//		Predicate<Integer> isEven = x -> x % 2 == 0;
//
//		boolean test = isEven.test(4);
//		System.out.println(test);
//
//		Predicate<String> isWordStartWithA = x -> x.toLowerCase().charAt(0) == 'a';
//		System.out.println(isWordStartWithA.test("Akansha"));
//
//		Predicate<String> isWordEndWithM = x -> x.toLowerCase().charAt(x.length() - 1) == 'z';
//
//		// creating new by combining
//		Predicate<String> bothCheck = isWordStartWithA.and(isWordEndWithM);
//
//		System.out.println(bothCheck.test("abcdmz"));
//
////Function Interface -------------------------------------------
//
//		// takes input returns output
//
//		Function<Integer, Integer> doubleIt = x -> 2 * x;
//		Function<Integer, Integer> tripleIt = x -> 3 * x;
//
//		System.out.println(doubleIt.andThen(tripleIt).apply(20));
//		System.out.println(doubleIt.apply(100));
//
//		// static identity method(return what it takes)
//		Function<Integer, Integer> identity = Function.identity();
//
//		Integer res2 = identity.apply(5); // apply method
//		System.out.println(res2);
//
//// Consumer -------------------------------------------------------
//
//		// only takes and do not return just use it example println
//
//		Consumer<Integer> print = x -> System.out.println(x);
//		print.accept(5); // accept function
//
//		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
//
//		Consumer<List<Integer>> printList = x -> {
//			for (int i : x) {
//				System.out.println(i);
//			}
//		};
//
//		printList.accept(list1); // accept method
//
//// Supplier ------------------------------------------------------------
//		// only takes input no output
//
//		Supplier<String> giveHelloWorld = () -> "Hello World";
//
//		System.out.println(giveHelloWorld.get()); // get method
//
////Combined Example
//
//		// combined example
//		Predicate<Integer> predicate = x -> x % 2 == 0;
//		
//		Function<Integer, Integer> function = x -> x * x;
//		
//		Consumer<Integer> consumer = x -> System.out.println(x);
//		
//		Supplier<Integer> supplier = () -> 100;
//
//		if (predicate.test(supplier.get())) {
//
//			consumer.accept(function.apply(supplier.get()));
//
//		}
//
//		
//		
////Method reference ---------------------------------------
//		//use method without invoking and in place of lamda expression
//		//short cut to pass method as a parameter
//		
//		List<String> sList = Arrays.asList("Ram","Shayam"+"Ravi");
//		
//		sList.forEach(x -> System.out.println(x));
//		
//		sList.forEach(System.out :: println);
//		
//	
		
		
		
//Streams Demo -----------------------------------------------------
		
		
//		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
//		
//		Stream<Integer> stream = list.stream();
//		
//		//Source, intermediate operations & terminal operation
//		
//		System.out.println(list.stream().filter(x -> x%2 == 0).count());
//		

// Creating Streams-----------------

//		// 1. From collections
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//		Stream<Integer> stream = list.stream();
//
//		// 2. From Arrays
//		String[] array = { "a", "b", "c" }; 
//		Stream<String> stream1 = Arrays.stream(array);
//
//		// 3. Using Stream.of()
//		Stream<String> stream2 = Stream.of("a", "b");
//
//		// 4. Infinite streams
//		Stream.generate(() -> 1);
//		Stream.iterate(1, x -> x + 1);
		
		//using example
		//System.out.println(Stream.iterate(1, x -> x+2).limit(10).collect(Collectors.toList()));
		
		
//Intermediate Operations---------------
		
		 // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

  // 1. filter--------------------
		
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam", "Akshit");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        
        // no filtering at this point because we didn't used terminal operation yet
        
        long res = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);

        
        
        
// 2.map------------------------------
        Stream<String> stringStream = list.stream().map(x-> x.toUpperCase());
        
        

// 3. sorted ---------------------------
        
        
        Stream<String> sortedStream = list.stream().sorted();
        
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length());
        
        

// 4. distinct ------------------------------
        //distinct is not a terminal operation its been used with stream
        
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());
        
      
        
        

// 5. limit ----------------------------
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        
        
        
// 6. skip-----------------------------
        
        //starting 10 elements will be skipped
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count());


        
        
        
        
        
        
        
// Terminal Operations ---------------------------------------------------------
        
  List<Integer> list = Arrays.asList(1, 2, 3);

  // 1. collect --------------------
  		//accumulate elements
  
        list.stream().skip(1).collect(Collectors.toList());
        
        //direct use of to list, list is unmodifiable
        list.stream().skip(1).toList();
        
        
        
        
 // 2. forEach --------------------------
        //use consumer
        
        list.stream().forEach(x -> System.out.println(x));
        

        
        
// 3. count --------------------
        long count = list.stream().count();
        
        System.out.println("Count "+count);
        
        

// 4. anyMatch, allMatch, noneMatch -----------------------------
        
        //is there is any
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        
        
        //when all sa
        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);
        
        
        
        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);
        
        



	}
}
