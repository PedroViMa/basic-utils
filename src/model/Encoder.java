import java.util.Base64;
import java.util.Scanner;

public class Encoder {

    static private String message;

    public static void encodeBase64() {
        consoleValues(1);
        byte[] encodedBytes = Base64.getEncoder().encode(message.getBytes());
        System.out.println("Encoded message: " + new String(encodedBytes));
    }

    public static void decodeBase64() {
        consoleValues(2);
        byte[] decodedBytes = Base64.getDecoder().decode(message);
        System.out.println("Decoded message: " + new String(decodedBytes));
    }

    private static void consoleValues(int opt) {
        Scanner scan = new Scanner(System.in);
        if (opt == 1) {
            System.out.println("Enter the message to encrypt: ");
        } else if (opt == 2) {
            System.out.println("Enter the message to decrypt: ");
        }
        message = scan.nextLine();
    }

}
