package filter;
import java.util.*;

public class FilterClass {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4);

        list.stream()
            .map(x -> x * x)
            .forEach(System.out::println);
    }
}