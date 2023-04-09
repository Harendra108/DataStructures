package practice.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicates {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        Map<Character, Long> collect =
                str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        ArrayList<Character> collect1 = collect.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(collect1);


    }
}
