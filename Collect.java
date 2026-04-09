package Reduce;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {

        List<String> names = Stream.of("Jorden","Mika","Mafia")
                .collect(Collectors.toList());

        System.out.println(names);
    }
}