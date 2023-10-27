package week2homework;
//Question: Write a Java program that takes three numbers as input to
// calculate and print the
//average of the numbers.
public class Question12 {

    public static void main(String[] args) {

        Question12 q12 = new Question12();
        q12.averageNumbers();

    }

    public void averageNumbers(){

        int num1 = 2;
        int num2 = 3;
        int num3= 5;
        int average = (num1 + num2 + num3) / 3;
        System.out.println("The average number of 2 + 3 + 5 is: " + average);
    }




}
