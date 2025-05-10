package Collections;

import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class iterator_class2 {
    public static void main(String[] args){
        Set<Integer> set2=new HashSet<>();
        set2.add(10);
        set2.add(10);
        set2.add(100);
        set2.add(90);
        Iterator<Integer> it=set2.iterator();
//        while(it.hasNext()){
//            int val=it.next();
//            System.out.println(val);
//
//        }
        List<Integer> l=new ArrayList<>();
        l.add(23);
        l.add(40);
        l.add(78);
        l.add(45);

        Iterator<Integer> it1=l.iterator();
        while(it1.hasNext()){
            int val=it1.next();
            if(val==40)
                it1.remove();
            else System.out.println(val);
        }

        //hasnext() return true if next return  a value instead of exception
        //next() return a value and moves to next value or pointer


    }
}
