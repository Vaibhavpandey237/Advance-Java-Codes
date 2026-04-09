package Reduce;

import java.util.*;


public class MAXMIN {
	
	    public static void main(String[] args) {

	        List<Integer> list = Arrays.asList(10,50,20,70,30);

	        int max = list.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);

	        System.out.println("Max = " + max);
	    }
	}

