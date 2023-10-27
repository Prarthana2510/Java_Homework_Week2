package week2homework;

//Question : 15. Write a Java program to convert a given string into lowercase.
//Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
//Output: the quick brown fox jumps over the lazy dog.
public class Question15 {

    public static void main(String[] args) {
        Question15 q15 = new Question15();
        q15.upperLower();
    }

    public void upperLower(){

        String upper = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        String upperTolower = upper.toLowerCase();
        System.out.println(upper);
        System.out.println("Uppercase to Lowercase is: " + upperTolower);
    }
}
