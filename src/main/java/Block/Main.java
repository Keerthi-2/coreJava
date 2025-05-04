package Block;

/*
Class Scope (Instance Scope and Static Scope) - variables decalred inside class but outside any methods,constructor or blocks.
They are called instance variables because they belong to an instance of the class.

Static Variables: These are variables declared with the static keyword inside a class. They are shared across all instances of the class.
 they can be used throught the program in static blocks.

  Method (Local) variables:
Local variables are declared within a method, constructor, or block. Their scope is limited to the method, constructor, or block in which they are defined.

 Block Scope variables:
Variables defined inside blocks (such as if-statements, loops, or inner blocks) have block scope

 Global Scope (or Package Scope)
This scope is for variables that are accessible across multiple classes, typically in the same package.If you declare a variable with default access (i.e., no public, protected, or private modifier) in a class, it can be accessed by other classes in the same package.

 Instance vs Local Variable Shadowing
Sometimes, a local variable (e.g., inside a method) might have the same name as an instance variable. In this case, the local variable will shadow the instance variable, meaning it hides the instance variable within that method's scope.
 */

public class Main {
   static int k=10;
    public static void main(String[] args){
        int b=20;
        {
            int a=10;
        }
        k=30;
       int  a=30;
        {
            a=3838;
            b=30;
        }
        int i=0;
        for(i=0;i<5;i++){

        }
        System.out.println(i);

    }
}
