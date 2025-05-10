package Comparator_practice;

import java.util.*;

public class Main1 {
    // Helper method to count factors
    private static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count += (i * i == num) ? 1 : 2; // Handle perfect squares
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(9);

        Collections.sort(list1,(a,b)->{
            int factorsA = countFactors(a);
            int factorsB = countFactors(b);
            return factorsA == factorsB ? a - b : factorsA - factorsB;
        });
        System.out.println(list1);
        // Sort using lambda-based Comparator

    }
}
