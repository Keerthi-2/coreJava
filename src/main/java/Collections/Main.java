package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args){

        //hashmap functions practice
        Map<Integer,String> countryCode=new HashMap<>();
        countryCode.put(1,"India");
        countryCode.put(2,"Australia");
        countryCode.put(3,"America");
        countryCode.put(4,"China");
        System.out.println(countryCode.get(3));
        System.out.println(countryCode.getOrDefault(5,"not found null"));
        System.out.println(countryCode.containsKey(3));

        for(Map.Entry<Integer,String> code:countryCode.entrySet()){
            System.out.println(code.getKey()+"||"+code.getValue());


        }


        countryCode.remove(3);
        for(Integer key:countryCode.keySet()){
            if(countryCode.get(key)=="India")
                System.out.println("it is a powerful union");
            System.out.println("key is: "+key+",value: "+countryCode.get(key));
        }




    }
}
