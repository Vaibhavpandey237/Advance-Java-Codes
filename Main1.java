package filter;
import java.util.*;
public class Main1 {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(12);
		list.add(15);
		
		list.stream()
		.filter(n ->n % 3 == 0 && n % 5 != 0)
		.forEach(System.out::println);
	}

}
