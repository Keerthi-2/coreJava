package Comparator_practice;

import java.util.Comparator;

public class FactorComparator implements Comparator<Integer> {


    public  int factors(int num) {
        int ans = 2;
        for (int i = 2; i < num; i++) {
            if (num%i==0)
                ans+=1;
        }
        return ans;
    }
    @Override
    public int compare(Integer o1, Integer o2) {
        int factorsA=factors(o1);
        int factorsB=factors(o2);
        return factorsA==factorsB?o1-o2:factorsA-factorsB;
    }
}
