package Reduce;

import java.util.*;

public class Productsquare {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);

        int result = list.stream()
                .map(x -> x * x)
                .reduce(1,(a,b) -> a*b);

        System.out.println(result);
    }
}