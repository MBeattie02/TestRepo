import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class CryptoExample {

    public void insecureEncryptionMethod() {
        String algorithm = "DES"; // Weak algorithm
        byte[] keyBytes = new byte[]{0x01, 0x23, 0x45, 0x67, (byte) 0x89, (byte) 0xab, (byte) 0xcd, (byte) 0xef};
        Key key = new SecretKeySpec(keyBytes, algorithm);
        Cipher cipher = Cipher.getInstance(algorithm);
        // ... encryption operations ...
    }

    public void hardcodedKeyMethod() {
        String hardcodedKey = "1234567890abcdef"; // Example of a hardcoded key
        // ... operations using the hardcoded key ...
    }
}
