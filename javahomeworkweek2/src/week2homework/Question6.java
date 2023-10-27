package week2homework;
//6. Write a program to enter any radius value of the circle and find out the area. (Formula
//of Area A=PI*r*r).
public class Question6 {

    public static void main(String[] args) {

        int radius = 5;
        double totalradius = Math.PI * radius * radius;
        System.out.println("Total radius of a cirlce is: " +totalradius);
        System.out.println("Total radius of a cirlce is: " +circleRadius());

    }

    public static double circleRadius() {
        //public static double circleRadius;


        int radius = 5;
        double totalradius = Math.PI * radius * radius;

        return totalradius;
    }
}