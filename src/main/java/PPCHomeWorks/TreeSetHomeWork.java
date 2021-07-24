package PPCHomeWorks;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHomeWork {
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("tree set ex 1: Write a Java program to add all the elements of a specified tree set to another tree set.");
        TreeSet<String> tree_set1 = new TreeSet<String>();
        tree_set1.add("Red");
        tree_set1.add("Green");
        tree_set1.add("Orange");

        TreeSet<String> tree_set2 = new TreeSet<String>();
        tree_set2.add("Pink");
        tree_set2.add("White");
        tree_set2.add("Black");

        TreeSet<String> tree_set3 = new TreeSet<>();
        tree_set3.add("BMW");
        tree_set3.add("Mercedes");
        tree_set3.add("Yellow");
        tree_set3.add("White");
        tree_set3.add("Red");

        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);
        tree_num.add(20);

        System.out.println("Tree set1: "+tree_set1);
        System.out.println("Tree set2: "+tree_set2);
        System.out.println("Tree set2: "+tree_set3);

        tree_set1.addAll(tree_set2);
        System.out.println("Tree set1: "+tree_set1);

        System.out.println("----------------------");
        System.out.println("tree set ex 2:Write a Java program to create a reverse order view of the elements contained in a given tree set.");

        Iterator it = tree_set1.descendingIterator();
        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
            System.out.println("----------------------");
            System.out.println("tree set ex 3:Write a Java program to get the first and last elements in a tree set.");

        Object first_element = tree_set1.first();
        System.out.println("First Element is: "+first_element);


        Object last_element = tree_set1.last();
        System.out.println("Last Element is: "+last_element);

        System.out.println("----------------------");
        System.out.println("tree set ex 4:Write a Java program to clone a tree set list to another tree set.\n");

        System.out.println(tree_set2);
        TreeSet<String> new_t_set = (TreeSet<String>)tree_set2.clone();
        System.out.println("Cloned tree list: " + new_t_set);

        System.out.println("----------------------");
        System.out.println("tree set ex 5:Write a Java program to compare two tree sets.");

        TreeSet<String> result_set = new TreeSet<String>();
        for (String element : tree_set1){
            System.out.println(tree_set3.contains(element) ? "Yes" : "No");
        }

        System.out.println("----------------------");
        System.out.println("tree set ex 6:Write a Java program to find the numbers less than 7 in a tree set.");

        treeheadset = (TreeSet)tree_num.headSet(7);

        Iterator iterator;
        iterator = treeheadset.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        System.out.println("----------------------");
        System.out.println("tree set ex 7:Write a Java program to get the element in a tree set which is greater than or equal to the given element.");

        System.out.println("Greater than or equal to 10 : "+tree_num.ceiling(10));

        System.out.println("----------------------");
        System.out.println("tree set ex 8:Write a Java program to get the element in a tree set which is less than or equal to the given element.");

        System.out.println("Less than or equal to 11 : "+tree_num.floor(11));

        System.out.println("----------------------");
        System.out.println("tree set ex 9:");

        System.out.println("Strictly greater than 55 : "+tree_num.lower(55));

        System.out.println("----------------------");
        System.out.println("tree set ex 10:Write a Java program to retrieve and remove the first element of a tree set.\n");

        System.out.println("Original tree set: "+tree_num);
        System.out.println("Removes the first element: "+tree_num.pollFirst());
        System.out.println("Tree set after removing first element: "+tree_num);

        System.out.println("----------------------");
        System.out.println("tree set ex 11:Write a Java program to remove a given element from a tree set.");

        System.out.println("Removes 5 from the list: "+tree_num.remove(5));
        System.out.println(tree_num);

        System.out.println("----------------------");
        System.out.println("tree set ex 12:Write a Java program to retrieve and remove the last element of a tree set.");

        System.out.println("Original tree set: "+tree_num);
        System.out.println("Removes the Last element: "+tree_num.pollLast());
        System.out.println("Tree set after removing first element: "+tree_num);

    }
}
