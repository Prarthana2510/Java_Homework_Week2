package week2homework;
//Qeustion 1:
//1. Write a Java programme using the following steps.
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and run the programme.

//Write a Java programme using the following steps.
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and run the programme.
public class Question1 {

    int instanceintVariable1 = 1;
    String instanceStringVariable2 = "bye bye";


    public static void main(String[] args) {

        Question1 answer = new Question1();

        answer.instanceMethod();



    }

    public void instanceMethod(){


        System.out.println("First instance int variable is: " + instanceintVariable1);
        System.out.println("Second instance String variable is: " + instanceStringVariable2);
        System.out.println("Jwalant's code has run successfully without any error");


    }
}
