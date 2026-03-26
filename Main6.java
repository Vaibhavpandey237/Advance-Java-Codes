package filter;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple","dog","elephant","cat","pen");

        list.stream()
            .filter(x -> x.contains("e"))
            .forEach(System.out::println);
    }
}