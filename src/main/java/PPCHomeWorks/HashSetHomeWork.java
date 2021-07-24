package PPCHomeWorks;

import java.util.*;

public class HashSetHomeWork {
    public static void main(String[] args) {

        System.out.println("Ex Hash set 1; Write a Java program to iterate through all elements in a hash list.");

        HashSet<String> hSet = new HashSet<>();

        hSet.add("Red");
        hSet.add("Green");
        hSet.add("Black");
        hSet.add("White");
        hSet.add("Pink");
        hSet.add("Yellow");

        HashSet<String>hSet2 = new HashSet<String>();
        hSet2.add("Red");
        hSet2.add("Pink");
        hSet2.add("Black");
        hSet2.add("Orange");


        Iterator<String> p = hSet.iterator();
        while (p.hasNext()) {
            System.out.println(p.next());
        }
        System.out.println("------------------------------");
        System.out.println("Ex Hash set 2; Write a Java program to get the number of elements in a hash set.");
        System.out.println("Size of the Hash Set: " + hSet.size());

        System.out.println("------------------------------");
        System.out.println("Ex Hash set 3; Write a Java program to clone a hash set to another hash set.");

        HashSet<String> newHSet = new HashSet<String>();
        newHSet = (HashSet) hSet.clone();
        System.out.println("Clone of Hash Set: " + newHSet);

        System.out.println("------------------------------");
        System.out.println("Ex Hash set 4; Write a Java program to convert a hash set to an array.");

        String[] new_array = new String[hSet.size()];
        hSet.toArray(new_array);

        System.out.println("Array elements: ");
        for (String element : new_array) {
            System.out.println(element);
        }
            System.out.println("------------------------------");
            System.out.println("Ex Hash set 5; Write a Java program to convert a hash set to a tree set.");

            Set<String> tree_set = new TreeSet<>(hSet);
            System.out.println("TreeSet elements: ");
            for(String el : tree_set) {
                System.out.println(el);
            }
                System.out.println("------------------------------");
                System.out.println("Ex Hash set 6; Write a Java program to convert a hash set to a List/ArrayList.");
                List<String> list = new ArrayList<>(hSet);
                System.out.println(hSet);
                System.out.println(list);

                System.out.println("------------------------------");
                System.out.println("Ex Hash set 7; Write a Java program to compare two hash set.");


                //comparison output in hash set
                for (String element1 : hSet) {
                    System.out.println(hSet2.contains(element1) ? "Yes" : "No");
                }
                    System.out.println("------------------------------");
                    System.out.println("Ex Hash set 8; Write a Java program to compare two sets and retain elements which are same on both sets");

                    hSet.retainAll(hSet2);
                    System.out.println(hSet);

                System.out.println("------------------------------");
                System.out.println("Ex Hash set 9; Write a Java program to remove all of the elements from a hash set.");
        System.out.println(hSet2);
                hSet2.clear();
                System.out.println(hSet2);



}
}

