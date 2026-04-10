package Reduce;
import java.util.*;

public class FormatNumbers {
	public static void main(String[] args) {
		
		        List<Integer> list = Arrays.asList(1,2,3);

		        String result = list.stream()
		                .map(String::valueOf)
		                .reduce((a,b)-> a+" -> "+b)
		                .get();

		        System.out.println(result);
		    }
		}
	


