package Function_Interfaces;

@FunctionalInterface
public interface Car {

    public void drive();
//    public void learn();
    //we can have implementation for static and default methods in interface
    public  default void learn(){
        System.out.println();
    }
}
