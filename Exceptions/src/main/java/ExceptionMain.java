public class ExceptionMain {

    public static void checkAge(int age) {

        if (age < 21) {

            // Using the "throws" keyword allows you to throw a specific error
            throw new ArithmeticException("Access Denied - You must be 21 or older.");

        } else {
            System.out.println("Access Granted - You are of age.");
        }


    }








    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4};

        // Will cause an ArrayIndexOutOfBoundsException because this array does not have 8+ values
        // System.out.println(intArray[7]);


        try {
            System.out.println(intArray[7]);
        } catch (Exception e) {
            System.out.println("This is our catch block - this was the error : " + e);
        } finally {
            System.out.println("Code in our 'finally' block will execute anyways.");
        }

        // checkAge(17);

        try {
            checkAge(15);
        } catch (Exception e){
            System.out.println("Still used the catch block to catch the exception we threw.");
        }
    }



}