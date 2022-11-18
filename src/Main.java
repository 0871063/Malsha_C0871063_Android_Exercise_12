import java.util.Scanner;

public class Main {
    static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final int SHIFT = 4;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please insert a string of characters : ");
        String s = scanner.nextLine();
        // the string to encode
        String toEncode = "";
        // the coded string
        String chainCode = "";

        toEncode = s.replaceAll("[^a-zA-Z ]","");
        chainCode = getChainCode(toEncode);

        System.out.format("The initial chain was : '%s'\n", s);
        if (toEncode.isEmpty()) {
            System.out.println("The string to encode is empty.\n");
        } else {

            System.out.format("The string to encode is : '%s'\n", toEncode);
            System.out.format("The coded string is : '%s'\n", chainCode);
        }
    }

    static String getChainCode(String message){

        String cipherText = "" ;
        for (int i = 0; i < message.length(); i++) {
            String character = Character.toString(message.charAt(i));
            if (alphabet.contains(character)) {
                int charPosition = alphabet.indexOf(message.charAt(i));
                int keyVal = (SHIFT + charPosition) % 26;
                char replaceVal = alphabet.charAt(keyVal);
                cipherText += replaceVal;
            }else if (ALPHABET.contains(character)) {
                int charPosition = ALPHABET.indexOf(message.charAt(i));
                int keyVal = (SHIFT + charPosition) % 26;
                char replaceVal = ALPHABET.charAt(keyVal);
                cipherText += replaceVal;
            } else {
                cipherText += " ";
            }
        }
        return cipherText;
    }
}