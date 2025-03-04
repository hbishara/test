package com.bijoubrigitte.gittest;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MyMap {

    public static void main(String[] args) {
        // create unsorted map
        Map<Double, String> unSortedMap = new HashMap<>();

        unSortedMap.put(1d, "one");
        unSortedMap.put(2d, "two");
        unSortedMap.put(3d, "three");
        // HashMap accepts one null key but multiple null values
        unSortedMap.put(null, "first null value");
        
        // try to add another null key
        unSortedMap.put(null, "second null value"); // only one null key is allowed; this line overwrites the first null key
        
        // add null value 
        unSortedMap.put(4d, null);
        // add null value 
        unSortedMap.put(5d, null);



        unSortedMap.entrySet().stream().forEach(System.out::println);
        
        // print entries with null key
        Map<Double, String> onlyNullKey = unSortedMap.entrySet().stream().filter(e -> e.getKey() == null).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("############# print only null keys ##############");
        onlyNullKey.entrySet().stream().forEach(System.out::println);
        
        // print entries with null value
        Map<Double, String> onlyNullValues = unSortedMap.entrySet().stream().filter(e -> e.getValue() == null).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("############# print only null values ##############");
        onlyNullValues.entrySet().stream().forEach(System.out::println);



    }
}