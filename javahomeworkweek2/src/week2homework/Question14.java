package week2homework;

//Question: Write a Java program to print the sum (addition), multiply, subtract, divide and
//remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output:
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5
public class Question14 {

    public static void main (String[] args){

        calculate();
    }

    public static void calculate(){

        int a = 125;
        int b = 24;

        int add = a + b;
        int subtract = a-b;
        int multiply = a * b;
        int divide = a / b;
        int remainder = a % b;

        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + subtract);
        System.out.println(a + " * " + b + " = " + multiply);
        System.out.println(a + " / " + b + " = " + divide);
        System.out.println(a + " % " + b + " = " + remainder);


    }
}
