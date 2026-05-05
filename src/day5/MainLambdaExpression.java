package day5;
//lambada Expression

//interface Add{
//	 int sum(int a , int b);
//}
//
//public class MainLambdaExpression{
//	  public static void main(String[] args) {
//		Add obj = (a ,b) -> a + b;
//		System.out.println(obj.sum(12,35));
//	}
//}
//
//interface Sqaure{
//	  int square(int n);
//}
//
//public class MainLambdaExpression{
//	   public static void main(String[] args) {
//		  Sqaure sq = (a) -> a * a;
//		  System.out.println(sq.square(12));
//	}
//}

//interface Show{
//	  void show();
//}
//
//public class MainLambdaExpression{
//	public static void main(String[] args) {
//		Show sh = () -> System.out.println("Hello World");
//		sh.show();
//	}
//}

//filter even numbers

//import java.util.*;
//import java.util.stream.*;
//
//public class MainLambdaExpression {
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//
//        list.stream()
//            .filter(x -> x % 2 == 0)
//            .forEach(System.out::println);
//    }
//}

//Predicate (returns true/false)

//import java.util.function.Predicate;
//public class MainLambdaExpression{
//	  public static void main(String[] args) {
//		Predicate<Integer> isEven =x -> x % 2 ==0;
//		System.out.println(isEven.test(10));
//	}
//}


//funcation (transform)
//import java.util.function.Function;
//
//public class MainLambdaExpression {
//    public static void main(String[] args) {
//
//        Function<Integer, Integer> square = x -> x * x;
//
//        System.out.println(square.apply(5)); // 25
//    }
//}


//Consumer(returns nothing)
//import java.util.function.Consumer;
//
//public class MainLambdaExpression {
//    public static void main(String[] args) {
//
//        Consumer<String> print = x -> System.out.println(x);
//
//        print.accept("Hello Manoj");
//    }
//}  

//Supplier (returns value)
//import java.util.function.Consumer;
//
//public class MainLambdaExpression {
//    public static void main(String[] args) {
//
//        Consumer<String> print = x -> System.out.println(x);
//
//        print.accept("Hello Manoj");
//    }
//}