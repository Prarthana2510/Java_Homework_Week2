package week2homework;


//Question 19.1 Declare one of your group member names as instance variable.
//19.2 Declare one of your group member names as static variable.
//19.3 Declare one instance method name with group name (e.g. selenium())and call both global
//variables.
//19.4 Declare static method name agile() and call both variable
//19.5 Call both user defined methods into main method.
//Note: Declare 1 local variables in all user defined method and main method and print in to statement
public class Question19 {

    String instanceName = "Rajvir";
    static String staticName = "Sumit";

    public static void main(String[] args) {
        Question19 q19 = new Question19();
        q19.restAssure();
        agile();
    }

    public void restAssure(){
        System.out.println("Instance name from instance method: " + instanceName);
        System.out.println("Static name instance method: " + staticName);

    }
    public static void agile(){
        Question19 q19 = new Question19();
        System.out.println("Instance name from static method: " + q19.instanceName);

        System.out.println("Static name from static method: " + staticName);

    }


}
