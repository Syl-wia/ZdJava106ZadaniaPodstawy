package Task2;

import java.util.Scanner;

public class Task2 {
    private static final float PI = 3.14f;

    public static void main(String[] args) {
        float diameter = getDiameterFromUser();

        float circumference = calculateCircumferenceOfACircle(diameter);
        System.out.println("Circumference Of A Circle: " + circumference);

        float area = calculateCircumAreaOfACircle(diameter);
        System.out.println("Area Of A Circle");

    }

    private static float getDiameterFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        return scanner.nextFloat();

    }
    private static float calculateCircumferenceOfACircle(float diameter) {
        // 2 * PI * r -> pi *d
       // return PI * diameter;
        return (float) Math.PI * diameter;


    }
    private static float calculateCircumAreaOfACircle(float diameter){
        // pi * r ^ 2
        float radius = diameter / 2;
        return (float) Math.PI * radius * radius;
    }
}


