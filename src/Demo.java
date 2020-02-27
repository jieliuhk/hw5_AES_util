import java.util.Base64;

public class Demo {
    public static String MyHash(String input) {
        return "";
    }

    public static String getAESCipher(String plaintext) {
        String key = "12343212we321qwe";
        return AES.encrypt(plaintext, key);
    }

    public static void main(String[] args) {
        String input = "abcd";
        String res = getAESCipher(input);
        System.out.println("input String size: " + input.length());
        System.out.println("base64 byte size: " + Base64.getEncoder().encode(input.getBytes()).length);
        System.out.println("base64 String: " + StringUtil.encodeToString(input.getBytes()));
        System.out.println(Base64.getDecoder().decode(res).length);
        System.out.println(res);
    }
}
