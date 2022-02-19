package task4;


import java.util.InputMismatchException;
import java.util.Scanner;

public class task4 {
    private static Scanner scanner = new Scanner(System.in);
    private static final float BMI_MIN_RANGE = 28.5f;
    private static final float BMI_MAX_RANGE = 345f;


    public static void main(String[] args) {
        float weight = getWeightFromUser();
        int height = getHeightFromUser();
        float bmi = calculateBMI(weight, height);
        displayBmiResult(bmi);
    }

        private static float getWeightFromUser() {
            System.out.println("please insert weight in kg: ");
            float weight = 0;
            try {
                // logika_1
                weight = scanner.nextFloat();
            } catch (InputMismatchException ex) {
                // logika_2
                System.out.println("please insert only digits!");
                System.exit(1);
            }
            return weight;
        }

//        System.out.println("Please insert height in cm: ");
//        int height = scanner.nextInt();

        private static int getHeightFromUser() {
        System.out.println("please insert height in cm: ");
        int height = 0;
        try {
            height = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("please insert only integer digits!");
            System.exit(1);
        }
        return height;
    }

    private static float calculateBMI (float weight, int height) {
  //      float heightInMeter = (float) height / 100;
        float heightInMeter = height / 100f;
        return weight  / (heightInMeter * heightInMeter);
}

    private static void displayBmiResult(float bmi) {
    if (bmi < BMI_MIN_RANGE || bmi > BMI_MAX_RANGE) {
        System.out.println("BMI is incorrect: " + bmi);
    } else {
        System.out.println("BMI is correct: " + bmi);
    }
}

}
