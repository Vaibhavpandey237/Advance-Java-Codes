package Sorting;
import java.util.*;

public class ArrayList1 {
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();

	        list.add("A");
	        list.add("B");
	        list.add("C");

	        Object[] arr = list.toArray();

	        for(Object i : arr) {
	            System.out.println(i);
	        }
	    }
	}


