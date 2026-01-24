package Collections;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyOnWrite {

	public static void main(String[] args) {

//		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();

		List<String> shoppingList = new CopyOnWriteArrayList<>();
		shoppingList.add("Milk");
		shoppingList.add("Eggs");
		shoppingList.add("Bread");
		
		System.out.println("Initial Shopping List: " + shoppingList);

		for (String item : shoppingList) {
			
			System.out.println(item);
			// Try to modify the list while reading
			if(item.equals("Eggs")) {
				shoppingList.add("Water");

				// Simultaneous actions
			} 
			
		}
		
		System.out.println("Updated Shopping List: " + shoppingList);
		
		
		//here the loop is no 

	}
}
