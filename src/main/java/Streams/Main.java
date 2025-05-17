package Streams;
//project name capital -> package name lowercase -> classes,interfaces all are capital -> variables,methods are small
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//example to
public class Main {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(2);list.add(5);list.add(3);list.add(4);
        Stream<Integer> streams=list.stream();
//        streams.forEach(n-> System.out.println(n));
//        streams.forEach(n-> System.out.println(n));
  //streams can be used once
//        Long count=streams.count();
//        System.out.println("count of stream is :"+count);
//        //sorted will sort values
        Stream<Integer> stream2=streams.sorted();
       // stream2.forEach(n-> System.out.println(n));

        //map method
//        Stream<Integer> stream3=stream2.map(x->2*x);
//        stream3.forEach(n-> System.out.println(n))

        //filter method
//        Stream<Integer> stream4=stream2.filter(n->n%2==0);
//        stream4.forEach(n-> System.out.println(n));
        
        // 1 3  7 5  6 2  ans is 1 3 7 5   1  3  5   7  2  6 10 14
        //sort above numbers and then remove even numbers and double remaining values and print them
        List<Integer> list_practice= new ArrayList<>(Arrays.asList(1,3,7,5,6,2));
        //Stream<Integer> stream_practice=list_practice.stream().sorted().filter(x->(x%2!=0)).map(x->2*x);
        list_practice.stream().sorted().filter(x->(x%2!=0)).map(x->2*x).forEach(val-> System.out.println(val));


        Organization org1=new Organization("bread fin","banglore");
        Organization org2=new Organization("AT&T","hyderabad");
        Organization org3=new Organization("google","banglore");
        Organization org4=new Organization("microsoft","hyderabad");
        Organization org5=new Organization("zelis","pune");
        Organization org6=new Organization("walmart","chennai");
        Organization org7=new Organization("flipkart","banglore");
        Organization org8=new Organization("infosys","banglore");
        Organization org9=new Organization("experian","mumbai");


        List<Organization> organizations=new ArrayList<>();
        organizations.add(org1);organizations.add(org2);organizations.add(org3);organizations.add(org4);organizations.add(org5);
        organizations.add(org6);organizations.add(org7);organizations.add(org8);organizations.add(org9);

        //organizations.stream().filter(obj->obj.location=="banglore").forEach(org-> System.out.println(org.name.toUpperCase()));

        List<String> names= organizations.stream().filter(obj->obj.location=="banglore").map(obj->obj.name.toUpperCase()).collect(Collectors.toList());
       names.forEach(val-> System.out.println(val));
    }
}
