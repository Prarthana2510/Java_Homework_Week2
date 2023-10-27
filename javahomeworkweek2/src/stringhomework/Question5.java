package stringhomework;

public class Question5 {


    //Write a java program to concat 2 string.
    //Expected output: I love java I dream java
    public static void main(String[] args) {
        Question5 q5 = new Question5();
        q5.concat();


    }
    public void concat(){
        String iLoveJava = "I love Java";
        String iDreamJava = "I dream Java";
        System.out.println(iLoveJava.concat(iDreamJava));


    }
}
