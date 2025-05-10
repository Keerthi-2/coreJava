package Comparator_practice;

import java.util.Comparator;

public class LastdigitComparator implements Comparator<Integer> {

    //if o1>o2 -decreasing order == o1==o2
    @Override
    public int compare(Integer o1, Integer o2) {

        int d1=o1%10;
        int d2=o2%10;

        //7 6  6 7
        if((o1%10)>(o2%10)) return 1;  // 1 2 3 4 - increasing order swaps values if there are in descending order
        else if((o1%10)<(o2%10)){
            return -1;
        }
        else return 0;
    }
}
