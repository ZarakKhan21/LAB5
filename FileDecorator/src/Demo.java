package FileDecorator.src;

import FileDecorator.src.decorators.*;
import LAB.src.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("=== FILE DECORATOR DEMO ===");
        fileDecoratorDemo();
        
        System.out.println("\n=== SHAPE DECORATOR DEMO ===");
        shapeDecoratorDemo();
    }

    private static void fileDecoratorDemo() {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        
        DataSourceDecorator encoded = new CompressionDecorator(
            new EncryptionDecorator(
                new FileDataSource("OutputDemo.txt")));
        
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");
        
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }

    private static void shapeDecoratorDemo() {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("\nNormal shapes:");
        circle.draw();
        rectangle.draw();

        System.out.println("\nDecorated shapes:");
        redCircle.draw();
        redRectangle.draw();
    }
}