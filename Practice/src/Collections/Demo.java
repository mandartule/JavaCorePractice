package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Abc{
	
	private int id;
	private String name;
	
	
	public Abc(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

public class Demo {
	public static void main(String[] args) {
		
		List<Abc> list =  new ArrayList<>();
		
		
		
		list.add(new Abc(1, "Rahul"));
		list.add(new Abc(2, "Shena"));
		list.add(new Abc(3, "Mayur"));
		
		List<Abc> list2 = new ArrayList<Abc>();
		
		list2.addAll(list);
		
		
		for(Abc l : list2) {
			System.out.println(l.getId()+" "+l.getName());
		}
		
		
		
		List<Abc> collect = list2.stream().filter(a -> a.getId() > 2).collect(Collectors.toList());
		
		System.out.println("filtered list");
		
		for(Abc l : collect) {
			System.out.println(l.getId()+" "+l.getName());
		}
		
		
	}
}
