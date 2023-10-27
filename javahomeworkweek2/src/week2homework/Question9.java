package week2homework;


//
//Write a program to convert the upper case to lower case.
public class Question9 {



    public static void main(String[] args) {

        Question9 q9 = new Question9();
        q9.upperToLower();


    }

    public void upperToLower(){
        String upper = "MY NAME IS JAY";
      String upperLower = upper.toLowerCase();
        System.out.println(upper);
        System.out.println("Uppercase to lower case is: " + upperLower);

    }
}
