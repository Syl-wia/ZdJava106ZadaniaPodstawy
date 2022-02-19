package task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();

        System.out.print("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        int sumOfSequance = sumOfSequance(firstDigit, secondDigit);
        System.out.println("sum: " + sumOfSequance);
    }

    private static int sumOfSequance(int firstDigit, int secondDigit) {
        // return -1;
        // zamiana miejscami
        if(firstDigit > secondDigit){
            int tmp  = firstDigit;
          firstDigit = secondDigit;
          secondDigit = tmp;
        }
        int sum = 0;
//        while(firstDigit <= secondDigit){
//            sum += firstDigit; // sum = sum +firstDigit
//            firstDigit++;
        do {
            sum += firstDigit; // sum = sum +firstDigit
            firstDigit++;
        } while (firstDigit <= secondDigit);
        return sum;
    }
}
