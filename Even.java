package Reduce;
import java.util.*;

public class Even {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        int sum = list.stream()
                .reduce(0,(a,b)-> b%2==0 ? a+b : a);

        System.out.println("Sum of Even = " + sum);
    }
}