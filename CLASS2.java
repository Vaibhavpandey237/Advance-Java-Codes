package collect;

import java.util.*;
import java.util.stream.*;

public class CLASS2 {

	    public static void main(String[] args) {

	        List<Integer> numbers = Arrays.asList(2,4,6,8);

	        List<Integer> result = numbers.stream()
	                                      .map(x -> x * x)
	                                      .collect(Collectors.toList());

	        System.out.println(result);
	    }
}	


