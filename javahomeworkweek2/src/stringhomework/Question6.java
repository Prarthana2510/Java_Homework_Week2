package stringhomework;

//Write a java program which replace a “I@love@java” to “we love java”
//Expected output: We love java
public class Question6 {



    public static void main(String[] args) {
        Question6 q6 = new Question6();
        q6.replace();



    }
    public void replace(){
        String iLoveJava = "I@love@Java";
        String weLoveJava1 = iLoveJava.replace("I@", "We ");
        String weLoveJava2 = weLoveJava1.replace("e@J", "e J");
        System.out.println(weLoveJava2);


    }
}
