package week2homework;
//Question 3:
//Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the pro
//Question:
//Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.
public class Question3 {

    String instanceVariable = "I am instance variable";
    static String staticVariable = "I am static variable";

    public static void main(String[] args) {

        Question3 q3 = new Question3();
        q3.instanceMethod();
        staticMethod();
    }

    public void instanceMethod(){

        System.out.println("Instance method instance variable is: " + instanceVariable);
        System.out.println("Instance method static variable is: " + staticVariable);
        System.out.println("End of instance method");

    }

    public static void staticMethod(){
        Question3 q3 = new Question3();
        System.out.println("Static method instance variable is: " + q3.instanceVariable);
        System.out.println("Static method static variable is: " + staticVariable);
        System.out.println("End of static method");

    }

}
