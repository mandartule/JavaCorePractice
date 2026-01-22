package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * public interface Comparable<T> {
    	int compareTo(T o);
	}
 */

class Employee implements Comparable<Employee>{
	
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id; //important
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]\n";
	}
	
	
}


public class TestComparable {
	

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1, "umesh", 23000));
		list.add(new Employee(3, "Mandar", 42000));
		list.add(new Employee(2, "Saman", 20000));
		list.add(new Employee(4, "Shushil", 90000));
	
		
		//ClassCastException
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
