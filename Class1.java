package collect;
import java.util.*;
import java.util.stream.*;
public class Class1 {

	public static void main(String[] args) {

		        List<String> names = Arrays.asList("Ram","Shyam","Mohan");

		        List<String> result = names.stream()
		                                   .collect(Collectors.toList());

		        System.out.println(result);
		    }
		}

	


