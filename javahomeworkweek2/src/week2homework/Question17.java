package week2homework;

public class Question17 {

    // Question: Write a Java Program using below steps.
    //17.1 Declare your city as instance variables.
    //17.2 Declare your country as static variables.
    //17.3 Declare one instance method and call static variable in print statement
    //17.4 Declare static method and call instance variable in print Statement.
    //17.5 Call both user defined methods into main method.

    String city = "Instance city: Leicester";
    static String country = "Static country: UK";

    public static void main(String[] args) {
        Question17 q17 = new Question17();
        q17.instanceMethod();
        staticMethod();
    }

    public void instanceMethod(){

        System.out.println(country);
    }

    public static void staticMethod(){
        Question17 q17 = new Question17();
        System.out.println(q17.city);


    }
}

