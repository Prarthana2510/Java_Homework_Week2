package stringhomework;

//Write a java program which remove extra space from both side “ I love
//java ”
//Expected output: “I love java”

public class Question2 {
    public static void main(String[] args) {
        trim();
    }
    public static void trim(){

        String java = "   I love Java   ";
        System.out.println(java.trim());
    }
}
