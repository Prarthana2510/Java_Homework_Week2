package week2homework;
//Question 7:
//Write a program to insert any temperature value in degree Fahrenheit
// and convert to degree Celsius ((F-32)X5/9=0C).
//Haven't learnt scanner class yet//
// Write a program to insert any temperature value in degree Fahrenheit and convert
//to degree Celsius ((F − 32) × 5/9 = 0°C).
public class Question7 {
    public static void main(String[] args) {
        Question7 q7 = new Question7();
        q7.farenheitToCelsius();

    }

public void farenheitToCelsius(){

        int f = 99;
        double formula = (f-32) * 5 / 9;
        String message = "99 Farenheit to Celsius is: ";
    System.out.println(message + formula);
}
}
