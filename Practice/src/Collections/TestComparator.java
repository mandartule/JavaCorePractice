package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2;
	}
	
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
}

class Student{
	
	String name;
	double gpa;
	
	public Student(String name, double gpa) {
		
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	
	
}

public class TestComparator {
	
	public static void main(String[] args) {
			
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(2);
//		list.add(1);
//		list.add(3);
//		
////		list.sort(new MyComparator());
//	
//		Collections.sort(list,(a,b) -> b-a);
//		
//	
//		System.out.println(list);
//		
//		
//		List<String> words = Arrays.asList("banana","apple","date");
//		
//		//words.sort(new StringLengthComparator());
//		//or
//		words.sort((a,b) -> b.length() - a.length());
//		
//		System.out.println(words);
//		
		
		
		
		
		
		List<Student> list = new ArrayList<>();
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("Bob", 3.7));
        list.add(new Student("Alice", 3.5));
        list.add(new Student("Akshit", 3.9));
        
        
        
//        list.sort((a,b) ->{
//        	if(a.getGpa() - b.getGpa() > 0) {
//        		return 1;
//        	}else if(b.getGpa() - a.getGpa() > 0) {
//        		return -1;
//        	}
//        	else return 0;
//        });
        
        
//        Collections.sort(list, (a, b) -> {
//           
//            if (a.getGpa() == b.getGpa()) {
//            	return a.getName().compareTo(b.getName());
//                
//            }else {
//            	return Double.compare(b.getGpa(), a.getGpa());
//            }
//            
//        });
        
        //java 8 
        
        list.sort(Comparator.comparing(Student::getGpa).reversed()
        		.thenComparing(Student::getName));

        
        
        for(Student s : list) {
        	System.out.println(s.getName()+" "+s.getGpa());
        }
	}
	
}
