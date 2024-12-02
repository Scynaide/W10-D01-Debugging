package Debugging;

public class LoopBug {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 0, 16, 17, 18, 19, 20};
        int numerator = 40;
        int result;

        for (int i = 0; i <= numbers.length; i++) {
            try { // Error
                result = numerator / numbers[i];
            } catch (ArithmeticException e) {
                break;
            }

            System.out.println(result);
            System.out.println(numerator / numbers[i]);
        }
    }
}
