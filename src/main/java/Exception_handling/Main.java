package Exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.*;
public class Main {
    private static final Logger logger=Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {

        //understanding logger functions
        logger.info("data is posted successfuly");
        logger.warning("data is being verified");

        //checked exceptions

//        Exception                (checked)
        //    ├── IOException          (checked)
        //    │   ├── FileNotFoundException
        //    │   └── EOFException
        //    ├── SQLException         (checked)
        //    ├── ParseException       (checked)
        //    ├── ClassNotFoundException (checked)
        //    ├── InterruptedException   (checked)

        // *** Filenotfoundexception
        //file genuinely not found
        try {
            FileReader reader = new FileReader("non_existing_file.txt");
        } catch (IOException e) {
            logger.info("Caught IOException: " + e);
            //System.out.println("Caught IOException: " + e);
        }
        //file is found
        try {
            FileReader reader = new FileReader("C:\\Users\\DELL\\Documents\\coreJava\\src\\main\\java\\Exception_handling_logs\\temp.txt");
        } catch (IOException e) {
            logger.info("Caught IOException: " + e);
            //System.out.println("Caught IOException: " + e);
        }
        // class not found exception
        try {
            Class.forName("Function_Interfaces.Audi");
            logger.info("class is found in directory");
        } catch (ClassNotFoundException e) {
            logger.info("Caught ClassNotFoundException: " + e.getMessage());
            //System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
        //class is found
        try {
            Class.forName("com.att");
            logger.info("class is found in directory");
        } catch (ClassNotFoundException e) {
            logger.info("Caught ClassNotFoundException: " + e.getMessage());
            //System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
        //when using multiple catch blocks always catch child exceptions first
        try {
            FileReader reader = new FileReader("non_existing_file.txt"); // code
        } catch (FileNotFoundException e1) {
            // specific
        } catch (IOException e) {
            // general
        }


//        logger.error("no data is there");

//            int[] arr1={10,7,-1,9};
//            int val=100/0+arr1[5];
//            arr1[5]=990;
//        System.out.println("this excutes afteer an array index issue occured");

//        try{
//            int[] arr={10,7,-1,9};
//            int val1=100/0+arr[5];
//            arr[5]=990;
//
//        }
//        catch(ArithmeticException e){
//            logger.info("got into arithemetic exception"+e);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            logger.info("");
//        }
//        catch(FileNotFoundException f)
//
//        catch(Exception e){
//            logger.info("got into Exception  class"+e);
//            System.out.println(e);
//        }
//
//        finally{
//            System.out.println("program executed successfully");
//        }
//        System.out.println("after try catch this get exceuted");

        //custom exceptions
        try {
            // Try to validate age
            AgeValidator.validateAge(15);
        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("Caught exception: " + e.getMessage());
        }

    }
}

