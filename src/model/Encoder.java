import java.util.Base64;

public class Encoder {

    public static void encodeBase64(String message) {
        byte[] encodedBytes = Base64.getEncoder().encode(message.getBytes());
        System.out.println("Encoded message " + new String(encodedBytes));
    }

    public static void decodeBase64(String message) {
        byte[] decodedBytes = Base64.getDecoder().decode(message);
        System.out.println("Decoded message " + new String(decodedBytes));
    }

}
