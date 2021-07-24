package PPCHomeWorks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListHomeWork {
    public static void main(String[] args) {
        System.out.println("Linked list ex 1: Write a Java program to append the specified element to the end of a linked list.");
        LinkedList<String> l_list = new LinkedList<>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        LinkedList <String> new_l_list = new LinkedList <String> ();
        new_l_list.add("BMW");
        new_l_list.add("Mercedes");

        System.out.println("The linked list: " + l_list);

        System.out.println("------------------------------");
        System.out.println("Linked list ex 2: Write a Java program to iterate a linked list in reverse order");
        Iterator<String> iterator = l_list.descendingIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");
        System.out.println("Linked list ex 3: Write a Java program to insert the specified element at the specified ");
        l_list.add(0, "*Brown*");
        System.out.println("Adding specific element *Brown* " + l_list);

        System.out.println("------------------------------");
        System.out.println("Linked list ex 4:Write a Java program to insert some elements at the specified position into a linked list");
        l_list.addAll(1, new_l_list);
        System.out.println(l_list);

        System.out.println("------------------------------");
        System.out.println("Linked list ex 5:Write a Java program to remove a specified element from linked list.");

        l_list.removeAll(new_l_list);
        l_list.remove(0);
        System.out.println(l_list);

        System.out.println("------------------------------");
        System.out.println("Linked list ex 6:Write a Java program to remove first and last element from linked list.");

        Object firstElement = l_list.removeFirst();
        System.out.println("Element removed: "+ firstElement);


        Object lastElement = l_list.removeLast();
        System.out.println("Element removed: "+ lastElement);
        System.out.println("The New linked list: " + l_list);

        System.out.println("------------------------------");
        System.out.println("Linked list ex 7:Write a Java program to join two linked lists.");

        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(l_list);
        a.addAll(new_l_list);
        System.out.println("New linked list: " + a);

        System.out.println("------------------------------");
        System.out.println("Linked list ex 8:Write a Java program to remove and return the first element of linked list.");

        System.out.println("Original linked  list: " + l_list);
        System.out.println("Removed element: "+l_list.pop());
        System.out.println("Linked list after pop operation: "+l_list);

        System.out.println("------------------------------");
        System.out.println("Linked list ex 9:Write a Java program to retrieve but does not remove, the last element of a linked list.");

        String x = l_list.peekLast();
        System.out.println("First element in the list: " + x);
        System.out.println("Original linked list: " + l_list);

        System.out.println("------------------------------");
        System.out.println("Linked list ex 10:Write a Java program to retrieve but does not remove, the first element of a linked list");
        String y = l_list.peekFirst();
        System.out.println("First element in the list: " + y);
        System.out.println("Original linked list: " + l_list);

        System.out.println("------------------------------");
        System.out.println("Linked list ex 11:Write a Java program to convert linked list to array list.");
        List<String> list = new ArrayList<String>(l_list);

        for (String str : list){
            System.out.println(str);
        }
        System.out.println("------------------------------");
        System.out.println("Linked list ex 12: Write a Java program to compare two linked lists.");

        System.out.println(l_list + "\n" + new_l_list);
        LinkedList<String> c3 = new LinkedList<>();
        for (String e : l_list)
            c3.add(new_l_list.contains(e) ? "Yes" : "No");
        System.out.println(c3);

        System.out.println("------------------------------");
        System.out.println("Linked list ex 13:Write a Java program to check if a particular element exists in a linked list");

        System.out.println(l_list);
        if (l_list.contains("Green")) {
            System.out.println("Color Green is present in the linked list.");
        } else {
            System.out.println("Color Green is not present in the linked list.");
        }

    }


}
