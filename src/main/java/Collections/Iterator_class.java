package Collections;

import java.util.*;
import java.util.Iterator;


public class Iterator_class {
    public static void main(String[] args){

        //iterator use over other loops (for each or for loop)

//        (Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()) {
//            String name = iterator.next();
//            if (name.equals("RemoveMe")) {
//                iterator.remove();  // ✅ Safe removal during iteration
//            }
//        }) //Can remove elements during iteration (iterator.remove())
        //
        //✅ Works on any Iterable (even custom collections)
        //
        //✅ Full control of traversal (pause, resume, conditionally skip, etc.)
        //iterator for arraylist
        List<String> listiterator = new ArrayList<>();
        listiterator.add("Java");
        listiterator.add("Python");
        listiterator.add("C++");

        // 1--Create an Iterator for the ArrayList
        Iterator<String> iterator = listiterator.iterator();
        System.out.println("elements in arraylist using iterator");
        // Use iterator to traverse the list
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //2--iterator for set
        Set<Integer> sets=new HashSet<>();
        sets.add(10);
        sets.add(10);
        sets.add(100);
        sets.add(90);





        Iterator<Integer> setit=sets.iterator();
        System.out.println("elements in hashset using iterator");

        while(setit.hasNext()){
            Integer val =setit.next();
            if(val==100)
                setit.remove();
            else
            System.out.println(val);
        }

        //3--iterator for queue
        Queue<Integer> q=new LinkedList<>();
        q.add(100);
        q.add(90);
        q.add(80);
        Iterator<Integer> it=q.iterator();
        System.out.println("elements in queue using itertaor");
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
