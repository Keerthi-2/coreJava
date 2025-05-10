package Comparator_practice;

import java.util.Comparator;

public class FoodItemComparator implements Comparator<FoodItem> {

    @Override
    public int compare(FoodItem o1, FoodItem o2) {

        if(o1.price>o2.price) return 1;
        else if(o1.price<o2.price) return -1;
        else return 0;
    }
}
