package Collections;
import java.util.*;
public class Arraylist {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(1748490);
        list.add(20);
        list.add(4000);
        list.add(100);
        //list interface doesn't have add or remove functions just have set functions
       /* You're creating a new dynamic list (Java's regular java.util.ArrayList) that allows:

       Adding

        Removing
        Resizing*/
        List<Integer> l=(Arrays.asList(10,20,30));
        System.out.println("aslist usage"+l);
        System.out.println(list);
        for(Integer i:list)
            System.out.print(i+"--");

        for(int i=0;i<list.size();i++)
            System.out.println(list.indexOf(20));
        Collections.sort(list);
        list.remove(2);
        list.forEach(val->System.out.println(val));


        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> array1=new ArrayList<>();
        array1.add(10);
        array1.add(20);
        array1.add(40);
        matrix.add(array1);
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.get(i).size();j++) {
                System.out.print(matrix.get(i).get(j) + "&&");
            }
            System.out.println();
        }
        for(List<Integer> arr:matrix){
            for(int val:arr)
                System.out.println(val+"(())");
        }
        List<Employee> employees=new ArrayList<>();
        Employee employee1=new Employee(15,"engineer","keerthi");
        Employee employee2=new Employee(30,"associate engineer","ashok");
        Employee employee3=new Employee(15,"deevlopeer","manasa");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.remove(0);
        employees.forEach(val-> System.out.println(val.name+" "+val.age+" "+val.designation));

        for(Employee employee:employees){
            System.out.println(employee.name+"  "+employee.age+"  "+employee.designation);
        }

        for(int i=0;i<employees.size();i++)
            System.out.println(employees.get(i).name+"  "+employees.get(i).age+"  "+employees.get(i).designation);


        //iterator for arraylist
        List<String> listiterator = new ArrayList<>();
        listiterator.add("Java");
        listiterator.add("Python");
        listiterator.add("C++");

        // Create an Iterator for the ArrayList
        Iterator<String> iterator = listiterator.iterator();

        // Use iterator to traverse the list
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //iterator for hashset,arraylist and queue,stack

    }

}


