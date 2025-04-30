package FileDecorator.src;

public interface DataSource {
    void writeData(String data);

    String readData();
}