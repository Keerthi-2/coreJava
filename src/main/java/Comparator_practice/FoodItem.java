package Comparator_practice;

import java.util.Comparator;

public class FoodItem {

    String name;
    int price;
    int rating;



    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }




    public FoodItem(String name, int price, int rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }


}
