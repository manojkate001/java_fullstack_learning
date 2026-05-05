package day5;
import java.util.function.*;
public class FunctionalIntefaceMain {
          public static void main(String[] args) {
//        	  Predicate(return true or false)
        	  
        	  Predicate<Integer> pr = x -> x >=18;
        	  System.out.println(pr.test(19));
        	  
//        	  Function (take something and return other)
//        	  in this case it takes the string and returning string length
        	  
        	  Function<String,Integer> fn = str -> str.length();
        	  System.out.println(fn.apply("ManojKate"));
        	  
//        	  Consumer(used for returning nothing)
        	  Consumer<String> cons = s -> System.out.println(s);
        	  cons.accept("Manoj");
        	  
//        	  Supplier(Give value and no return)
        	  
        	  Supplier<String> sp = ()-> "Welcome Manoj";
        	  System.out.println(sp.get());
          }
}
