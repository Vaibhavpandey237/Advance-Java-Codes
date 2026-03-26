package filter;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Ravi");
        names.add("Karan");
        names.add("Virat");
        for(String name : names) {
        	if(name.startsWith("A")) {
        		System.out.println(name);
        	}
        }
         
    }
}