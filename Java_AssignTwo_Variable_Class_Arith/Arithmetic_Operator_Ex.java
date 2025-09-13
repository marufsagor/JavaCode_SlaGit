package Java_AssignTwo_Variable_Class_Arith;

import java.sql.SQLOutput;

public class Arithmetic_Operator_Ex {


    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        // Addition
        int sum = a + b;

        // Subtraction
        int difference = a - b;

        // Multiplication
        int product = a * b;

        // Division (integer division)
        int quotient = a / b;

        // Remainder (modulus)
        int remainder = a % b;

        // Print results
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}