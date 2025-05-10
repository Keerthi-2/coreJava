package Comparator_practice;

import java.util.*;

public class Practice_comparator {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(37,42,64,71,89));
            //list before sorting
        System.out.println("list before sorting: "+list);
        //sort based on last digit in every number 71 42 64 37 89
        LastdigitComparator lastdigitComparator=new LastdigitComparator();
        Collections.sort(list,lastdigitComparator);
        System.out.println("after sorting: "+list);


        //number of factors ,employees sort based on their salary using tostring
        List<Integer> listfactors = new ArrayList<>(Arrays.asList(8,10,16,34,5));

        FactorComparator factorComparator = new FactorComparator();
        Collections.sort(listfactors,factorComparator);
        for(int i:listfactors)
        System.out.println(i+" its number of factors are "+factorComparator.factors(i));

        FoodItem food1 = new FoodItem("pizza",280,4);
        FoodItem food2 = new FoodItem("dosa",40,3);
        FoodItem food3= new FoodItem("burger", 300,3);
        FoodItem food4 = new FoodItem("biryani",250,6);
        FoodItem food5 = new FoodItem("idli",20,8);
        List<FoodItem> fooditems=new ArrayList<>();
        fooditems.add(food1);
        fooditems.add(food2);fooditems.add(food3);fooditems.add(food4);fooditems.add(food5);

        FoodItemComparator fooditemcomp = new FoodItemComparator();

        Collections.sort(fooditems,fooditemcomp);

        System.out.println(fooditems);


        PriorityQueue<FoodItem> priorityQueue = new PriorityQueue<>(fooditemcomp);
        priorityQueue.add(food1);
        priorityQueue.add(food2);priorityQueue.add(food3);priorityQueue.add(food4);priorityQueue.add(food5);

        System.out.println("using priority queue for employee class sort based on price: ");
        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>(factorComparator);
        pq.add(100);pq.add(150);pq.add(134);pq.add(98);
        System.out.println("using priority queue for factors: ");
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        //list of array of size 2   [1,2] [5,6] [4,3] [10,7]   [1,2] [4,3] [5,6] [10,7]

       int[] arr1={1,2};
        int[] arr2={5,6};
        int[] arr3={4,3};
        int[] arr4={10,7};
        List<int[]> lis= new ArrayList<>();
        lis.add(arr1);lis.add(arr2);lis.add(arr3);lis.add(arr4);
        PriorityQueue<int[]> twodpq=new PriorityQueue<>((a,b)->{
            if(a[1]>b[1]) return 1;
            else if(a[1]<b[1]) return -1;
            return 0;

        });
        twodpq.add(arr1);twodpq.add(arr2);twodpq.add(arr3);twodpq.add(arr4);
        System.out.println("priority queue two sort based on second value in a list");
        while(!twodpq.isEmpty()){
            int[] arr=twodpq.poll();
            System.out.println(arr[0]+" "+arr[1]);
        }
        //we use foreach loop class objects not to normal arrays
        //comparable is skipped for now as we dont use it much












    }

}
