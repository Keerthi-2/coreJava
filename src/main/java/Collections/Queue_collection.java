package Collections;

import java.util.LinkedList;
import java.util.*;
public class Queue_collection {
    public static void main(String[] arr){
        //concrete class implementing public class LinkedList<E>
        //    extends AbstractSequentialList<E>
        //    implements List<E>, Deque<E>, Cloneable, java.io.Serializable
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(40);
        queue.add(30);
        queue.add(20);
   //poll removes element from queue and return head and null if its empty
        //peek return the first element of queue (fifo)
        //remove does same as poll difference its just returns exception when queue is empty
    System.out.println(queue.peek());
    //there is no indexing
//    for(int i=0;i<queue.size();i++){
//        System.out.println(queue.peek());
//        queue.poll();
//    }
     for(Integer q:queue)
         System.out.println(q);



    }
}
