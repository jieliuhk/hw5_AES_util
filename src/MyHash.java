import java.util.Base64;

public class MyHash {
    public static String getHash(String input) {
        //TODO: implement this
        return "";
    }

    public static byte[] getAESCipher(String plaintext) {
        String key = "12343212we321qwe";
        return AES.encrypt(plaintext, key);
    }

    public static void main(String[] args) {
        String input = "hello world";
        byte[] res = getAESCipher(input);
        System.out.println("input String size: " + input.length());
        System.out.println("base64 byte size: " + Base64.getEncoder().encode(input.getBytes()).length);
        System.out.println("base64 String: " + StringUtil.encodeToString(input.getBytes()));
        System.out.println(res.length);
        System.out.println(StringUtil.encodeToString(res));
    }
}
