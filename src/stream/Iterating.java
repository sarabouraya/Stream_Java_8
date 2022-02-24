package stream;


import java.util.stream.*;  

public class Iterating {
	 
	    public static void main(String[] args){  
	    	
	    	String s = "A";
			Stream.iterate(s, str -> str + s)
			.skip(1)
			.limit(3)
	        .forEach(System.out::println);  
	    	
	        Stream.iterate(1, count->count+1)  
	        .filter(number->number%3==0)  
	        .limit(6)  
	        .forEach(System.out::println);  
	    }  
	
}
