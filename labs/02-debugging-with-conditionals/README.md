# Debugging Lab - Homework Assignment

## Objective

The purpose of this assignment is to familiarize you with debugging techniques in IntelliJ IDEA. You will practice identifying and fixing common errors in Java programs using breakpoints, conditional breakpoints, and exception handling.

---

## Part 1: Fixing a Division by Zero Error

### Problem

You are given the following Java code, which contains a bug that causes a division by zero:

```java
class ExceptionDebugging {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = num1 / num2;  // This will cause an ArithmeticException
    }
}
```
Run the Program:

1. Run the program and observe the error message: ArithmeticException: / by zero.

Set a Breakpoint:

2. Open IntelliJ IDEA and set a breakpoint on the line int result = num1 / num2;.

Debug the Program:

3. Run the program in Debug mode to inspect the values of num1 and num2.

4. Fix the Error



## Question 2: Identifying and Fixing an Array Index Bug

### Problem

The following Java code contains a bug that causes an `ArrayIndexOutOfBoundsException`. The goal is to identify the issue using conditional breakpoints and fix it.

```java
class LoopBug {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 0, 16, 17, 18, 19, 20};
        int numerator = 40;

        for (int i = 0; i <= numbers.length; i++) { 
            System.out.println(numerator / numbers[i]);  
        }
    }
}
```

