package week2homework;
//Question 2:
//2.0. Write a Java programme using the following steps.
//2.1 Declare two static variables.
//2.2 Declare one static method.
//2.3 Call both static variables into the static method inside the print statement.
//2.4 Declare the Main method.
//2.5 Call the static method into the Main method and run the programme.

//Write a Java programme using the following steps.
//2.1 Declare two static variables.
//2.2 Declare one static method.
//2.3 Call both static variables into the static method inside the print statement.
//2.4 Declare the Main method.
//2.5 Call the static method into the Main method and run the programme.
public class Question2 {

    static int staticintvariable1 = 100;
    static String staticStringvariable2 = "God bless";

    public static void main(String[] args){

        staticvariables();

    }
    public static void staticvariables(){

        System.out.println("First static int variable is: " + staticintvariable1);
        System.out.println("Second static String variable is: " + staticStringvariable2);
        System.out.println("Jwalant's code has run successfully without any error");


    }
}
