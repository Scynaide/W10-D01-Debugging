package Debugging;

public class ExceptionDebugging {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2;  // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } finally {
            System.out.println("This is example of the ArithmeticException");
        }
    }
}
