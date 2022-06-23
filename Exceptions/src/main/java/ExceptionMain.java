import com.customException.MyCustomException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain {

    public static void checkAge(int age) {

        if (age < 21) {

            // Using the "throws" keyword allows you to throw a specific error
            throw new ArithmeticException("Access Denied - You must be 21 or older.");

        } else {
            System.out.println("Access Granted - You are of age.");
        }


    }

    public static void useCustomException(String name) throws MyCustomException {
        if (name.length() < 2) {
            throw new MyCustomException("Name has to have more than one letter.");
        }
    }

    public static String useIOResource() throws Exception {

        BufferedReader br = null;

        String userInput = "";

        br = new BufferedReader(new InputStreamReader(System.in));
        userInput = br.readLine();

        return "Hello " + userInput;
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

        checkAge(22);

        try {
            checkAge(17);
        } catch (NullPointerException | ArithmeticException | IndexOutOfBoundsException e){
            System.out.println("Still used the catch block to catch the exception we threw.");
        }

        // Handling the custom exception
        try {
            useCustomException("i");
        } catch (MyCustomException mce) {
            System.out.println(mce.getMessage());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* readLine() is marked to say it 'throws' an IO Exception,
        which is why it puts a red line under the method */
//        String input = br.readLine();
//        System.out.println(input.length());
//        br.close();
//
//        br.reset();
//        String input2 = br.readLine();
//        System.out.println(input2);

        // Println for input into console
        System.out.println("What is your name?");

        // Where we handle the IOResource
        try {
            System.out.println(useIOResource());
        } catch (Exception e) {

        }
    }



}