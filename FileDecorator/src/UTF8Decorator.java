package FileDecorator.src;
import java.nio.charset.StandardCharsets;

public class UTF8Decorator extends DataSourceDecorator {

    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // Ensure data is properly encoded as UTF-8 bytes
        byte[] utf8Bytes = data.getBytes(StandardCharsets.UTF_8);
        super.writeData(new String(utf8Bytes, StandardCharsets.UTF_8));
    }

    @Override
    public String readData() {
        // Ensure data is properly decoded from UTF-8
        String data = super.readData();
        if (data == null) {
            return null;
        }
        return new String(data.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
    }
}