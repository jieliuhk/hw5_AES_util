import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class AES {
    private static SecretKeySpec secretKey;

    private static void setKey(String myKey) {
        byte[] key = myKey.getBytes();
        secretKey = new SecretKeySpec(key, "AES");
    }

    private static void setKey(byte[] myKey) {
        secretKey = new SecretKeySpec(myKey, "AES");
    }

    /**
     * Encrypt plaintext into cipher using AES/ECB
     *
     * @param strToEncrypt: plaintext need to be encrypt, human readable text like "hello"
     * @param key:          the key use to encrypt plaintext, can be any string
     * @return cipher text represented by byte array
     */
    public static byte[] encrypt(String strToEncrypt, String key) {
        try {
            setKey(key);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Encrypt plaintext into cipher using AES/ECB
     *
     * @param plaintext: plaintext need to be encrypt, binary sequence
     * @param key:       the key use to encrypt plaintext, binary sequence
     * @return cipher text represented by byte array
     */
    public static byte[] encrypt(byte[] plaintext, byte[] key) {
        try {
            setKey(key);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return cipher.doFinal(plaintext);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}