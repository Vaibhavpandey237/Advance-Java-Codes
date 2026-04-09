package Reduce;
import java.util.*;
public class Class2 {
	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
//		int sum=list.stream()
//				    .reduce((a,b) -> a+b)
//				    .get();
		
		List<Integer>list=Arrays.asList(2,4,5,7);
		int product=list.stream()
				        .reduce((a,b)  ->a*b)
				        .get();
		System.out.println(product);
	}
	

}
