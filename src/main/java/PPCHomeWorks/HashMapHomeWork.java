package PPCHomeWorks;

import java.util.HashMap;
import java.util.Set;

public class HashMapHomeWork {
    public static void main(String args[]) {
        System.out.println("----------------------");
        System.out.println("HashMap ex 1:Write a Java program to copy all of the mappings from the specified map to another map. ");
        HashMap<Integer,String> hash_map1 = new HashMap <Integer,String> ();
        HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();

        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");



        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");

        hash_map2.putAll(hash_map1);
        System.out.println("\nNow values in second map: " + hash_map2);

        System.out.println("----------------------");
        System.out.println("HashMap ex 2:Write a Java program to check whether a map contains key-value mappings (empty) or not.");

        HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        boolean result = hash_map.isEmpty();

        System.out.println("Is hash map empty: " + result);
        hash_map.clear();
        result = hash_map.isEmpty();
        System.out.println("Is hash map empty: " + result);

        System.out.println("----------------------");
        System.out.println("HashMap ex 3:Write a Java program to test if a map contains a mapping for the specified key.");

        HashMap < String, Integer > hashmap = new HashMap < String, Integer > ();
        hashmap.put("Red", 1);
        hashmap.put("Green", 2);
        hashmap.put("Black", 3);
        hashmap.put("White", 4);
        hashmap.put("Blue", 5);

        System.out.println("The Original map: " + hashmap);
        System.out.println("1. Is key 'Green' exists?");
        if (hashmap.containsKey("Green")) {

            System.out.println("yes! - " + hashmap.get("Green"));
        } else {
            System.out.println("no!");
        }

        System.out.println("----------------------");
        System.out.println("HashMap ex 4: Write a Java program to test if a map contains a mapping for the specified value.");

        if (hash_map1.containsValue("Green")) {
            System.out.println("yes! - ");
        } else {
            System.out.println("no!");
        }

        System.out.println("----------------------");
        System.out.println("HashMap ex 5:Write a Java program to create a set view of the mappings contained in a map.");

        Set set = hash_map1.entrySet();
        System.out.println("Set values: " + set);

        System.out.println("----------------------");
        System.out.println("HashMap ex 6:Write a Java program to get the value of a specified key in a map");
        //System.out.println(hash_map1.get(2));
        //or
        String val=(String)hash_map1.get(2);
        System.out.println("Value for key 2 is: " + val);

        System.out.println("----------------------");
        System.out.println("HashMap ex 7:Write a Java program to get a set view of the keys contained in this map.");

        Set keyset = hash_map1.keySet();
        System.out.println("Key set values are: " + keyset);

        System.out.println("----------------------");
        System.out.println("HashMap ex 8:Write a Java program to get a collection view of the values contained in this map.");
        System.out.println("Collection view is: "+ hash_map1.values());


    }
}
