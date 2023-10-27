package stringhomework;

//Question :Write a Java program print your full name on screen and then print your
//surname on a separate line.

public class Question1 {

    public static void main(String[] args) {
        name();
        Question1 q1 = new Question1();
        q1.surname();

    }
    public static void name(){
        String name = "Jay";
        System.out.println(name);

    }
    public void surname(){
        String surname = "Shah";
        System.out.println(surname);
    }
}
