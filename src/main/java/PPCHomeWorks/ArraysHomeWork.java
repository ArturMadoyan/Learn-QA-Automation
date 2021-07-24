package PPCHomeWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysHomeWork {
    public static void main(String[] args) {
        System.out.println("1 Exercise: Write a Java program to compare two array lists.");
        // 1 Exercise:

        ArrayList<String> ArrayList1 = new ArrayList<String>();
        ArrayList<String> ArrayList2 = new ArrayList<String>();
        List<Integer> num = Arrays.asList(10, 20, 40, 5, 4);



        ArrayList1.add("item 1");
        ArrayList1.add("item 2");
        ArrayList1.add("item 3");
        ArrayList1.add("item 4");


        ArrayList2.add("item 1");
        ArrayList2.add("item 2");
        ArrayList2.add("item 3");
        ArrayList2.add("item 4");
        ArrayList2.add("item 5");


        System.out.println(" ArrayList1 = " + ArrayList2);
        System.out.println(" ArrayList1 = " + ArrayList1);


        if (ArrayList1.equals(ArrayList2) == true) {
            System.out.println(" Array List are equal");
        }
        else

        {
            System.out.println(" Array List are not equal");
        }
        System.out.println("2 Exercise: Write a Java program of swap two elements in array list.");
     // 2 Exercise:
        System.out.println("-------------------");
        Collections.swap(ArrayList1, 1, 2);

        System.out.println(ArrayList1);

        System.out.println("-------------------");
        System.out.println("Ex 3; Write a Java program to join two array lists.");
        // 3 Exercise:
        // After checking the exercise please comment the following code below
//        ArrayList1.addAll(ArrayList2);
//        System.out.println(ArrayList1);

        System.out.println("-------------------");

        System.out.println("Ex 4: Write a Java program to clone an array list to another array list.");
        // 4 Exercise:

        System.out.println(ArrayList1 + " --1");
        ArrayList ArrList3 = (ArrayList)ArrayList1.clone();
        System.out.println(ArrList3 + "Printing  ArrayList3 Which is Clone of ArrayList1");


        System.out.println("-------------------");

        System.out.println("Ex 5: Write a Java program to reverse elements in array list.");
        // 5 Exercise:
        System.out.println(ArrayList1);
        Collections.reverse(ArrayList1);
        System.out.println(ArrayList1 + " After reverse");

        System.out.println("-------------------");
        System.out.println("Ex 6: search an element in array list.");
        // 6 Exercise:

        boolean con = ArrayList1.contains("item 1");
        if (con)
            System.out.println("your element is found");
        else
            System.out.println("Element does not does not found");

        System.out.println("-------------------");
        System.out.println("Ex 7: Write a Java program to update specific array element by given element.");
        // 7 Exercise:
        ArrayList2.set(0, "Specific element");
        System.out.println(ArrayList2);

        System.out.println("-------------------");
        System.out.println("Ex 8: Write a Java program to iterate through all elements in array list.");
        // 8 Exercise:

        System.out.println(num);
        for (int i = 0; i < num.size(); i++)
            System.out.print(num.get(i) + " ");

        System.out.println("-------------------");
        System.out.println("Ex 9: Write a Java program to remove the third element from array list.");
        // 9 Exercise:

        System.out.println(ArrayList2);
        ArrayList2.remove(3);
        System.out.println(ArrayList2);

    }
}
