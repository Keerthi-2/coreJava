package Collections;

import java.util.*;

public class Priorityqueue {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();//by default priorityqueue used min-heap
        pq.add(100);
        pq.add(30);
        pq.add(50);
        pq.add(120);
        boolean val=pq.remove(50);
        int poll_val=pq.poll(); //returns headnode (smaller val) and returns it
        //removes just removes smaller val node and doesn't return it
        System.out.println(poll_val);
        System.out.println(pq.peek()+"size is"+pq.size());

        Queue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        maxpq.add(40);
        maxpq.add(70);
        maxpq.add(60);
        maxpq.add(10);
        while(!maxpq.isEmpty()) {
            System.out.println(maxpq.poll());
        }

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
