package Generics_wrappers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void printlist(List<?> list){
        System.out.println(list);
    }
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(10);

       System.out.println(list);


        Custom_generics<String> customGenerics=new Custom_generics<>();
        customGenerics.set("ammo java");
        System.out.println(customGenerics.get());

        List<Integer> list1=new ArrayList<>();
        list1.add(2567);

        printlist(list1);




    }
}
