package podstawypro.task7;

public class task7 {
    public static void main(String[] args) {
        int rangeFrom = Integer.parseInt(args[0]);
        int rangeTo = Integer.parseInt(args[1]);
        System.out.println("rangeFrom: " + rangeFrom);
        System.out.println("rangeTo: " + rangeTo);

        while( rangeFrom <= rangeTo) {
            if (rangeFrom % 2 == 0) {
                System.out.println(rangeFrom);
            }
            rangeFrom++;
        }
    }
}
