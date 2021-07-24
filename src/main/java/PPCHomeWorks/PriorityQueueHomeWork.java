package PPCHomeWorks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueHomeWork {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("PropertyQueue ex 1 :Write a Java program to iterate through all elements in priority queue.");
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Orange");
        pq.add("White");
        pq.add("Black");

        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.add("Pink");
        queue2.add("BMW");
        queue2.add("Mercedes");

        PriorityQueue<String> pq2 = new PriorityQueue<String>();
        pq2.add("Red");
        pq2.add("Pink");
        pq2.add("Black");
        pq2.add("Orange");

        for (String element : pq) {
            System.out.println(element);
        }
        System.out.println("-------------------");
        System.out.println("PropertyQueue ex 2 Write a Java program to add all the elements of a priority queue to another priority queue. :");

        pq.addAll(queue2);
        System.out.println("New Priority Queue1: "+pq);

        System.out.println("-------------------");
        System.out.println("PropertyQueue ex 3 : Write a Java program to insert a given element into a priority queue.");

        queue2.offer("Brown");
        System.out.println(queue2);

        System.out.println("-------------------");
        System.out.println("PropertyQueue ex 4 :Write a Java program to remove all the elements from a priority queue.\n");

        queue2.clear();
        System.out.println(queue2);

        System.out.println("-------------------");
        System.out.println("PropertyQueue ex 5 :Write a Java program to compare two priority queues.");

        for (String element : pq) {
            System.out.println(pq2.contains(element) ? "Yes" : "No");
        }
        System.out.println("-------------------");
        System.out.println("PropertyQueue ex 6 :Write a Java program to retrieve the first element of the priority queue.");

            System.out.println("The first element of the Queue: "+pq.peek());

        System.out.println("-------------------");
        System.out.println("PropertyQueue ex 7 :Write a Java program to convert a priority queue to an array containing all of the elements of the queue.");

        List<String> array_list = new ArrayList<String>(pq);
        System.out.println("Array containing all of the elements in the queue: "+array_list);

        System.out.println("-------------------");
        System.out.println("PropertyQueue ex 8 :Write a Java program to change priorityQueue to maximum priorityqueue.");

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10,Collections.reverseOrder());

        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);

        System.out.println(pq1);
        Integer val = null;
        while( (val = pq1.poll()) != null) {
            System.out.print(val+"  ");
        }

        }
}
