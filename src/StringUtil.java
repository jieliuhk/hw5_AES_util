import java.util.Base64;

public class StringUtil {
    public static String encodeToString(byte[] input) {
        return Base64.getEncoder().encodeToString(input);
    }
}
