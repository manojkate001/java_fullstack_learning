package day4;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListEx {
      public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Manoj");
		list.add("Shubham");
		list.add(0,"Shivtej");
		System.out.println(list.get(0));	
		System.out.println(list.size());
		System.out.println(list.contains("Manoj"));
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(String s : list) {
			System.out.print(s+" ");
		}
		System.out.println();
		list.forEach(s -> System.out.print(s+" "));
		
		Collections.sort(list);
	}
}
