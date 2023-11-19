package pack1;

import java.util.PriorityQueue;

public class LongestString {
	
	  public static String findNst(String[] strList, int nth){
	        PriorityQueue<String> lst = new PriorityQueue<>((a,b)-> b.length()-a.length());
	        for(String s: strList){
	            lst.add(s);
	        }
	        
	        while(nth>0){
	            lst.poll();
	            nth--;
	        }
	        return lst.poll();
	    }
	  
	  
	    public static void main(String[] args) {
	        String[] str = new String[]{"Yuri", "Interview", "Nordstrom", "Cat", "Dog", "Telephone", "AVeryLongString", "This code puzzle is easy"};
	        
	        System.out.println(findNst(str, 1));
	    }

}
