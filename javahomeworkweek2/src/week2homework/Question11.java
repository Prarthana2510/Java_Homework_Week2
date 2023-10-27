package week2homework;
// Question:  Write a Java program to compute the specified expressions
// and print the output.
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//Expected Output: 2.138888888888889

//11. Write a Java program to compute the specified expressions and print the output.
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//Expected Output: 2.138888888888889

public class Question11 {


    public static void main (String[] args){

        Question11 q11 = new Question11();
        q11.maths();
    }
    public void maths(){
        double calculation = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);
        System.out.println("Expected output: " + calculation);




    }

}
