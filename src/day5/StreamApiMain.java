package day5;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMain {
       public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> evens = list.stream()
				.filter(n -> n % 2 ==0)
				.collect(Collectors.toList());
		System.out.println(evens);
		
		List<Integer> sorted = list.stream()
				.distinct()
				.sorted()  
				.collect(Collectors.toList());
		System.out.println(sorted);
		
		List<Integer> square = list.stream()
				.map(n -> n*n)
				.collect(Collectors.toList());
		System.out.println(square);
				
	}
}
