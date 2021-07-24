package PPCHomeWorks;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapHomeWork {
    public static void main(String args[]){
        System.out.println("-------------------------");
        System.out.println("TreeMap ex 1 Write a Java program to copy a Tree Map content to another Tree Map content.");
        TreeMap<String,String> tree_map1=new TreeMap<String,String>();

        tree_map1.put("C1", "Red");
        tree_map1.put("C2", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C4", "White");
        tree_map1.put("C5", "Blue");
        System.out.println("Tree Map 1: "+tree_map1);

        SortedMap<?, ?> sub_tree_map = new TreeMap < Integer, String > ();


        TreeMap<String,String> tree_map2 = new TreeMap<String,String>();
        tree_map2.put("A1", "Orange");
        tree_map2.put("A2", "Pink");

        System.out.println("Tree Map 2: "+tree_map2);
        tree_map1.putAll(tree_map2);
        System.out.println("After coping map2 to map1: "+tree_map1);

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 2 Write a Java program to search a key in a Tree Map.");

        if(tree_map1.containsKey("C1")){
            System.out.println("The Tree Map contains key C1");
        } else {
            System.out.println("The Tree Map does not contain key C1");
        }
        if(tree_map1.containsKey("C5")){
            System.out.println("The Tree Map contains key C5");
        } else {
            System.out.println("The TreeMap does not contain key C5");
        }

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 3 Write a Java program to search a value in a Tree Map.");

        if(tree_map1.containsValue("Green")){
            System.out.println("The TreeMap contains value Green");
        } else {
            System.out.println("The TreeMap does not contain value Green");
        }
        if(tree_map1.containsValue("Pink")){
            System.out.println("The TreeMap contains value Pink");
        } else {
            System.out.println("The TreeMap does not contain value Pink");
        }

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 4 Write a Java program to get all keys from the given a Tree Map.");

        Set<String> keys = tree_map1.keySet();
        for(String key: keys){
            System.out.println(key);
        }

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 5 Write a Java program to sort keys in Tree Map by using comparator.");

        class sort_key implements Comparator<String> {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        }
        System.out.println("-------------------------");
        System.out.println("TreeMap ex 6Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Greatest key: " + tree_map1.firstEntry());
        System.out.println("Least key: " + tree_map1.lastEntry());

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 7 Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Greatest key: " + tree_map1.firstKey());
        System.out.println("Least key: " + tree_map1.lastKey());

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 8 Write a Java program to get a reverse order view of the keys contained in a given map.");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Reverse order view of the keys: " + tree_map1.descendingKeySet());

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 9 Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key. ");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Checking the entry for C1: ");
        System.out.println("Value is: " + tree_map1.floorEntry("C1"));
        System.out.println("Checking the entry for C2: ");
        System.out.println("Value is: " + tree_map1.floorEntry("C2"));
        System.out.println("Checking the entry for C3: ");
        System.out.println("Value is: " + tree_map1.floorEntry("C3"));

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 10 Write a Java program to get the greatest key less than or equal to the given key.");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Checking the entry for C1: ");
        System.out.println("Key is: " + tree_map1.floorKey("C1"));
        System.out.println("Checking the entry for C2: ");
        System.out.println("Key is: " + tree_map1.floorKey("C2"));
        System.out.println("Checking the entry for C3: ");
        System.out.println("Key is: " + tree_map1.floorKey("C3"));

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 11  Write a Java program to get the portion of a map whose keys are strictly less than a given key.");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Checking the entry for C1: ");
        System.out.println("Key(s): " + tree_map1.headMap("C1"));
        System.out.println("Checking the entry for C3: ");
        System.out.println("Key(s): " + tree_map1.headMap("C3"));
        System.out.println("Checking the entry for C7: ");
        System.out.println("Key(s): " + tree_map1.headMap("C7"));

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 12 Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key. ");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Checking the entry for A1: ");
        System.out.println("Key(s): " + tree_map1.lowerKey("A1"));
        System.out.println("Checking the entry for C2: ");
        System.out.println("Key(s): " + tree_map1.lowerKey("C2"));
        System.out.println("Checking the entry for C7: ");
        System.out.println("Key(s): " + tree_map1.lowerKey("C7"));

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 13 Write a Java program to get NavigableSet view of the keys contained in a map.");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Original TreeMap content: " + tree_map1.navigableKeySet());

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 14 Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.");

        System.out.println("Orginal TreeMap content: "+tree_map1);
        System.out.println("Checking the entry for A1: ");
        System.out.println("Key(s): "+tree_map1.lowerEntry("A1"));
        System.out.println("Checking the entry for C2: ");
        System.out.println("Key(s): "+tree_map1.lowerEntry("C2"));
        System.out.println("Checking the entry for C7: ");
        System.out.println("Key(s): "+tree_map1.lowerEntry("C7"));

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 15 Write a Java program to remove and get a key-value mapping associated with the least key in a map.");

        System.out.println("Value before poll: " + tree_map1);
        System.out.println("Value returned: " + tree_map1.pollFirstEntry());
        System.out.println("Value after poll: " + tree_map1);

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 16 Write a Java program to get the portion of a map whose keys range from a given key to another key.");

        sub_tree_map = tree_map1.subMap("C1","C4");
        System.out.println("Sub map key-values: " + sub_tree_map);

        System.out.println("-------------------------");
        System.out.println("TreeMap ex 17 Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Keys are greater than C2: " + tree_map1.tailMap("C2", false));

    }
}
