package podstawypro;

public class Task1 {
    public static void main(String[] args) {
 //       displayWordUsingDecimalFormat();
//        displayWordUsingHexFormat();
        displayWordUsingBinaryFormat();
    }

    private static void displayWordUsingDecimalFormat(){
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

    private static void displayWordUsingHexFormat(){
        char s = 0x53; // w kodzie 16 0x
        char d = 0x44;
        char a = 0x65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);


    }

    public static void displayWordUsingBinaryFormat() {
        char s = 0b01010011; // w binarnym 0b
        char d = 0b01000100	;
        char a = 0b01000001;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

    }

}
