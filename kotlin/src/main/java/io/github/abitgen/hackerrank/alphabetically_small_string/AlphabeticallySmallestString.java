package io.github.abitgen.hackerrank.alphabetically_small_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlphabeticallySmallestString {
    public static void main(String[] args) {
        //System.out.println(smallestString(Arrays.asList("a","bd","ac","cd")));
        System.out.println(smallestString(Arrays.asList(
                "d",
                "da",
                "db",
                "dc",
                "dd",
                "de")));
    }

    public static String smallestString(List<String> substrings) {

        Comparator<String> compSingleCharacter = (o1, o2) -> {
            return (o1+o2).compareTo(o2+o1);
        };

        Collections.sort(substrings, compSingleCharacter);
        return String.join("", substrings);
    }
}
