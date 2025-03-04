package com.bijoubrigitte.gittest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MyList {

    public static void main(String args[]) {
        List<String> names = new ArrayList<>();

        names.add("a"); names.add("z");
        names.add("z");
        names.add("z");
        names.add("z");
        names.add("z");
        names.add(null);
        names.add(null);
        names.add("c");
        
        names.stream().forEach(System.out::println);
        System.out.println("sort the list ");

        try {
            Collections.sort(names);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException; the list contains null elements; calling Collections.sort is not allowed on a list with null elements");
        }

        System.out.println("remove all null elements before calling Collections.sort"); 
        names = names.stream().filter(Objects::nonNull).collect(Collectors.toList());
        names.stream().forEach(System.out::println);
    }
    
}
