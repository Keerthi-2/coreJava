package Comparator_practice;

import java.util.PriorityQueue;

public class Priority_queue {
    public static void main(String[] args){
        // PriorityQueue with custom comparator (ascending by number of factors)
        int[] arr={10,2,5,7,8};
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int fa = countFactors(a);
            int fb = countFactors(b);
            if (fa != fb) return fa - fb;  // fewer factors = higher priority
            return a - b; // if tie, smaller number first
        });

        for (int num : arr) {
            pq.add(num);
        }

        // Print in order
        while (!pq.isEmpty()) {
            int num = pq.poll();
            System.out.println(num + " → " + countFactors(num) + " factors");
        }
    }

    // Count number of factors of a number
    static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += (n / i == i) ? 1 : 2;
            }
        }
        return count;
    }

    }

