package week2homework;

//Write a program for a calculator with addition, subtraction, multiplication, and division
//methods all with parameters and use string concatenation methods. (Note: Two static
//and Two instance methods.)
public class Question5 {



        public static void main (String[] args){

            Question5 question5 = new Question5();
            int num1 = 6;
            int num2 = 3;
            System.out.println(Question5.add(num1, num2));
            System.out.println(Question5.subtract(num1, num2));
            System.out.println(question5.multiply(num1, num2));
            System.out.println(question5.divide(num1, num2));
    }

    public static String add (int num1, int num2){

        return "Result of addition: " + (num1 + num2);
    }

    public static String subtract (int num1, int num2){

        return "Result of subtraction: " + (num1 - num2);
    }

    public String multiply (int num1, int num2){

            return "Result of multiplication is: " + (num1 * num2);
    }

    public String divide (int num1, int num2) {

        return "Result of division is: " + (num1 / num2);
    }
}
