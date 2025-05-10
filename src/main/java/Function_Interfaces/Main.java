package Function_Interfaces;

public class Main {
    public static void main(String[] args){
        //interface is used define behaviour of class.A class implements interface and defines logic inside functions.
        //interface provide abstraction where there is no body and it will be used for multiple inheritance in java

        Car car=new Audi();
        car.drive();
        //ANonymous inner class (allocation of memory to the interface )

        //function interface means it has only one abstract method and so that we dont function name as we have below . just need lambda function
        Car car1 = ()->

            {
                System.out.println("driving car in anyonymous(interface implemenation) with ");
            };
//            public void learn(){
//                System.out.println("learning car in easy way");
//            }

        car1.drive();
//        car1.learn();
        System.out.println(car+"  "+car1);
        //functional interface has only one abstarct method


    }
}


