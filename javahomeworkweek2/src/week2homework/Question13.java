package week2homework;

//Question: Write a Java program to print the area and perimeter of a rectangle.
//Test Data:
//Width = 5.6 Height = 8.5
//Expected Output:
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20
public class Question13 {

    public static void main(String[] args) {
        Question13 q13 = new Question13();
        q13.perimeter();
    }

    public void perimeter(){

        double width = 5.6;
        double height = 8.5;
        double areaMultiply = width * height;
        double areaAddition = width + height;
        double perimeterSum = 2 * (areaAddition);
        System.out.println("Area is 5.6 * 8.5 = " + areaMultiply);
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = " + perimeterSum);

        //Area is 5.6 * 8.5 = 47.60
        //Perimeter is 2 * (5.6 + 8.5) = 28.20

    }
}
