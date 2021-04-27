package com.ayantsoft.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits = new ArrayList<String>();

		fruits.add("Somnath");
		fruits.add("Arbind");
		fruits.add("Stella");
		    
		Stream<String> stream = fruits.stream();
		    
		Stream<String> stringStream =
		    stream
		    .map((value) -> {return value.toLowerCase();}) ;
		  
		   
		stringStream.forEach(System.out::println);
        
        
        //System.out.println(l);
        
       /* List<String>stNames=stringStream
        		.filter(v->v.equals("somnath"))
        		.collect(Collectors.toList());
		
        stNames.forEach(System.out::println);
        */
        
		
	}

}
