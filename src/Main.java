import java.util.Scanner;

public class Main {
    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int SHIFT = 4;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please insert a string of characters : ");
        String s = scanner.nextLine();
        // the string to encode
        String toEncode = "";
        // the coded string
        String chainCode = "";
/******************************************* *******************************************/
// write your program in this between
/******************************************* *******************************************/
        System.out.format("the initial chain was : '%s'\n", s);
        if (toEncode.isEmpty()) {
            System.out.println("the string to encode is empty.\n");
        } else {
            System.out.format("the string to encode is : '%s'\n", toEncode);
            System.out.format("the coded string is : '%s'\n", chainCode);
        }
    }
}