package task6;

public class task6 {
    public static void main(String[] args) {
        printMultiplicationTable(6,2,5);

    }

    private static void printMultiplicationTable(int multiplier, int minMuliplicand, int maxMultiplicand){
        // for (;;)
  //      for(; minMuliplicand <= maxMultiplicand; minMuliplicand++) {
  //          int result = multiplier * minMuliplicand;
  //          System.out.println(multiplier + " * " + minMuliplicand + " = " + result);
  //      }

        while(minMuliplicand <= maxMultiplicand){
            int result = multiplier * minMuliplicand; // 6* 2 = 12
            System.out.println(multiplier + " * " + minMuliplicand + " = " + result);
            minMuliplicand++; // 3

            }
        }

}
