package stringhomework;


//Write a java program which replace a “I love java” to “we love java”
//Expected output: We love java
public class Question3 {

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.replace();

    }
    public void replace(){
        String iJava = "I love java";
        String weJava = iJava.replace("I", "We");
        System.out.println("Original text: " + iJava);
        System.out.println("Replaced text: " + weJava);

    }
}
