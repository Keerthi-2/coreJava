package Exception_handling;

import java.util.logging.Logger;

public class Unchecked_exceptions {
    //      Throwable
//            │
//            ├── Error                     ❌ (serious issues like OutOfMemoryError)
//            │
//            └── Exception
//                └── RuntimeException      ✅ (unchecked)
//                    ├── NullPointerException
//                    ├── ArithmeticException
//                    ├── ArrayIndexOutOfBoundsException
//                    ├── NumberFormatException
//                    ├── ClassCastException
//                    ├── IllegalArgumentException
//                    │   └── IllegalStateException
//                    └── UnsupportedOperationException
    private static final Logger logger=Logger.getLogger(Main.class.getName());
        public static void main(String[] args) {

            // 1. NullPointerException
            try {
                String str = null;


                System.out.println(str.length());
            } catch (NullPointerException e) {
                logger.info("Caught NullPointerException: " + e.getMessage());
                //System.out.println("Caught NullPointerException: " + e.getMessage());
            }

            // 2. ArithmeticException
            try {
                int x = 10 / 0;
            } catch (ArithmeticException e) {
                logger.info("Caught ArithmeticException: " + e.getMessage());
               // System.out.println("Caught ArithmeticException: " + e.getMessage());
            }

            // 3. ArrayIndexOutOfBoundsException
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.info("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
               // System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            }

            // 4. NumberFormatException
            try {
                int num = Integer.parseInt("abc");
            } catch (NumberFormatException e) {
                logger.info("Caught NumberFormatException: " + e.getMessage());
               // System.out.println("Caught NumberFormatException: " + e.getMessage());
            }

            // 5. ClassCastException
            try {
                Object obj = new Integer(5);
                String s = (String) obj;
            } catch (ClassCastException e) {
                logger.info("Caught ClassCastException: " + e.getMessage());
               //System.out.println("Caught ClassCastException: " + e.getMessage());
            }

            // 6. IllegalArgumentException
            try {
                setAge(-3);
            } catch (IllegalArgumentException e) {
                logger.info("Caught IllegalArgumentException: " + e.getMessage());

            }

            // 7. UnsupportedOperationException
            try {
                java.util.List<String> fixedList = java.util.List.of("A", "B");
                fixedList.add("C");
            } catch (UnsupportedOperationException e) {
                logger.info("Caught UnsupportedOperationException: " + e.getMessage());

               // System.out.println("Caught UnsupportedOperationException: " + e.getMessage());
            }

            System.out.println("All unchecked exceptions handled.");
        }

        public static void setAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }


}
