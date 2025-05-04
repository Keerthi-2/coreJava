package Generics_wrappers;

public class Custom_generics<T>{
    T value;
    public void set(T value){
        this.value=value;
    }
    public T get(){
        return value;
    }


}
