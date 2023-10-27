package week2homework;


//Declare your Spain as static variable.
//20.2 Declare your United Kingdom as instance variable.
//20.3 Declare instance method name homeCountry()and call static variable.
//20.4 Declare static method name holidays() and call instance variable
//20.5 Call both methods in main method.
public class Question20 {

    static String spain = "Spain";
    String unitedKingdom = "United Kingdom";

    public static void main(String[] args) {
        Question20 q20 = new Question20();
        q20.homeCountry();
        holidays();

    }
public void homeCountry(){
    System.out.println("Static variable from instance method: " + spain);

}
public static void holidays(){
    Question20 q20 = new Question20();
    System.out.println("Instance variable from static method: " + q20.unitedKingdom);

}


}