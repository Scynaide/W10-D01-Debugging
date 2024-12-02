import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 =5;

        int result = num1/num2;
        System.out.println(result);

        divideTwoNumbers(10,0);



        try{
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        }
//        catch(ArithmeticException e){
//            System.out.println("Arithmatic exception / 0");
//        }


//        any runtime exception will not stop my code from running
//        compile time exceptions will stop my code from running upon compile time

        try{
            BufferedReader br = new BufferedReader(new FileReader("marcel.txt"));

        }catch(FileNotFoundException e){
            System.out.println("Exception while reading from file");
        }

        System.out.println("After try catch block");

//        throw new RuntimeException("issue with the code somewhere");



    }

    public static void divideTwoNumbers(int num1 , int num2){
        System.out.println(num1);
        System.out.println(num2);

        System.out.println(num1/num2);
    }

}



