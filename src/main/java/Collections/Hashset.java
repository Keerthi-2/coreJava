package Collections;

import java.util.*;
public class Hashset {
    public static void main(String[] args){
        Set<String> s=new HashSet<>();
        s.add("keerthi");
        s.add("praneeth");
        s.add("keerthi");

        System.out.println(s.contains("keerthi"));
        System.out.println("size of hashset is :"+s.size()+"check if it contains data or not"+s.isEmpty());
        for(String setItems:s){
            System.out.println(setItems);
        }
        s.forEach(name-> System.out.println(name));

    }
}
