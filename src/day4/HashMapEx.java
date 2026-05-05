package day4;
import java.util.*;
public class HashMapEx {
    
      public static void main(String[] args) {
//    	  HashMap<Integer,String> map = new HashMap<>();
//          map.put(101,"Manoj");
//          map.put(102,"Ritesh");
//          map.put(103,"Prem");
//          System.out.println(map.get(101));
//          System.out.println(map.containsKey(101));
//          System.out.println(map.containsValue("Manoj"));
//          
//          for(Map.Entry<Integer,String> entry :map.entrySet()) {
//        	  System.out.println(entry.getKey()+" "+entry.getValue());
//          }
          HashMap<Integer,Integer> map = new HashMap<>();
          int[] arr = {1,2,1,3,1,4,5,5};
          for(int i=0;i<arr.length;i++) {
        	  if(map.containsKey(arr[i])) {
        		  map.put(arr[i],map.get(arr[i])+1);
        	  }else {
        		  map.put(arr[i],1);
        	  }
          }
          for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
        	  System.out.println(entry.getKey()+" "+entry.getValue());
          }
	}
}
