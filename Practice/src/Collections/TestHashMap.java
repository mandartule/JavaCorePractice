package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Akshit");
		map.put(2, "Neha");
		map.put(3, "Shubham");

		System.out.println(map);
		
		String string = map.get(3);
		
		map.get(69); // null no values

		map.containsKey(2); //true
		
		map.containsValue("Neha");
		
		
		//iterating
		for(int i : map.keySet()) {
			System.out.println(map.get(i));
		}
		//no order
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//entrySet() backed my the map so changing it changes the map too
		
		Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 10);
        map1.put("B", 20);

        System.out.println("Before: " + map1);

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getKey().equals("A")) {
                entry.setValue(100); // updates the orignal map too
            }
        }

        System.out.println("After: " + map1);
		
	}
}
