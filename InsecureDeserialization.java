import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;

public class InsecureDeserialization {

    public Object deserialize(byte[] data) throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            // This line could potentially lead to insecure deserialization
            return ois.readObject();
        }
    }

    // Other methods...
}
