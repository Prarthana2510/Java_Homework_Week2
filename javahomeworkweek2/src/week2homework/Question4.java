package week2homework;
//Question 3:
//Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.

//Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.
public class Question4 {

    String instanceVariable1 = "I am first instance variable";
    String instanceVariable2 = "I am second instance variable";
    static String staticVariable1 = "I am first static variable";
    static String staticVariable2 = "I am second static variable";

    public static void main(String[] args) {

        Question4 q3 = new Question4();
        q3.instanceMethod();
        staticMethod();

    }

    public void instanceMethod(){

        System.out.println("Instance method instance variable is: " + instanceVariable1);
        System.out.println("Instance method instance variable is: " + instanceVariable2);
        System.out.println("Instance method static variable is: " + staticVariable1);
        System.out.println("Instance method static variable is: " + staticVariable2);
        System.out.println("End of instance method");

    }

    public static void staticMethod(){
        Question4 q3 = new Question4();
        System.out.println("Static method instance variable is: " + q3.instanceVariable1);
        System.out.println("Static method instance variable is: " + q3.instanceVariable2);
        System.out.println("Static method static variable is: " + staticVariable1);
        System.out.println("Instance method static variable is: " + staticVariable2);
        System.out.println("End of static method");

    }

}
