package Task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please insert first digit: ");
        int x = scanner.nextInt();


        System.out.print("please insert second digit: ");
        int y = scanner.nextInt();


        boolean pointA = methodForPointA(x, y);
        System.out.println("if x is greater than y: " + pointA);
  //      System.out.println("if x is greater than y: " + methodForPointA(x, y));

        boolean pointB = methodForPointB(x, y);
        System.out.println("if x * 3 is greater than y: " + pointB);

        boolean pointC = methodForPointC(x, y);
        System.out.println("if y++ is smaller than ++x and --x is smaller than y++: " + pointC);

        boolean pointD = methodForPointD(x, y);
        System.out.println("if x*y is even: " + pointD);


    }
    private static boolean methodForPointA(int x, int y) {
        return x > y;

    }
    private static boolean methodForPointB(int x, int y){
        return (x * 3) > y;
    }

    private static boolean methodForPointC(int x, int y) {
        return (y++ < ++x)  && (--x < y++);
    }

    private static boolean methodForPointD(int x, int y){
        return  (x * y) % 2 == 0;
    }
}
