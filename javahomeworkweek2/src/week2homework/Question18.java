package week2homework;

//Write a Java Program using below steps.
//18.1 Declare your council name as static variables.
//18.2 Declare your house number as instance variables.
//18.3 Declare one instance method name borough() and call Static variable
//18.4 Declare static method name address() and call instance variable
//18.5 Call both user defined methods into main method.
public class Question18 {

    static String councilName = "London";
    int houseNumber = 5;

    public static void main(String[] args) {

        Question18 q18 = new Question18();
        q18.borough();
        address();

    }
    public void borough(){
        System.out.println("Council name is: " + councilName);

    }
    public static void address(){
        Question18 q18 = new Question18();
        System.out.println("House number is: " + q18.houseNumber);


    }

}
