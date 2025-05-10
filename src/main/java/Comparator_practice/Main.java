package Comparator_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;


public class Main {

    public  static void main(String[] args){

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(900);
        list.add(80);
        //learning compartor
        FactorComparator factorcomparator= new FactorComparator();
        Collections.sort(list,factorcomparator);
        System.out.println(list);



        //comparator is used in heaps,priority queue

    }
}
