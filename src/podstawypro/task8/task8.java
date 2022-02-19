package podstawypro.task8;

public class task8 {
    public static void main(String[] args) {
        int rangeTo = 15;
        System.out.println("Range from 0 to " + rangeTo);
        for(int i = 0; i <= rangeTo; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    private static String fizzBuzz(int i) {
        // przez 3 to Fizz
        // przez 5 to Buzz
        // przez 3 i 5 to FizzBuzz
        // inne to i
        if(i % 15 == 0)  { // (i % 3 == 0 && i % 5 == 0) // (i % 15 == 0)
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);

    }
}
